package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.EmpdataDto;
import com.rarjavademo.tables.model.EmpdataModel;
import com.rarjavademo.tables.repository.EmpdataRepository;




@Component
public class EmpdataServices {
	@Autowired
    EmpdataRepository em;
	public List<EmpdataDto> getEmpdata() {
		// TODO Auto-generated method stub
		
		 Iterable<EmpdataModel> ed = em.findAll();
	        List<EmpdataDto> edto = new ArrayList<>();
	        for (EmpdataModel i:ed){
	            edto.add(EmpdataDto.getDto(i) );

	        }
	        return edto;
	    }
	}


