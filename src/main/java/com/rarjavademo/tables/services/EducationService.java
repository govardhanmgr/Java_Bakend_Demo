package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.rarjavademo.tables.dto.EducationDto;
import com.rarjavademo.tables.model.EducationModel;
import com.rarjavademo.tables.repository.EducationRepository;

@Component
public class EducationService {

	@Autowired
	EducationRepository educationrepository;
	 public List<EducationDto> getEducationRec(){
	        Iterable<EducationModel> n = educationrepository.findAll();
	        List<EducationDto> educationdto = new ArrayList<>();
	        for (EducationModel e:n){
	            educationdto.add(EducationDto.getEduDto(e) );

	        }
	        return educationdto;
	    }
	 public void saveMyData(EducationDto edudto) {
		 EducationModel em = new EducationModel();
		 em.setId(edudto.getId());
	    	em.setUniversity(edudto.getUniversity());
	    	em.setDegreeenddate(edudto.getDegreeenddate());
	    	em.setDegreestartdate(edudto.getDegreestartdate());
	    	em.setHighestdegree(edudto.getHighestdegree());
	    	em.setSpecialization(edudto.getSpecialization());
	    	em.setGpa(edudto.getGpa());
	    	em.setEmployeeid(edudto.getEmployeeid());
		 educationrepository.save(em);
	        
	    }
}
