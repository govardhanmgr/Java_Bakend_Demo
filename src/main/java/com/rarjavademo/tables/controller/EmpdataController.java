package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rarjavademo.tables.dto.EmpdataDto;
import com.rarjavademo.tables.services.EmpdataServices;



@RestController
public class EmpdataController {
	@Autowired
    EmpdataServices empservice;
	@PostMapping(value = "/postempdata")
    public com.rarjavademo.tables.dto.ResponseWrapper postEmpdata(@RequestBody EmpdataDto empdto, HttpServletRequest request,
            HttpServletResponse response) {
     com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
             empservice.saveMyData(empdto);



           // rw.setData(gfg);
        } catch (Exception e) {
            rw.setSuccess(false);
        }
        rw.setMessage("Inserted Successfully");
        return rw;
    }
	@GetMapping(value = "/getempdata")
    public com.rarjavademo.tables.dto.ResponseWrapper getEmpdata( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<EmpdataDto> listofexp = empservice.getEmpdata();
            rw.setData(listofexp);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
        return  rw;
    }
}
