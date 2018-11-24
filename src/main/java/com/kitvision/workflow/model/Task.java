package com.kitvision.workflow.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * This class hold all the main data needed to create a simple task.
 * And it's the first Type of tasks. (Simple Task)
 * @author mohamed
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String taskName;
	private LocalDateTime startedDate;
	private LocalDateTime endedDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDateTime getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(LocalDateTime startedDate) {
		this.startedDate = startedDate;
	}
	public LocalDateTime getEndedDate() {
		return endedDate;
	}
	public void setEndedDate(LocalDateTime endedDate) {
		this.endedDate = endedDate;
	}
	
	
}
