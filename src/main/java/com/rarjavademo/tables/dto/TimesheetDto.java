package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.TimesheetModel;

public class TimesheetDto {
	
	private long id;
	private Long employeeid;
	private String period;
	private Long clientid;
	private Long noofhours;
	private Long payrate;
	private Long revenuerate;
	private String creationdate;
	private Long operationalcost;
	private Long receivables;
	private String receivablespaid;
	private Long createdby;
	private Long updatedby;
	private String updateddate;

	

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Long getClientid() {
		return clientid;
	}
	public void setClientid(Long clientid) {
		this.clientid = clientid;
	}
	public Long getNoofhours() {
		return noofhours;
	}
	public void setNoofhours(Long noofhours) {
		this.noofhours = noofhours;
	}
	public Long getPayrate() {
		return payrate;
	}
	public void setPayrate(Long payrate) {
		this.payrate = payrate;
	}
	public Long getRevenuerate() {
		return revenuerate;
	}
	public void setRevenuerate(Long revenuerate) {
		this.revenuerate = revenuerate;
	}
	public String getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}
	public Long getOperationalcost() {
		return operationalcost;
	}
	public void setOperationalcost(Long operationalcost) {
		this.operationalcost = operationalcost;
	}
	public Long getReceivables() {
		return receivables;
	}
	public void setReceivables(Long receivables) {
		this.receivables = receivables;
	}
	public String getReceivablespaid() {
		return receivablespaid;
	}
	public void setReceivablespaid(String receivablespaid) {
		this.receivablespaid = receivablespaid;
	}
	public Long getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}
	public Long getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}
	public String getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(String updateddate) {
		this.updateddate = updateddate;
	}
	
	
	
	public static TimesheetDto getTimesheetDto(TimesheetModel tm) {
		TimesheetDto tdto = new TimesheetDto();
		tdto.setId(tm.getId());
		 tdto.setEmployeeid(tm.getEmployeeid());
		 tdto.setPeriod(tm.getPeriod());
		 tdto.setClientid(tm.getClientid());
		 tdto.setNoofhours(tm.getNoofhours());
		 tdto.setPayrate(tm.getPayrate());
		 tdto.setRevenuerate(tm.getRevenuerate());
		 tdto.setCreationdate(tm.getCreationdate());
		 tdto.setOperationalcost(tm.getOperationalcost());
		 tdto.setReceivables(tm.getReceivables());
		 tdto.setReceivablespaid(tm.getReceivablespaid());
		 tdto.setCreatedby(tm.getCreatedby());
		 tdto.setUpdatedby(tm.getUpdatedby());
		 tdto.setUpdateddate(tm.getUpdateddate());
	        return tdto;
	}

	       

}
