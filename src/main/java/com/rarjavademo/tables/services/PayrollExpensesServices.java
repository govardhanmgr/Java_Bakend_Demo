package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.PayrollExpensesDto;
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
	

	

}
