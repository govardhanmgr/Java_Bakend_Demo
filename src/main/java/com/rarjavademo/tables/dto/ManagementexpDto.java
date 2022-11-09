package com.rarjavademo.tables.dto;


import com.rarjavademo.tables.model.ManagementexpModel;

public class ManagementexpDto {
	 private Long id;
	 
	    private Long employeeid;
	    private String entity;
	    private String expensecode;
	    private String expensedate;
	    private Long clientcode;
	    private Long amount;
	    private Long approvedby;
	    private String approvaldate;
	    private String modeofpayment;
	    private String paymentdate;
	    private String creationdate;
	    private Long createdby;
	    private Long updatedby;
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
		public String getEntity() {
			return entity;
		}
		public void setEntity(String entity) {
			this.entity = entity;
		}
		public String getExpensecode() {
			return expensecode;
		}
		public void setExpensecode(String expensecode) {
			this.expensecode = expensecode;
		}
		public String getExpensedate() {
			return expensedate;
		}
		public void setExpensedate(String expensedate) {
			this.expensedate = expensedate;
		}
		public Long getClientcode() {
			return clientcode;
		}
		public void setClientcode(Long clientcode) {
			this.clientcode = clientcode;
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
		
		public static ManagementexpDto getManagementexpDto(ManagementexpModel i) {
			ManagementexpDto mgxdt = new ManagementexpDto();
			mgxdt.setId(i.getId());
			mgxdt.setEmployeeid(i.getEmployeeid());
			mgxdt.setEntity(i.getEntity());
			mgxdt.setExpensecode(i.getExpensecode());
			mgxdt.setExpensedate(i.getExpensedate());
			mgxdt.setClientcode(i.getClientcode());
			mgxdt.setAmount(i.getAmount());
			mgxdt.setApprovedby(i.getApprovedby());
			mgxdt.setApprovaldate(i.getApprovaldate());
			mgxdt.setModeofpayment(i.getModeofpayment());
			mgxdt.setPaymentdate(i.getPaymentdate());
			mgxdt.setCreationdate(i.getCreationdate());
			mgxdt.setCreatedby(i.getCreatedby());
			mgxdt.setUpdatedby(i.getUpdatedby());
	        
			
						return mgxdt;
		}
		
		
}
