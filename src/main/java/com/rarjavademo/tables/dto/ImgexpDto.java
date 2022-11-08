package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.ImgexpModel;

public class ImgexpDto {
	private Long employeeid;
	private String entity;
	private String expensescode;
	private String expdate;
	private Long amount;
	private Long approvedby;
	private String approvaldate;
	private String modeofpayment;
	private String paymentdate;
	private String  creationdate;
	private Long createdby;
	private Long updatedby;
	private Long id;
	public Long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getExpensescode() {
		return expensescode;
	}
	public void setExpensescode(String expensescode) {
		this.expensescode = expensescode;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getApprovedby() {
		return approvedby;
	}
	public void setApprovedby(Long approvedby) {
		this.approvedby = approvedby;
	}
	public String getApprovaldate() {
		return approvaldate;
	}
	public void setApprovaldate(String approvaldate) {
		this.approvaldate = approvaldate;
	}
	public String getModeofpayment() {
		return modeofpayment;
	}
	public void setModeofpayment(String modeofpayment) {
		this.modeofpayment = modeofpayment;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public static ImgexpDto getDto(ImgexpModel e) {
		// TODO Auto-generated method stub
		ImgexpDto edto = new ImgexpDto();
		edto.setEmployeeid(e.getEmployeeid());
		edto.setEntity(e.getEntity());
		edto.setExpensescode(e.getExpensescode());
		edto.setExpdate(e.getExpdate());
		edto.setAmount(e.getAmount());
		edto.setApprovedby(e.getApprovedby());
		edto.setApprovaldate(e.getApprovaldate());
		edto.setModeofpayment(e.getModeofpayment());
		edto.setPaymentdate(e.getModeofpayment());
		edto.setCreationdate(e.getCreationdate());
		edto.setCreatedby(e.getCreatedby());
		edto.setUpdatedby(e.getUpdatedby());
		edto.setId(e.getId());
        		
		
		
	
		
		
		
		return edto;
	}
	
	
	
	
	
}
