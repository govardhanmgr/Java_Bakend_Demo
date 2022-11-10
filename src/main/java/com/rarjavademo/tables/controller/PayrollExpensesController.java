package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rarjavademo.tables.dto.PayrollExpensesDto;
import com.rarjavademo.tables.dto.ResponseWrapper;
import com.rarjavademo.tables.dto.VisaInfoDto;
import com.rarjavademo.tables.services.PayrollExpensesServices;

@RestController
public class PayrollExpensesController {
	@Autowired
	PayrollExpensesServices ps;
	
	@GetMapping(value="/getpayrollexpenses")
	public com.rarjavademo.tables.dto.ResponseWrapper getpayrollexpenses( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<PayrollExpensesDto> payroll = ps.getpayrollexpenses();
            rw.setData(payroll);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
	
	 return rw;

}
	

	@PostMapping(value="/postpayrollexpenses")
    public ResponseWrapper postVisaInfoData(@RequestBody PayrollExpensesDto predto, HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
        	ps.savePayrollexpense(predto);

           
        }
        catch (Exception e) {
            rw.setSuccess(false);
        }
        rw.setMessage("Inserted Successfully");
        return rw;
    }
	
	
	
}