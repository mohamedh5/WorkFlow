package com.kitvision.workflow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class hold all the data needed for the company details in any project.
 * @author mohamed
 *
 */
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	private String address;
	private String contactPersonName;
	private int contactPersonNumber;
	private String commercialRegistration_Doc;
	private String taxCard_Doc;
	private String logo_img;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public int getContactPersonNumber() {
		return contactPersonNumber;
	}
	public void setContactPersonNumber(int contactPersonNumber) {
		this.contactPersonNumber = contactPersonNumber;
	}
	public String getCommercialRegistration_Doc() {
		return commercialRegistration_Doc;
	}
	public void setCommercialRegistration_Doc(String commercialRegistration_Doc) {
		this.commercialRegistration_Doc = commercialRegistration_Doc;
	}
	public String getTaxCard_Doc() {
		return taxCard_Doc;
	}
	public void setTaxCard_Doc(String taxCard_Doc) {
		this.taxCard_Doc = taxCard_Doc;
	}
	public String getLogo_img() {
		return logo_img;
	}
	public void setLogo_img(String logo_img) {
		this.logo_img = logo_img;
	}
	
	
}
