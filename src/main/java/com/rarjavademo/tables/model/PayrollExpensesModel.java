package com.rarjavademo.tables.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "payrollexpense")

public class PayrollExpensesModel {



    @Id
    @GeneratedValue
    @Column
    private Long id;
    

    @Column(name = "employeeid")
    private Long  employeeid;

    @Column(name = "payperiodstartdate")
    private String payperiodstartdate;
    
    @Column(name = "payperiodenddate")
    private String payperiodenddate;
    
    @Column(name = "paymentdate")
    private String paymentdate;
    
    @Column(name = "noofhours")
    private Long  noofhours;
    
    @Column(name = "payrate")
    private Long  payrate;
    
    @Column(name = "grosspay")
    private Long  grosspay;
    
    @Column(name = "payrollexpense")
    private Long  payrollexpense;
    
    @Column(name = "insurancebycompany")
    private Long  insurancebycompany;
    
    @Column(name = "totalpayroll")
    private Long  totalpayroll;
    
    @Column(name = "creatioddate")
    private String creatioddate;
    
    @Column(name = "createdby")
    private Long createdby;
    
    @Column(name = "updatedby")
    private Long  updatedby;
    
    @Column(name = "updateddate")
    private String updateddate;

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

	public String getExpensecode() {
		return payperiodstartdate;
	}

	public void setExpensecode(String expensecode) {
		this.payperiodstartdate = payperiodstartdate;
	}

	public String getPayperiodenddate() {
		return payperiodenddate;
	}

	public void setPayperiodenddate(String payperiodenddate) {
		this.payperiodenddate = payperiodenddate;
	}

	public String getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
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

	public Long getGrosspay() {
		return grosspay;
	}

	public void setGrosspay(Long grosspay) {
		this.grosspay = grosspay;
	}

	public Long getPayrollexpense() {
		return payrollexpense;
	}

	public void setPayrollexpense(Long payrollexpense) {
		this.payrollexpense = payrollexpense;
	}

	public Long getInsurancebycompany() {
		return insurancebycompany;
	}

	public void setInsurancebycompany(Long insurancebycompany) {
		this.insurancebycompany = insurancebycompany;
	}

	public Long getTotalpayroll() {
		return totalpayroll;
	}

	public void setTotalpayroll(Long totalpayroll) {
		this.totalpayroll = totalpayroll;
	}

	public String getCreatioddate() {
		return creatioddate;
	}

	public void setCreatioddate(String creatioddate) {
		this.creatioddate = creatioddate;
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
		return "ExpensesModel [id=" + id + ", employeeid=" + employeeid + ", expensecode=" + payperiodstartdate
				+ ", payperiodenddate=" + payperiodenddate + ", paymentdate=" + paymentdate + ", noofhours=" + noofhours
				+ ", payrate=" + payrate + ", grosspay=" + grosspay + ", payrollexpense=" + payrollexpense
				+ ", insurancebycompany=" + insurancebycompany + ", totalpayroll=" + totalpayroll + ", creatioddate="
				+ creatioddate + ", createdby=" + createdby + ", updatedby=" + updatedby + ", updateddate="
				+ updateddate + "]";
	}
	
    
    
   
    
   

}







