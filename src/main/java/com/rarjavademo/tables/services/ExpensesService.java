package com.rarjavademo.tables.services;


import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.model.ExpensesModel;
import com.rarjavademo.tables.repository.ExpensesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component
public class ExpensesService {

    @Autowired
    ExpensesRepository er;

    public List<ExpensesDto> getExpRec(){
        Iterable<ExpensesModel> em = er.findAll();
        List<ExpensesDto> edto = new ArrayList<>();
        for (ExpensesModel e:em){
            edto.add(ExpensesDto.getDto(e) );

        }
        return edto;
    }
}
