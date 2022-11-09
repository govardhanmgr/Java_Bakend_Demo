package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compensation")
public class CompensationModel {
	  @Id
	    @GeneratedValue
	    @Column
	    private Long id;
	  @Column(name = "employeeid")
	    private Long employeeid;
	  @Column(name = "comment")
	    private String comment;
	  @Column(name = "changereason")
	    private String changereason;
	  @Column(name = "overtimerate")
	    private String overtimerate;
	  @Column(name = "overtime")
	    private String overtime;
	  @Column(name = "payrate")
	    private String payrate;
	  @Column(name = "paytype")
	    private String paytype;
	  @Column(name = "payschedule")
	    private String payschedule;
	  @Column(name = "compensationeffectivedate")
	    private String compensationeffectivedate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getChangereason() {
		return changereason;
	}
	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}
	public String getOvertimerate() {
		return overtimerate;
	}
	public void setOvertimerate(String overtimerate) {
		this.overtimerate = overtimerate;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getPayrate() {
		return payrate;
	}
	public void setPayrate(String payrate) {
		this.payrate = payrate;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getPayschedule() {
		return payschedule;
	}
	public void setPayschedule(String payschedule) {
		this.payschedule = payschedule;
	}
	public String getCompensationeffectivedate() {
		return compensationeffectivedate;
	}
	public void setCompensationeffectivedate(String compensationeffectivedate) {
		this.compensationeffectivedate = compensationeffectivedate;
	}
	@Override
	public String toString() {
		return "CompensationModel [id=" + id + ", employeeid=" + employeeid + ", comment=" + comment + ", changereason="
				+ changereason + ", overtimerate=" + overtimerate + ", overtime=" + overtime + ", payrate=" + payrate
				+ ", paytype=" + paytype + ", payschedule=" + payschedule + ", compensationeffectivedate="
				+ compensationeffectivedate + "]";
	}
	
	  


}
