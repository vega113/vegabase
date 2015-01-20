package org.wavylabs.vegabase;

import java.time.Instant;
import java.util.List;

public class AppliedChangesDoc {
	private final List<AppliedChangeEntry> appliedChanges;
	private final Instant lastUpdated;
	public AppliedChangesDoc(List<AppliedChangeEntry> appliedChanges,
			Instant lastUpdated) {
		super();
		this.appliedChanges = appliedChanges;
		this.lastUpdated = lastUpdated;
	}
	public List<AppliedChangeEntry> getAppliedChanges() {
		return appliedChanges;
	}
	public Instant getLastUpdated() {
		return lastUpdated;
	}
	@Override
	public String toString() {
		return "AppliedChangesDoc [appliedChanges=" + appliedChanges
				+ ", lastUpdated=" + lastUpdated + "]";
	}
}
