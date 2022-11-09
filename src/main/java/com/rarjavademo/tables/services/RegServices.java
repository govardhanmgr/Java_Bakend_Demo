package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.RegDto;
import com.rarjavademo.tables.model.RegModel;
import com.rarjavademo.tables.repository.RegRepository;



@Component

public class RegServices {
	@Autowired
	   RegRepository Rer;

	    public List<RegDto> reg(){
	        Iterable<RegModel> em = Rer.findAll();
	        List<RegDto> Redto = new ArrayList<>();
	        for (RegModel e:em){
	            Redto.add(RegDto.getDto(e) );

	        }
	        return Redto;
	    }

}
