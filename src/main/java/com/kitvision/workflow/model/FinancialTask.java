package com.kitvision.workflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class is a child class of task, it's mainly focus on financial part,
 *  it hold all the data needed to keep track of the financial process,
 *  and should be managed by the financial rule.
 *  Second Type of tasks(Financial Task).
 * @author mohamed
 *
 */
@Entity
public class FinancialTask extends Task {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int actualCost;
	private int taxPercentage;
	private int vatPercentage;
	private int TotalCost;
	private int installmentPercentage;
	private boolean quarterly;
	private boolean monthly;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getActualCost() {
		return actualCost;
	}
	public void setActualCost(int actualCost) {
		this.actualCost = actualCost;
	}
	public int getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(int taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public int getVatPercentage() {
		return vatPercentage;
	}
	public void setVatPercentage(int vatPercentage) {
		this.vatPercentage = vatPercentage;
	}
	public int getTotalCost() {
		return TotalCost;
	}
	public void setTotalCost(int totalCost) {
		TotalCost = totalCost;
	}
	public int getInstallmentPercentage() {
		return installmentPercentage;
	}
	public void setInstallmentPercentage(int installmentPercentage) {
		this.installmentPercentage = installmentPercentage;
	}
	public boolean isQuarterly() {
		return quarterly;
	}
	public void setQuarterly(boolean quarterly) {
		this.quarterly = quarterly;
	}
	public boolean isMonthly() {
		return monthly;
	}
	public void setMonthly(boolean monthly) {
		this.monthly = monthly;
	}
}
