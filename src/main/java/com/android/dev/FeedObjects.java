package com.android.dev;

public class FeedObjects {

	private String title;
	private String description;

	public FeedObjects(Builder builder) {
		this.title = builder.title;
		this.description = builder.description;
	}

	public static class Builder {

		private String title;
		private String description;

		public Builder title(String title) {

			this.title = title;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public FeedObjects build() {
			return new FeedObjects(this);
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}