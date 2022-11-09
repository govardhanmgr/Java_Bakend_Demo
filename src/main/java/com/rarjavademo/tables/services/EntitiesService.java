package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.EntitiesDto;
import com.rarjavademo.tables.model.EntitiesModel;
import com.rarjavademo.tables.repository.EntitiesRepository;



@Component
public class EntitiesService {
	
	@Autowired
	EntitiesRepository entr;
	
	public List<EntitiesDto> getEntRec(){
		Iterable<EntitiesModel> entm = entr.findAll();
		List<EntitiesDto> entdto = new ArrayList<>();
		 for (EntitiesModel Ent:entm) {
			 entdto.add(EntitiesDto.getDto(Ent));
		 }
		return entdto;
		
	}

}
