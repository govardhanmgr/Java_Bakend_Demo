package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imgexp")
public class ImgexpModel {

@Column(name="employeeid")
private Long employeeid;

@Column(name="entity")
private String entity;

@Column(name="expensescode")
private String expensescode;

@Column(name="expdate")
private String expdate;

@Column(name="amount")
private Long amount;

@Column(name="approvedby")
private Long approvedby;

@Column(name="approvaldate")
private String approvaldate;

@Column(name="modeofpayment")
private String modeofpayment;

@Column(name="paymentdate")
private String paymentdate;

@Column(name="creationdate")
private String  creationdate;

@Column(name="createdby")
private Long createdby;

@Column(name="updatedby")
private Long updatedby;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
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
@Override
public String toString() {
	return "ImgexpModel [employeeid=" + employeeid + ", entity=" + entity + ", expensescode=" + expensescode
			+ ", expdate=" + expdate + ", amount=" + amount + ", approvedby=" + approvedby + ", approvaldate="
			+ approvaldate + ", modeofpayment=" + modeofpayment + ", paymentdate=" + paymentdate + ", creationdate="
			+ creationdate + ", createdby=" + createdby + ", updatedby=" + updatedby + ", id=" + id + "]";
}




}
