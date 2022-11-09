package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.RegDto;
import com.rarjavademo.tables.services.RegServices;



@RestController

public class RegController {
	@Autowired
	RegServices Rs;
	
	@GetMapping(value="/getregdata")
	public com.rarjavademo.tables.dto.ResponseWrapper getregdata( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<RegDto> payroll = Rs.reg();
            rw.setData(payroll);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
	
	 return rw;

}

}
