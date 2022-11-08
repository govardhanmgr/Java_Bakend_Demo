package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.EmpdataDto;
import com.rarjavademo.tables.services.EmpdataServices;



@RestController
public class EmpdataController {
	@Autowired
    EmpdataServices em;
	@GetMapping(value = "/getempdata")
    public com.rarjavademo.tables.dto.ResponseWrapper getEmpdata( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<EmpdataDto> listofexp = em.getEmpdata();
            rw.setData(listofexp);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
        return  rw;
    }
}
