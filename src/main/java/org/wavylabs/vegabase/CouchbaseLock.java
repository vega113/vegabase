package org.wavylabs.vegabase;

import java.util.function.Function;

import com.couchbase.client.java.document.Document;

public interface CouchbaseLock<D extends Document<?>> {
	D runUnderLock(String lockKey, String docKey, D defaultDoc, Function<D, D> func);
}
