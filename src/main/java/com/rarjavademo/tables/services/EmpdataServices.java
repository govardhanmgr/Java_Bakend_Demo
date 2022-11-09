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
    EmpdataRepository emprepo;
	
	public List<EmpdataDto> getEmpdata() {
		// TODO Auto-generated method stub
		
		 Iterable<EmpdataModel> ed = emprepo.findAll();
	        List<EmpdataDto> edto = new ArrayList<>();
	        for (EmpdataModel i:ed){
	            edto.add(EmpdataDto.getDto(i) );
	        }
	        return edto;
	    }

	public void saveMyData(EmpdataDto empdto) {
		// TODO Auto-generated method stub
		 EmpdataModel empmodel = new EmpdataModel();
         empmodel.setEmployeeid(empdto.getEmployeeid());
         empmodel.setFirstname(empdto.getFirstname());
         empmodel.setLastname(empdto.getFirstname());
         empmodel.setLastname(empdto.getLastname());
         empmodel.setFullname(empdto.getFullname());
         empmodel.setEmpstatus(empdto.getEmpstatus());
         empmodel.setEmailaddress(empdto.getEmailaddress());
         empmodel.setJobtitle(empdto.getJobtitle());
         empmodel.setInternalstaff(empdto.getInternalstaff());
         empmodel.setSupervisor(empdto.getSupervisor());
         empmodel.setVisastatus(empdto.getVisastatus());
         empmodel.setGender(empdto.getGender());
         empmodel.setEntity(empdto.getEntity());
         empmodel.setDateofbirth(empdto.getDateofbirth());
         empmodel.setClientname(empdto.getClientname());
         empmodel.setClientcode(empdto.getClientcode());
         empmodel.setStartdate(empdto.getStartdate());
         empmodel.setCreatedby(empdto.getCreatedby());
         empmodel.setUpdatedby(empdto.getUpdatedby());
         empmodel.setImmigrationstatus(empdto.getImmigrationstatus());
         empmodel.setHighestdegree(empdto.getHighestdegree());
         empmodel.setUniversity(empdto.getUniversity());
         empmodel.setId(empdto.getId());
         empmodel.setContactnumber(empdto.getContactnumber());
         empmodel.setAddressline1(empdto.getAddressline1());
         empmodel.setAddressline2(empdto.getAddressline2());
         empmodel.setCity(empdto.getCity());
         empmodel.setState(empdto.getState());
         empmodel.setZipcode(empdto.getZipcode());
         empmodel.setCountry(empdto.getCountry());
         empmodel.setSsn(empdto.getSsn());
         empmodel.setTaxfilenumber(empdto.getTaxfilenumber());
         empmodel.setEmergencynumber(empdto.getEmergencynumber());
         empmodel.setEffectivedate(empdto.getEffectivedate());
         empmodel.setLocation(empdto.getLocation());
         empmodel.setReportsto(empdto.getReportsto());
         empmodel.setPayschedule(empdto.getPayschedule());
         empmodel.setPaytype(empdto.getPaytype());
         empmodel.setPayrate(empdto.getPayrate());
         empmodel.setOvertime(empdto.getOvertime());
         empmodel.setOvertimeratee(empdto.getOvertimeratee());
         empmodel.setChangereason(empdto.getChangereason());
         empmodel.setComment(empdto.getComment());
         empmodel.setSpecialization(empdto.getSpecialization());
         empmodel.setGpa(empdto.getGpa());
         empmodel.setDegreestartdate(empdto.getDegreestartdate());
         empmodel.setDegreeenddate(empdto.getDegreeenddate());
         empmodel.setDate(empdto.getDate());
         empmodel.setIssuingcountry(empdto.getIssuingcountry());
         empmodel.setIssueddate(empdto.getIssueddate());
         empmodel.setExpirationdate(empdto.getExpirationdate());
         empmodel.setStatus(empdto.getStatus());
         empmodel.setEmployementstatus(empdto.getEmployementstatus());
         empmodel.setJobeffectivedate(empdto.getJobeffectivedate());
         empmodel.setCompensationeffectivedate(empdto.getCompensationeffectivedate());
         emprepo.save(empmodel);
	}
	
	
	}


