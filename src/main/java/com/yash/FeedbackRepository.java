package com.yash;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	Optional<Feedback> findById(Integer id);
	Integer deleteById(Integer id);
}
