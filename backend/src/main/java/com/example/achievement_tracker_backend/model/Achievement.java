package com.example.achievement_tracker_backend.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "achievements")
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private String studentName;
    private String rollNumber;
    private String department;
    private String eventName;
    private String eventCategory;
    private String level;
    private String awardType;
    private LocalDate date;
    
    @Lob
    @Column(columnDefinition = "TEXT")
    private String certificateUrl;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    private String status; // "pending", "approved", "rejected"
    
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    private String approvedBy;
    private LocalDateTime approvedAt;
    
    private String rejectionReason;

    // No-args constructor
    public Achievement() {}

    // All-args constructor
    public Achievement(Long id, Long studentId, String studentName, String rollNumber, String department, 
                       String eventName, String eventCategory, String level, String awardType, 
                       LocalDate date, String certificateUrl, String description, String status, 
                       LocalDateTime createdAt, String approvedBy, LocalDateTime approvedAt, 
                       String rejectionReason) {
        this.id = id;
        this.studentId = studentId;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.department = department;
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.level = level;
        this.awardType = awardType;
        this.date = date;
        this.certificateUrl = certificateUrl;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.approvedBy = approvedBy;
        this.approvedAt = approvedAt;
        this.rejectionReason = rejectionReason;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    public String getEventCategory() { return eventCategory; }
    public void setEventCategory(String eventCategory) { this.eventCategory = eventCategory; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getAwardType() { return awardType; }
    public void setAwardType(String awardType) { this.awardType = awardType; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    public String getCertificateUrl() { return certificateUrl; }
    public void setCertificateUrl(String certificateUrl) { this.certificateUrl = certificateUrl; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public String getApprovedBy() { return approvedBy; }
    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }
    public LocalDateTime getApprovedAt() { return approvedAt; }
    public void setApprovedAt(LocalDateTime approvedAt) { this.approvedAt = approvedAt; }
    public String getRejectionReason() { return rejectionReason; }
    public void setRejectionReason(String rejectionReason) { this.rejectionReason = rejectionReason; }
}
