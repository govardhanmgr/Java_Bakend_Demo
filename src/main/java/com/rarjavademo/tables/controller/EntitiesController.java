package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.EntitiesDto;
import com.rarjavademo.tables.services.EntitiesService;



@RestController
public class EntitiesController {
	
	@Autowired
	EntitiesService ents;
	
	@GetMapping(value = "/orgndata")
	 public com.rarjavademo.tables.dto.ResponseWrapper  getEntRec( HttpServletRequest request, HttpServletResponse response){
		 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
		 try {
			 List<EntitiesDto> listoftent = ents.getEntRec();
			 rw.setData(listoftent);
		 }
		 catch (Exception e ) {
			 rw.setSuccess(false);
		 }
		return rw;
		
	}
}
