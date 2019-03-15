package com.yash;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class FeedbackNotFoundException extends RuntimeException implements GraphQLError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer feedbackId;
	
	public FeedbackNotFoundException(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	
	public String getMessage() {
		return "Article with feedback ID " + feedbackId + " could not be found";
	}
	
	@Override
	public List<SourceLocation> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		return ErrorType.ValidationError;
	}
	
	public Map<String, Object> getExtensions(){
		return Collections.singletonMap("feedbackId", feedbackId);
	}

}
