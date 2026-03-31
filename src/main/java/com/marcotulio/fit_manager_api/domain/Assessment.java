package com.marcotulio.fit_manager_api.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "assessments")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double weight;
    private Double height;
    private Integer age;
    private String gender;
    
    private Double basalMetabolicRate; 
    
    private LocalDate assessmentDate;

    @PrePersist
    protected void onCreate() {
        assessmentDate = LocalDate.now();
    }

    // --- GETTERS E SETTERS ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }

    public Double getHeight() { return height; }
    public void setHeight(Double height) { this.height = height; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Double getBasalMetabolicRate() { return basalMetabolicRate; }
    public void setBasalMetabolicRate(Double basalMetabolicRate) { this.basalMetabolicRate = basalMetabolicRate; }

    public LocalDate getAssessmentDate() { return assessmentDate; }
    public void setAssessmentDate(LocalDate assessmentDate) { this.assessmentDate = assessmentDate; }
}