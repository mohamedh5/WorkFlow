package com.kitvision.workflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is the third type of tasks (Media Task), it hold a location of file or files (videos or docs).
 * @author mohamed
 *
 */
@Entity
public class MediaTask extends Task {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String fileLocation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	
}
