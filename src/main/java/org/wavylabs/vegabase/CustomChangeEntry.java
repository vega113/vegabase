package org.wavylabs.vegabase;

import java.util.function.Function;

public class CustomChangeEntry implements ChangeEntry {

	private final ChangeDetails changeDetails;
	private final Function<Boolean, Boolean> func;
	
	public CustomChangeEntry(ChangeDetails changeDetails,
			Function<Boolean, Boolean> func) {
		this.changeDetails = changeDetails;
		this.func = func;
	}

	public ChangeDetails getChangeDetails() {
		return changeDetails;
	}

	public Function<Boolean, Boolean> getFunc() {
		return func;
	}
}
