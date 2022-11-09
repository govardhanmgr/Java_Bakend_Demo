package com.rarjavademo.tables.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rarjavademo.tables.dto.EducationDto;
import com.rarjavademo.tables.services.EducationService;

@RestController
public class EducationController {

	 @Autowired
	 EducationService educationservice;
	 @GetMapping(value = "/geteducationdata")
	    public com.rarjavademo.tables.dto.ResponseWrapper getEducationRec( HttpServletRequest request, HttpServletResponse response){
	        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
	        try {
	            List<EducationDto> educationinfo = educationservice.getEducationRec();
	            rw.setData(educationinfo);
	        } 
	        catch (Exception e){
	            rw.setSuccess(false);
	        }
	        return  rw;
	    }
	 @PostMapping(value = "/posteducationdata")
		public com.rarjavademo.tables.dto.ResponseWrapper postEducationData(@RequestBody EducationDto edudto, HttpServletRequest request,
				HttpServletResponse response) {
		 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
			try {
				educationservice.saveMyData(edudto);
			} catch (Exception e) {
				rw.setSuccess(false);
			}
			rw.setMessage("Inserted Successfully");
			return rw;
		}
}
