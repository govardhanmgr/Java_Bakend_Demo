package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rarjavademo.tables.dto.ClientdataDto;
import com.rarjavademo.tables.services.ClientDataSevices;

@RestController
public class ClientdataController {
	 @Autowired
	 ClientDataSevices cs;
	 @GetMapping(value = "/getclientdata")
	    public com.rarjavademo.tables.dto.ResponseWrapper getClientRec( HttpServletRequest request, HttpServletResponse response){
	        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
	        try {
	            List<ClientdataDto> clientdata = cs.getClientRec();
	            rw.setData(clientdata);
	        }
	        catch (Exception e){
	            rw.setSuccess(false);
	        }
	        return  rw;
	    }
	 @PostMapping(value = "/postclientdata")
     public com.rarjavademo.tables.dto.ResponseWrapper postJonInfoData(@RequestBody ClientdataDto cdto, HttpServletRequest request,
             HttpServletResponse response) {
      com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
         try {
             cs.saveMyData(cdto);



          
         } catch (Exception e) {
             rw.setSuccess(false);
         }
         rw.setMessage("Inserted Successfully");
         return rw;
     }
	 
}
