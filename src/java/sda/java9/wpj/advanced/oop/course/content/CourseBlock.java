package sda.java9.wpj.advanced.oop.course.content;

import sda.java9.wpj.advanced.oop.course.people.Trainer;

public class CourseBlock {
    
    private String title;
    private String technicalInformation;
    private String overallInformation;
    private String[] slides;
    private Trainer trainer;
    
    public String getTitle() {
        return title;
    }
    
    public String getTechnicalInformation() {
        return technicalInformation;
    }
    
    public String getOverallInformation() {
        return overallInformation;
    }
    
    public String[] getSlides() {
        return slides;
    }
    
    public Trainer getTrainer() {
        return trainer;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setTechnicalInformation(String technicalInformation) {
        this.technicalInformation = technicalInformation;
    }
    
    public void setOverallInformation(String overallInformation) {
        this.overallInformation = overallInformation;
    }
    
    public void setSlides(String[] slides) {
        this.slides = slides;
    }
    
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}