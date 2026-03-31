package com.marcotulio.fit_manager_api.service;

import com.marcotulio.fit_manager_api.domain.Assessment;
import com.marcotulio.fit_manager_api.repository.AssessmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AssessmentService {

    private final AssessmentRepository repository;

    public AssessmentService(AssessmentRepository repository) {
        this.repository = repository;
    }

    public Assessment createAssessment(Assessment assessment) {
        // Calcula a TMB antes de salvar
        double tmb = calculateTMB(assessment);
        assessment.setBasalMetabolicRate(tmb);
        
        // Salva no banco de dados e retorna o objeto salvo
        return repository.save(assessment);
    }

    private double calculateTMB(Assessment a) {
        if ("M".equalsIgnoreCase(a.getGender())) {
            // Fórmula para Homens
            return 88.362 + (13.397 * a.getWeight()) + (4.799 * a.getHeight()) - (5.677 * a.getAge());
        } else {
            // Fórmula para Mulheres
            return 447.593 + (9.247 * a.getWeight()) + (3.098 * a.getHeight()) - (4.330 * a.getAge());
        }
    }
}