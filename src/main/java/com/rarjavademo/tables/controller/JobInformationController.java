package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.services.JobInformationService;

@RestController
public class JobInformationController {
	 @Autowired
	 JobInformationService js;
	 
	 @GetMapping(value = "/getjobinfodata")
	    public com.rarjavademo.tables.dto.ResponseWrapper getJobInfoRec( HttpServletRequest request, HttpServletResponse response){
	        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
	        try {
	            List<JobInformationDto> jobinfo = js.getJobInfoRec();
	            rw.setData(jobinfo);
	        } 
	        catch (Exception e){
	            rw.setSuccess(false);
	        }
	        return  rw;
	    }
	 
	 @PostMapping(value = "/postjobinfodata")
		public com.rarjavademo.tables.dto.ResponseWrapper postJonInfoData(@RequestBody JobInformationDto jdto, HttpServletRequest request,
				HttpServletResponse response) {
		 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
			try {
				js.saveMyData(jdto);

				// rw.setData(gfg);
			} catch (Exception e) {
				rw.setSuccess(false);
			}
			rw.setMessage("Inserted Successfully");
			return rw;
		}

}
