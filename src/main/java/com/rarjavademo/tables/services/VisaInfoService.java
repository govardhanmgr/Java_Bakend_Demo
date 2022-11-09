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

	public void saveVisaInfo(VisaInfoDto viinfdto) {
		VisaInfoModel vim = new VisaInfoModel();
		vim.setDate(viinfdto.getDate());
        vim.setVisastatus(viinfdto.getVisastatus());
        vim.setIssuingcountry(viinfdto.getIssuingcountry());
        vim.setIssuedate(viinfdto.getIssuedate());
        vim.setExpirationdate(viinfdto.getExpirationdate());
        vim.setStatus(viinfdto.getStatus());
        
        vim.setPayschedule(viinfdto.getPayschedule());
        vim.setPayrate(viinfdto.getPayrate());
        vim.setPaytype(viinfdto.getPaytype());
        vim.setOvertime(viinfdto.getOvertime());
        vim.setOvertimerate(viinfdto.getOvertimerate());
        vim.setChangereason(viinfdto.getChangereason());
        vim.setComment(viinfdto.getComment());
        vim.setEmployeeid(viinfdto.getEmployeeid());
        vim.setId(viinfdto.getId());
        
        vir.save(vim);
	
	}
		
				
}
