package com.rarjavademo.tables.services;


import com.rarjavademo.tables.dto.VisaInfoDto;
import com.rarjavademo.tables.model.VisaInfoModel;
import com.rarjavademo.tables.repository.VisaInfoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class VisaInfoService {
	
	@Autowired
     VisaInfoRepository vir;

	public List<VisaInfoDto> getVisaInfoRecords() {
		 Iterable<VisaInfoModel> vim = vir.findAll();   
	        List<VisaInfoDto> vidto = new ArrayList<VisaInfoDto>();
	        for(VisaInfoModel v:vim)
	        {
	            vidto.add(VisaInfoDto.getvDto(v));
	        }
	        return vidto;
	    }
		
				



	

}
