package com.rarjavademo.tables.controller;


import com.rarjavademo.tables.dto.ResponseWrapper;
import com.rarjavademo.tables.dto.VisaInfoDto;

import com.rarjavademo.tables.services.VisaInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class VisaInfoController {
	
	@Autowired
    VisaInfoService vis;

	@GetMapping(value="/getvisainformation")
    public ResponseWrapper getUserData(HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<VisaInfoDto> listOfVisainfo = vis.getVisaInfoRecords();
            rw.setData(listOfVisainfo);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("Visa Information");

        return rw;

    }

}
