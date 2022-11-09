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
import com.rarjavademo.tables.dto.TimesheetDto;
import com.rarjavademo.tables.services.TimesheetServices;
@RestController  
public class TimesheetController {
	 @Autowired
	 TimesheetServices ts;
	 @PostMapping(value = "/posttimesheetdata")
		public com.rarjavademo.tables.dto.ResponseWrapper posttimesheetData(@RequestBody TimesheetDto tdto, HttpServletRequest request,
				HttpServletResponse response) {
		 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
			try {
				ts.saveMyData(tdto);

				// rw.setData(gfg);
			} catch (Exception e) {
				rw.setSuccess(false);
			}
			rw.setMessage("Inserted Successfully");
			return rw;
		}
	 
	 @GetMapping(value = "/gettimesheetdata")
	    public com.rarjavademo.tables.dto.ResponseWrapper gettimesheetRec( HttpServletRequest request, HttpServletResponse response){
	        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
	        try {
	            List<TimesheetDto> timesheet = ts.gettimesheetRec();
	            rw.setData(timesheet);
	        } 
	        catch (Exception e){
	            rw.setSuccess(false);
	        }
	        return  rw;
	    }
	 
}
