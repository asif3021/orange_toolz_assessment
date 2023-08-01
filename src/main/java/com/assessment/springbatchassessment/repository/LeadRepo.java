package com.assessment.springbatchassessment.repository;

import com.assessment.springbatchassessment.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepo extends JpaRepository<Lead, Long> {

}
