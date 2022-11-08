package com.rarjavademo.tables.controller;


import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.services.ExpensesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class ExpensesController {

    @Autowired
    ExpensesService es;

    @GetMapping(value = "/getexpdata")
    public com.rarjavademo.tables.dto.ResponseWrapper getExpRecs( HttpServletRequest request, HttpServletResponse response){
        com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
        try {
            List<ExpensesDto> listofexp = es.getExpRec();
            rw.setData(listofexp);
        }
        catch (Exception e){
            rw.setSuccess(false);
        }
        return  rw;
    }
}
