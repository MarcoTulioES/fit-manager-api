package com.marcotulio.fit_manager_api.controller;

import com.marcotulio.fit_manager_api.domain.Assessment;
import com.marcotulio.fit_manager_api.service.AssessmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {

    private final AssessmentService service;

    public AssessmentController(AssessmentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Assessment> registerAssessment(@RequestBody Assessment assessment) {
        Assessment saved = service.createAssessment(assessment);
        return ResponseEntity.ok(saved);
    }
}