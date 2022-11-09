package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.CompensationDto;
import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.services.CompensationService;

@RestController
public class CompensationController {
	@Autowired
	CompensationService cs;
    @GetMapping(value = "/getcompensationdata")

    public com.rarjavademo.tables.dto.ResponseWrapper getCompenstionRecs( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<CompensationDto> listofexp = cs.getCompensationRec();
            rw.setData(listofexp);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
        return  rw;
    }
    @PostMapping(value = "/postcompensationdata")
	public com.rarjavademo.tables.dto.ResponseWrapper postJonInfoData(@RequestBody CompensationDto cdto, HttpServletRequest request,
			HttpServletResponse response) {
	 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
		try {
			cs.saveMyData(cdto);

			// rw.setData(Gag);
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		rw.setMessage("Inserted Successfully");
		return rw;
	}


}
