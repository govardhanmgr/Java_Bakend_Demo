package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.ExpensesModel;
import com.rarjavademo.tables.model.JobInformationModel;

public class JobInformationDto {
	
	 private Long id;
	 private String jobeffectivedate;
	 private String location;
	 private String clientname;
	 private String jobtitle;
	 private String reportsto;
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
	 public static JobInformationDto getInformationDto(JobInformationModel i){
		 JobInformationDto idto= new JobInformationDto();
	        idto.setId(i.getId());
	        idto.setJobeffectivedate(i.getJobeffectivedate());
	        idto.setLocation(i.getLocation());
	        idto.setClientname(i.getClientname());
	        idto.setJobtitle(i.getJobtitle());
	        idto.setReportsto(i.getReportsto());
	        idto.setEmployeeid(i.getEmployeeid());
	        return idto;
	    }
	 
}
