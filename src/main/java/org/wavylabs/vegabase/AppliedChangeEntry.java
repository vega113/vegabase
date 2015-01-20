package org.wavylabs.vegabase;

import java.time.Instant;


public class AppliedChangeEntry implements ChangeEntry {
	private final ChangeDetails changeDetails;
	private final Instant firstApplied;
	private final Instant lastApplied;
	
	public AppliedChangeEntry(ChangeDetails changeDetails,
			Instant firstApplied, Instant lastApplied) {
		this.changeDetails = changeDetails;
		this.firstApplied = firstApplied;
		this.lastApplied = lastApplied;
	}

	public ChangeDetails getChangeDetails() {
		return changeDetails;
	}

	public Instant getFirstApplied() {
		return firstApplied;
	}

	public Instant getLastApplied() {
		return lastApplied;
	}

	@Override
	public String toString() {
		return "AppliedChangeEntry [changeDetails=" + changeDetails
				+ ", firstApplied=" + firstApplied + ", lastApplied="
				+ lastApplied + "]";
	}
}
