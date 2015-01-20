package org.wavylabs.vegabase;

import java.util.function.Function;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.Document;
import com.couchbase.client.java.document.JsonStringDocument;

public class CouchbaseLockImpl<D extends Document<?>> implements CouchbaseLock<D> {
	
	private final Bucket bucket;
	
	public CouchbaseLockImpl(Bucket bucket) {
		this.bucket = bucket;
	}

	@Override
	public D runUnderLock(String lockKey, String docKey, D defaultDoc,
			Function<D, D> func) {
		JsonStringDocument lockDocument = JsonStringDocument.create(lockKey, "Lock Document");
		bucket.insert(lockDocument);
		bucket.getAndLock(lockDocument, 30);
		D docFromDb = bucket.get(defaultDoc);
		D out;
		try {
			if (docFromDb != null) {
				out = func.apply(docFromDb);
			} else {
				out = func.apply(defaultDoc);
			}
		} finally {
			bucket.unlock(lockDocument);
		}
		return out;
	}
}
