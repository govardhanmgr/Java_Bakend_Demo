package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.ClientdataDto;
import com.rarjavademo.tables.model.ClientdataModel;
import com.rarjavademo.tables.repository.ClientdataRepository;


@Component
public class ClientDataSevices {
	@Autowired
    ClientdataRepository cr;
	public List<ClientdataDto> getClientRec(){
        Iterable<ClientdataModel> em = cr.findAll();
        List<ClientdataDto> cdto = new ArrayList<>();
        for (ClientdataModel e:em){
            cdto.add(ClientdataDto.getClientDto(e) );
        }
        return cdto;
    }
}
