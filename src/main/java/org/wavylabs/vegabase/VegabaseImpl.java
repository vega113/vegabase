package org.wavylabs.vegabase;

import java.util.List;

import com.couchbase.client.java.document.Document;

public class VegabaseImpl implements Vegabase {
	
	private final CouchbaseLock<Document<AppliedChangesDocument>> lock;
	

	public VegabaseImpl(CouchbaseLock lock) {
		this.lock = lock;
	}


	@Override
	public void applyChanges(List<ChangeEntry> changes) {
		// TODO Auto-generated method stub
		
	}

}
