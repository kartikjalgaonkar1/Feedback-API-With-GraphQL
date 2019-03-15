package com.yash;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver{
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	

	public QueryResolver(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}

	public List<Feedback> getFeedbacks() {
		System.out.println("yash");
		System.out.println(feedbackRepository.findAll());
		return (List<Feedback>) feedbackRepository.findAll();
	}
	
	public Feedback getFeedback(Integer id) {
		Optional<Feedback> feedbackResouce = feedbackRepository.findById(id);
		return feedbackResouce.get();
	}
}
