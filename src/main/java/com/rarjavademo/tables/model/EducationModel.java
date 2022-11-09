package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class EducationModel {
	@Id
	 @GeneratedValue
	 @Column
	 private Long id;
	
	@Column(name = "university")
	 private String university ;
	
	@Column(name = "highestdegree")
	 private String highestdegree ;
	
	@Column(name = "specialization")
	 private String specialization ;
	
	@Column(name = "gpa")
	 private String gpa ;
	
	@Column(name = "degreestartdate")
	 private String degreestartdate ;
	
	@Column(name = "degreeenddate")
	 private String degreeenddate ;
	
	@Column(name = "employeeid")
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

	@Override
	public String toString() {
		return "EducationModel [id=" + id + ", university=" + university + ", highestdegree=" + highestdegree
				+ ", specialization=" + specialization + ", gpa=" + gpa + ", degreestartdate=" + degreestartdate
				+ ", degreeenddate=" + degreeenddate + ", employeeid=" + employeeid + "]";
	}
	

}
