package com.yash;

public class CreateFeedbackInput {

	private String username;
    private String source;
    private Integer rating;
    private String comment;
    
    public CreateFeedbackInput() {
		// TODO Auto-generated constructor stub
	}
    
	public CreateFeedbackInput(String username, String source, Integer rating, String comment) {
		super();
		this.username = username;
		this.source = source;
		this.rating = rating;
		this.comment = comment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
    
    
}
