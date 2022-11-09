package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.RolesDto;
import com.rarjavademo.tables.model.RolesModel;
import com.rarjavademo.tables.repository.RolesRepository;

@Component
public class RolesServices {
	
	@Autowired
	RolesRepository rr;
	
	public List<RolesDto> getRoleRec(){
		Iterable<RolesModel> rolesm = rr.findAll();
		List<RolesDto> rdto = new ArrayList<>();
		 for (RolesModel rnt : rolesm) {
			 rdto.add(RolesDto.getDto(rnt));
		 }
		 return rdto;
	}

}
