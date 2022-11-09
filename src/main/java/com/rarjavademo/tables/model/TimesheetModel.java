package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timesheet")

public class TimesheetModel {
	
	@Id
    @GeneratedValue
    
    
    @Column 
	private long id;

	@Column (name = "employeeid")
    private Long employeeid;
	
	@Column(name = "period")
	private String period;
	
	@Column(name = "clientid")
	private Long clientid;
	
	@Column(name = "noofhours")
	private Long noofhours ;
	
	@Column(name = "payrate")
	private Long payrate;
	
	@Column(name = "revenuerate")
	private Long revenuerate;
	
	@Column(name = "creationdate")
	private String creationdate;
	
	@Column(name = "operationalcost")
	private Long operationalcost;
	
	@Column(name = "receivables")
	private Long receivables;
	
	@Column(name = "receivablespaid")
	private String receivablespaid;
	
	@Column(name = "createdby")
	private Long createdby;
	
	@Column(name = "updatedby")
	private Long updatedby;
	
	@Column(name = "updateddate")
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

	@Override
	public String toString() {
		return "TimesheetModel [id=" + id + ", employeeid=" + employeeid + ", period=" + period + ", clientid="
				+ clientid + ", noofhours=" + noofhours + ", payrate=" + payrate + ", revenuerate=" + revenuerate
				+ ", creationdate=" + creationdate + ", operationalcost=" + operationalcost + ", receivables="
				+ receivables + ", receivablespaid=" + receivablespaid + ", createdby=" + createdby + ", updatedby="
				+ updatedby + ", updateddate=" + updateddate + "]";
	}
	
	
	
	
	
	
	

}



