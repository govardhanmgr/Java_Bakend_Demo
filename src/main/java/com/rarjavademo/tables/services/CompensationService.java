package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.CompensationDto;
import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.model.CompensationModel;
import com.rarjavademo.tables.model.ExpensesModel;
import com.rarjavademo.tables.repository.CompensationRepository;

@Component
public class CompensationService {
	@Autowired
	CompensationRepository er;
	 public List<CompensationDto> getCompensationRec(){
	        Iterable<CompensationModel> em = er.findAll();
	        List<CompensationDto> edto = new ArrayList<>();
	        for (CompensationModel e:em){
	            edto.add(CompensationDto.getDto(e) );

	        }
	        return edto;
	    }
	

}
