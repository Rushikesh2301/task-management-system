package com.UvTech.TMS.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class TMSEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String title;
    private String description;
    private String status; // PENDING, COMPLETED
    private LocalDate dueDate;
    private String priority;
    
    @PrePersist
    public void prePersist() {
        if (this.dueDate == null) {
            this.dueDate = LocalDate.now();
        }
    }
    
	public TMSEntity(Long id, String title, String description, String status, LocalDate dueDate, String priority) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.dueDate = dueDate;
		this.priority = priority;
	}
	public TMSEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "TMSEntity [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", dueDate=" + dueDate + ", priority=" + priority + "]";
	}
    

}
