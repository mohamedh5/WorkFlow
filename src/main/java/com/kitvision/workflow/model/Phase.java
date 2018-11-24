package com.kitvision.workflow.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * This class hold the data of each phase.
 * The phases focus only on Tasks, and the number of tasks and the type of it, may vary from  phase to another. 
 * @author mohamed
 *
 */
@Entity
public class Phase {
 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String phaseName;
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY,orphanRemoval=true)
	private List<FinancialTask> finacialTasks;
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY,orphanRemoval=true)
	private List<MediaTask> mediaTasks;
	@OneToMany(cascade=CascadeType.MERGE,fetch=FetchType.LAZY,orphanRemoval=true)
	private List<EstimatedCostTask> estimatedCost;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhaseName() {
		return phaseName;
	}
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	public List<FinancialTask> getFinacialTasks() {
		return finacialTasks;
	}
	public void setFinacialTasks(List<FinancialTask> finacialTasks) {
		this.finacialTasks = finacialTasks;
	}
	public List<MediaTask> getMediaTasks() {
		return mediaTasks;
	}
	public void setMediaTasks(List<MediaTask> mediaTasks) {
		this.mediaTasks = mediaTasks;
	}
	public List<EstimatedCostTask> getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(List<EstimatedCostTask> estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
}
