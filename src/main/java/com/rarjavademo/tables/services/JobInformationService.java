package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.model.JobInformationModel;
import com.rarjavademo.tables.repository.JobInformationRepository;

@Component
public class JobInformationService {
	
	 @Autowired
	 JobInformationRepository jr;
	 
	 public List<JobInformationDto> getJobInfoRec(){
	        Iterable<JobInformationModel> jm = jr.findAll();
	        List<JobInformationDto> idto = new ArrayList<>();
	        for (JobInformationModel e:jm){
	            idto.add(JobInformationDto.getInformationDto(e) );

	        }
	        return idto;
	    }
	 public void saveMyData(JobInformationDto jdto) {
		 JobInformationModel jm = new JobInformationModel();
		 jm.setId(jdto.getId());
	        jm.setJobeffectivedate(jdto.getJobeffectivedate());
	        jm.setLocation(jdto.getLocation());
	        jm.setClientname(jdto.getClientname());
	        jm.setJobtitle(jdto.getJobtitle());
	        jm.setReportsto(jdto.getReportsto());
	        jm.setEmployeeid(jdto.getEmployeeid());
	        jr.save(jm);
	        
	    }
}
