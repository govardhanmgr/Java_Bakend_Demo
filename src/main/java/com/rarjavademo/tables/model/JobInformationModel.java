package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobinformation")
public class JobInformationModel {
	 @Id
	 @GeneratedValue
	 @Column
	 private Long id;
	 
	 @Column(name = "jobeffectivedate")
	 private String jobeffectivedate;
	 
	 @Column(name = "location")
	 private String location;
	 
	 @Column(name = "clientname")
	 private String clientname;
	 
	 @Column(name = "jobtitle")
	 private String jobtitle;
	 
	 @Column(name = "reportsto")
	 private String reportsto;
	  
	 @Column(name = " employeeid")
	 private int  employeeid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobeffectivedate() {
		return jobeffectivedate;
	}

	public void setJobeffectivedate(String jobeffectivedate) {
		this.jobeffectivedate = jobeffectivedate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getReportsto() {
		return reportsto;
	}

	public void setReportsto(String reportsto) {
		this.reportsto = reportsto;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	@Override
	public String toString() {
		return "JobInformationModel [id=" + id + ", jobeffectivedate=" + jobeffectivedate + ", location=" + location
				+ ", clientname=" + clientname + ", jobtitle=" + jobtitle + ", reportsto=" + reportsto + ", employeeid="
				+ employeeid + "]";
	}
	

}
