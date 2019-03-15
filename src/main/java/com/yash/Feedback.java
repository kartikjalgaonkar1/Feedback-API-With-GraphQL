package com.yash;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "feedback", schema = "feedback_schema")
public class Feedback {

	@Id
	@SequenceGenerator(name="SEQ_GEN", sequenceName="feedback_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	private Integer id;
	private String username;
    private String source;
    private Integer rating;
    private String comment;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    
    public Feedback() {
		// TODO Auto-generated constructor stub
	}
    

	public Feedback(Integer id, String username, String source, Integer rating, String comment) {
		super();	
		this.id = id;
		this.username = username;
		this.source = source;
		this.rating = rating;
		this.comment = comment;
	}

	@PrePersist
    protected void onCreate() {
        createdTime = new Date();
    }
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
