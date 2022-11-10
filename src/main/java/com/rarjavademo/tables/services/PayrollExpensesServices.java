package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.PayrollExpensesDto;
import com.rarjavademo.tables.model.EmpdataModel;
import com.rarjavademo.tables.model.PayrollExpensesModel;
import com.rarjavademo.tables.repository.PayrollExpensesRepository;


@Component
public class PayrollExpensesServices {
	 @Autowired
	   PayrollExpensesRepository er;

	    public List<PayrollExpensesDto> getpayrollexpenses(){
	        Iterable<PayrollExpensesModel> em = er.findAll();
	        List<PayrollExpensesDto> edto = new ArrayList<>();
	        for (PayrollExpensesModel e:em){
	            edto.add(PayrollExpensesDto.getDto(e) );

	        }
	        return edto;
	    }

		public void savePayrollexpense(PayrollExpensesDto predto) {
			PayrollExpensesModel payex = new PayrollExpensesModel();
			payex.setCreatedby(predto.getCreatedby());
			payex.setEmployeeid(predto.getEmployeeid());
			payex.setPayperiodenddate(predto.getPayperiodenddate());
			payex.setPayperiodenddate(predto.getPayperiodenddate());
			payex.setPaymentdate(predto.getpaymentdate());
			payex.setNoofhours(predto.getNoofhours());
			payex.setPayrate(predto.getPayrate());
			payex.setGrosspay(predto.getGrosspay());
			payex.setPayrollexpense(predto.getPayrollexpense());
			payex.setInsurancebycompany(predto.getInsurancebycompany());
			payex.setTotalpayroll(predto.getTotalpayroll());
			payex.setCreatioddate(predto.getCreatioddate());
			payex.setCreatedby(predto.getCreatedby());
			payex.setUpdatedby(predto.getUpdatedby());
			payex.setUpdatedby(predto.getUpdatedby());
			er.save(payex);
			
		}
	

	

}
