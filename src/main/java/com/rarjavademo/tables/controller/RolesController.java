package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.RolesDto;
import com.rarjavademo.tables.services.RolesServices;

@RestController
public class RolesController {
	
	@Autowired
	RolesServices rr;
	
	@GetMapping(value = "/roles")
	public com.rarjavademo.tables.dto.ResponseWrapper getRoleRec( HttpServletRequest request, HttpServletResponse response){
		com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
		try {
			List<RolesDto> listofrole = rr.getRoleRec();
			rw.setData(listofrole);
		}
		catch(Exception e){
			 rw.setSuccess(false);
		}
		return rw;
	}
	

}
