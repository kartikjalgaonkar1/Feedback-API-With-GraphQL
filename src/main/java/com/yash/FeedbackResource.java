package com.yash;

import java.util.Date;

public class FeedbackResource {

	private String username;
    private String source;
    private Integer rating;
    private String comment;
    private Date createdTime;
    
    public FeedbackResource() {
		// TODO Auto-generated constructor stub
	}
    
	public FeedbackResource(String username, String source, Integer rating, String comment, Date createdTime) {
		super();
		this.username = username;
		this.source = source;
		this.rating = rating;
		this.comment = comment;
		this.createdTime = createdTime;
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
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
    
    
}
