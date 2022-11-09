package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.PayrollExpensesModel;


public class PayrollExpensesDto {
	 private Long employeeid;
	    private String payperiodstartdate;
	    private String payperiodenddate;
	    private String epaymentdate;
	    private Long noofhours;
	    private Long payrate;
	    private Long grosspay;
	    private  Long payrollexpense;
	    private Long insurancebycompany;
	    private Long totalpayroll;
	    private  String creatioddate;
	    private Long createdby;
	    private Long  updatedby;
	    private String updateddate;
		public Long getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(Long employeeid) {
			this.employeeid = employeeid;
		}
		public String getPayperiodstartdate() {
			return payperiodstartdate;
		}
		public void setPayperiodstartdate(String payperiodstartdate) {
			this.payperiodstartdate = payperiodstartdate;
		}
		public String getPayperiodenddate() {
			return payperiodenddate;
		}
		public void setPayperiodenddate(String payperiodenddate) {
			this.payperiodenddate = payperiodenddate;
		}
		public String getEpaymentdate() {
			return epaymentdate;
		}
		public void setEpaymentdate(String epaymentdate) {
			this.epaymentdate = epaymentdate;
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
	    
		  public static PayrollExpensesDto getDto(PayrollExpensesModel i){
		    	PayrollExpensesDto pdt= new PayrollExpensesDto();
		        pdt.setEmployeeid(i.getEmployeeid());
		        pdt.setPayperiodenddate(i.getPayperiodenddate());
		        pdt.setPayperiodenddate(i.getPayperiodenddate());
		        pdt.setEpaymentdate(i.getPaymentdate());
		        pdt.setNoofhours(i.getNoofhours());
		        pdt.setPayrate(i.getPayrate());
		        pdt.setGrosspay(i.getGrosspay());
		        pdt.setPayrollexpense(i.getPayrollexpense());
		        pdt.setInsurancebycompany(i.getInsurancebycompany());
		        pdt.setTotalpayroll(i.getTotalpayroll());
		        pdt.setCreatioddate(i.getCreatioddate());
		        pdt.setCreatedby(i.getCreatedby());
		        pdt.setUpdatedby(i.getUpdatedby());
		        pdt.setUpdatedby(i.getUpdatedby());
		        return pdt;
		    }
	    
	    

}
