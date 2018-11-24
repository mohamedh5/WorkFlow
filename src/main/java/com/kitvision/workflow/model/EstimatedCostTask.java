package com.kitvision.workflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class is a representation of the estimated cost tasks.
 * the fours type of tasks (Estimated Cost Task)
 * @author mohamed
 *
 */
@Entity
public class EstimatedCostTask extends Task {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int estimatedCost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(int estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
}
