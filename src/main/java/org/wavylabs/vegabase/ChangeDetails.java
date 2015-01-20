package org.wavylabs.vegabase;

public class ChangeDetails {
	private final String id;
	private final String author;
	private final String description;
	
	public ChangeDetails(String id, String author, String description) {
		this.id = id;
		this.author = author;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public String getDescription() {
		return description;
	}
}
