package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.EducationModel;
import com.rarjavademo.tables.model.ExpensesModel;

public class EducationDto {
	private Long id; 
	private String university ;
	private String highestdegree ;
	private String specialization ;
	 private String gpa ; 
	 private String degreestartdate ;
	 private String degreeenddate ;
	 private int employeeid ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getHighestdegree() {
		return highestdegree;
	}
	public void setHighestdegree(String highestdegree) {
		this.highestdegree = highestdegree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String getDegreestartdate() {
		return degreestartdate;
	}
	public void setDegreestartdate(String degreestartdate) {
		this.degreestartdate = degreestartdate;
	}
	public String getDegreeenddate() {
		return degreeenddate;
	}
	public void setDegreeenddate(String degreeenddate) {
		this.degreeenddate = degreeenddate;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	 
	 public static EducationDto getDto(EducationModel i){
	    	EducationDto edto= new EducationDto();
	       
	        return edto;
	    }
}
