package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.EducationModel;

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
	 
	 public static EducationDto getEduDto(EducationModel m){
	    	EducationDto educationdto= new EducationDto();
	    	educationdto.setId(m.getId());
	    	educationdto.setUniversity(m.getUniversity());
	    	educationdto.setDegreeenddate(m.getDegreeenddate());
	    	educationdto.setDegreestartdate(m.getDegreestartdate());
	    	educationdto.setHighestdegree(m.getHighestdegree());
	    	educationdto.setSpecialization(m.getSpecialization());
	    	educationdto.setGpa(m.getGpa());
	    	educationdto.setEmployeeid(m.getEmployeeid());
	        return educationdto;
	    }
}
