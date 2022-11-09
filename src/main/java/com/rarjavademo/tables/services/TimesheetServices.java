package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.dto.TimesheetDto;
import com.rarjavademo.tables.model.JobInformationModel;
import com.rarjavademo.tables.model.TimesheetModel;
import com.rarjavademo.tables.repository.TimesheetRepository;



@Component
public class TimesheetServices {
	
	
	@Autowired
    TimesheetRepository tr;
	
	//postmethod
	public void saveMyData(TimesheetDto tdto) {
		 TimesheetModel tmd = new TimesheetModel();
		 tmd.setId(tdto.getId());
		 tmd.setEmployeeid(tdto.getEmployeeid());
		 tmd.setPeriod(tdto.getPeriod());
		 tmd.setClientid(tdto.getClientid());
		 tmd.setNoofhours(tdto.getNoofhours());
		 tmd.setPayrate(tdto.getPayrate());
		 tmd.setRevenuerate(tdto.getRevenuerate());
		 tmd.setCreationdate(tdto.getCreationdate());
		 tmd.setOperationalcost(tdto.getOperationalcost());
		 tmd.setReceivables(tdto.getReceivables());
		 tmd.setReceivablespaid(tdto.getReceivablespaid());
		 tmd.setCreatedby(tdto.getCreatedby());
		 tmd.setUpdatedby(tdto.getUpdatedby());
		 tmd.setUpdateddate(tdto.getUpdateddate());
		 tr.save(tmd);
	        
	    }
	
	
	//getmethod
	public List<TimesheetDto> gettimesheetRec() {
		Iterable<TimesheetModel> td = tr.findAll();
        List<TimesheetDto> tdto = new ArrayList<>();
        for (TimesheetModel tm:td){
            tdto.add(TimesheetDto.getTimesheetDto(tm) );
        }
		return tdto;
	}
	

	        
	}
	
	


