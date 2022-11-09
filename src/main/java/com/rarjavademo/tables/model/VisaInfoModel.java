package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visainformation")

public class VisaInfoModel {

	
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "visastatus")
	private String visastatus;
	
	@Column(name = "issuingcountry")
	private String issuingcountry;
	
	@Column(name = "issuedate")
	private String issuedate;
	
	@Column(name = "expirationdate")
	private String expirationdate;
	
	@Column(name = "status")
	private String status;	
	
	 @Column(name = "payschedule")
    private String payschedule;
	 
	 @Column(name = "paytype") 
    private String paytype;
    
	 @Column(name = "payrate")
    private Long payrate;
    
	 @Column(name = "overtime")
    private String overtime;
    
	 @Column(name = "overtimerate")
    private Long overtimerate;
    
	 @Column(name = "changereason")
    private String changereason;
    
	 @Column(name = "comment")
    private String comment;
    
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
    private Long id;
    
	 @Column(name = "employeeid")
    private Long employeeid;
    
	
	
	 @Override
	public String toString() {
		return "VisaInfoModel [visastatus=" + visastatus + ", issuingcountry=" + issuingcountry + ", issuedate="
				+ issuedate + ", expirationdate=" + expirationdate + ", status=" + status + ", payschedule="
				+ payschedule + ", paytype=" + paytype + ", payrate=" + payrate + ", overtime=" + overtime
				+ ", overtimerate=" + overtimerate + ", changereason=" + changereason + ", comment=" + comment + ", id="
				+ id + ", employeeid=" + employeeid + ", date=" + date + "]";
	}

	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVisastatus() {
		return visastatus;
	}

	public void setVisastatus(String visastatus) {
		this.visastatus = visastatus;
	}

	public String getIssuingcountry() {
		return issuingcountry;
	}

	public void setIssuingcountry(String issuingcountry) {
		this.issuingcountry = issuingcountry;
	}

	public String getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}

	public String getExpirationdate() {
		return expirationdate;
	}

	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayschedule() {
		return payschedule;
	}

	public void setPayschedule(String payschedule) {
		this.payschedule = payschedule;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public Long getPayrate() {
		return payrate;
	}

	public void setPayrate(Long payrate) {
		this.payrate = payrate;
	}

	public String getOvertime() {
		return overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public Long getOvertimerate() {
		return overtimerate;
	}

	public void setOvertimerate(Long overtimerate) {
		this.overtimerate = overtimerate;
	}

	public String getChangereason() {
		return changereason;
	}

	public void setChangereason(String changereason) {
		this.changereason = changereason;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

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

	
	
}
