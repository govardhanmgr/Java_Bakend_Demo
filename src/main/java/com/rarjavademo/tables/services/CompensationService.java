package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.CompensationDto;
import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.model.CompensationModel;
import com.rarjavademo.tables.model.ExpensesModel;
import com.rarjavademo.tables.model.JobInformationModel;
import com.rarjavademo.tables.repository.CompensationRepository;

@Component
public class CompensationService {
	@Autowired
	CompensationRepository cr;
	 public List<CompensationDto> getCompensationRec(){
	        Iterable<CompensationModel> cm = cr.findAll();
	        List<CompensationDto> cdto = new ArrayList<>();
	        for (CompensationModel c:cm){
	            cdto.add(CompensationDto.getDto(c) );

	        }
	        return cdto;
	    }
	 public void saveMyData(CompensationDto cdto) {
		 CompensationModel cm = new CompensationModel();
		 cm.setId(cdto.getId());
	        cm.setEmployeeid((long) cdto.getEmployeeid());
	        cm.setComment(cdto.getComment());
	        cm.setChangereason(cdto.getChangereason());
	        cm.setOvertimerate(cdto.getOvertimerate());
	        cm.setOvertime(cdto.getOvertime());
	        cm.setPayrate(cdto.getPayrate());
	        cm.setPaytype(cdto.getPaytype());
	        cm.setPayschedule(cdto.getPayschedule());
	        cm.setCompensationeffectivedate(cdto.getCompensationeffectivedate());
	       
	        cr.save(cm);
	        
	    }
	

}
