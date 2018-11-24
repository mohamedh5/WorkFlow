package com.kitvision.workflow.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PreUpdate;

/**
 * This class hold all the data needed to create a project.
 * 
 * @author mohamed
 *
 */
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Company companyDetails;
	private int status;
	private int totalEstimatedCost;
	private int totalActualCost;
	private int net;
	private int qstechOffer;
	private boolean locked;
	private String name;
	private LocalDateTime StartedDate;
	private LocalDateTime closedDate;
	private LocalDateTime endedDate;
	private String createdBy;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Phase contractingProcess;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Phase workInProgress;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Phase factoryDeliveryAndShipping;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Phase execution;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = false)
	@MapsId
	private Phase handover;

	@PreUpdate
	public void updateCosts() {
		if (contractingProcess != null) {
			try {
				contractingProcess.getEstimatedCost().forEach((es) -> totalEstimatedCost += es.getEstimatedCost());
			} catch (NullPointerException ex) {}
			
			try {
				contractingProcess.getFinacialTasks().forEach((ft) -> totalEstimatedCost += ft.getTotalCost());
			} catch (NullPointerException ex) {}
		}
		if (workInProgress != null) {
			try {
				workInProgress.getEstimatedCost().forEach((es) -> totalEstimatedCost += es.getEstimatedCost());
			} catch (NullPointerException ex) {}
			
			try {
				workInProgress.getFinacialTasks().forEach((ft) -> totalEstimatedCost += ft.getTotalCost());
			} catch (NullPointerException ex) {}
		}
		if (factoryDeliveryAndShipping != null) {
			try {
				factoryDeliveryAndShipping.getFinacialTasks().forEach((ft) -> totalEstimatedCost += ft.getTotalCost());
			} catch (NullPointerException ex) {}
		}
		if (execution != null) {
			try {
				execution.getFinacialTasks().forEach((ft) -> totalEstimatedCost += ft.getTotalCost());
			} catch (NullPointerException ex) {}
		}
		if (handover != null) {
			try {
				handover.getFinacialTasks().forEach((ft) -> totalEstimatedCost += ft.getTotalCost());
			} catch (NullPointerException ex) {}
		}
	}
	
	@PreUpdate
	public void netGain() {
		net = qstechOffer - totalActualCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return companyDetails;
	}

	public void setCompany(Company company) {
		this.companyDetails = company;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getStartedDate() {
		return StartedDate;
	}

	public void setStartedDate(LocalDateTime startedDate) {
		StartedDate = startedDate;
	}

	public LocalDateTime getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(LocalDateTime closedDate) {
		this.closedDate = closedDate;
	}

	public LocalDateTime getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(LocalDateTime endedDate) {
		this.endedDate = endedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Phase getContractingProcess() {
		return contractingProcess;
	}

	public void setContractingProcess(Phase contractingProcess) {
		this.contractingProcess = contractingProcess;
	}

	public Phase getWorkInProgress() {
		return workInProgress;
	}

	public void setWorkInProgress(Phase workInProgress) {
		this.workInProgress = workInProgress;
	}

	public Phase getFactoryDeliveryAndShipping() {
		return factoryDeliveryAndShipping;
	}

	public void setFactoryDeliveryAndShipping(Phase factoryDeliveryAndShipping) {
		this.factoryDeliveryAndShipping = factoryDeliveryAndShipping;
	}

	public Phase getExecution() {
		return execution;
	}

	public void setExecution(Phase execution) {
		this.execution = execution;
	}

	public Phase getHandover() {
		return handover;
	}

	public void setHandover(Phase handover) {
		this.handover = handover;
	}

	public int getTotalEstimatedCost() {
		return totalEstimatedCost;
	}

	public void setTotalEstimatedCost(int totalEstimatedCost) {
		this.totalEstimatedCost = totalEstimatedCost;
	}

	public int getTotalActualCost() {
		return totalActualCost;
	}

	public void setTotalActualCost(int totalActualCost) {
		this.totalActualCost = totalActualCost;
	}

	public int getNet() {
		return net;
	}

	public void setNet(int net) {
		this.net = net;
	}

	public int getQstechOffer() {
		return qstechOffer;
	}

	public void setQstechOffer(int qstechOffer) {
		this.qstechOffer = qstechOffer;
	}

}
