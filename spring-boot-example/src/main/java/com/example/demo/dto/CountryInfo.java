package com.example.demo.dto;

import java.util.Date;

public class CountryInfo {
	
	private String id;
	private String code;
	private String fullName;
	private String briefName;
	private String capitalName;
	private double populationSize;
	private Date ctyCreatedDate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public double getPopulationSize() {
		return populationSize;
	}
	public void setPopulationSize(double populationSize) {
		this.populationSize = populationSize;
	}
	public Date getCtyCreatedDate() {
		return ctyCreatedDate;
	}
	public void setCtyCreatedDate(Date ctyCreatedDate) {
		this.ctyCreatedDate = ctyCreatedDate;
	}


}
