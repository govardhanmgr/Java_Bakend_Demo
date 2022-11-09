package com.rarjavademo.tables.dto;


import com.rarjavademo.tables.model.VisaInfoModel;

public class VisaInfoDto {

	private String date;
	private String visastatus;
	private String issuingcountry;
	private String issuedate;
	private String expirationdate;
	private String status;	
    private String payschedule;
	  private String paytype;
	  private Long payrate;
	  private String overtime;
	    private Long overtimerate;
	    private String changereason;
	    private String comment;
	    private Long id;
	    private Long employeeid;
	    
	

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

	
	
		public static VisaInfoDto getvDto(VisaInfoModel v) {
			VisaInfoDto vidt = new VisaInfoDto();
		        vidt.setDate(v.getDate());
		        vidt.setVisastatus(v.getVisastatus());
		        vidt.setIssuingcountry(v.getIssuingcountry());
		        vidt.setIssuedate(v.getIssuedate());
		        vidt.setExpirationdate(v.getExpirationdate());
		        vidt.setStatus(v.getStatus());
		        
		        vidt.setPayschedule(v.getPayschedule());
		        vidt.setPayrate(v.getPayrate());
		        vidt.setPaytype(v.getPaytype());
		        vidt.setOvertime(v.getOvertime());
		        vidt.setOvertimerate(v.getOvertimerate());
		        vidt.setChangereason(v.getChangereason());
		        vidt.setComment(v.getComment());
		        vidt.setEmployeeid(v.getEmployeeid());
		        vidt.setId(v.getId());
		        
		        return vidt;
		    }
			
		    
}
