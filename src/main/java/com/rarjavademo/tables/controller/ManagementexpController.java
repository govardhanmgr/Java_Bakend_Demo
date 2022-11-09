package com.rarjavademo.tables.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rarjavademo.tables.dto.ClientdataDto;
import com.rarjavademo.tables.dto.EmployeeexpDto;
import com.rarjavademo.tables.dto.ManagementexpDto;
import com.rarjavademo.tables.services.ManagementexpServices;

@RestController
public class ManagementexpController {
@Autowired
ManagementexpServices ms;
@GetMapping(value = "/getManagementexpdata")
public com.rarjavademo.tables.dto.ResponseWrapper getManagementexpRec( HttpServletRequest request, HttpServletResponse response){
    com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
    try {
        List<ManagementexpDto> managementexpdata = ms.getManagementexpRec();
        rw.setData(managementexpdata);
    }
    catch (Exception e){
        rw.setSuccess(false);
    }
    return  rw;
}
@PostMapping(value = "/postmgmtexp")
public com.rarjavademo.tables.dto.ResponseWrapper postJonInfoData(@RequestBody ManagementexpDto  mgxdt, HttpServletRequest request,
        HttpServletResponse response) {
 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
    try {
        ms.saveMyData( mgxdt);

    } catch (Exception e) {
        rw.setSuccess(false);
    }
    rw.setMessage("Inserted Successfully");
    return rw;
}
}
