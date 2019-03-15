package com.yash;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class MutaionResolver implements GraphQLMutationResolver{

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Transactional
	public Feedback updateFeedback(UpdateFeedbackInput feedbackInput) {
		Feedback feedback = feedbackRepository.findById(feedbackInput.getId()).get();
		feedback.setRating(feedbackInput.getRating());
		feedback.setComment(feedbackInput.getComment());
		feedback.setUsername(feedbackInput.getUsername());
		return feedback;
	}
	
	@Transactional
	public Integer deleteFeedback(Integer id) {
		return feedbackRepository.deleteById(id);
	}
	
	@Transactional
	public Feedback createFeedback(CreateFeedbackInput feedbackInput) {
		return feedbackRepository.save(new Feedback(null, feedbackInput.getUsername(), feedbackInput.getSource(), feedbackInput.getRating(), feedbackInput.getComment()));
	}
}