package com.marcotulio.fit_manager_api.repository;

import com.marcotulio.fit_manager_api.domain.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
}