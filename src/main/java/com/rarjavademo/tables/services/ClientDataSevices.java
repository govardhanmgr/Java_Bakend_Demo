package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.ClientdataDto;
import com.rarjavademo.tables.dto.ExpensesDto;
import com.rarjavademo.tables.model.ClientdataModel;
import com.rarjavademo.tables.model.ExpensesModel;
import com.rarjavademo.tables.repository.ClientdataRepository;
import com.rarjavademo.tables.repository.ExpensesRepository;

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
	public void saveMyData(ClientdataDto cdto) {

		 ClientdataModel cm = new ClientdataModel();
		  cm.setId(cdto.getId());
	        cm.setClientcode(cdto.getClientcode());
	        cm.setClientname(cdto.getClientname());
	        cm.setTaxfederal(cdto.getTaxfederal());
	        cm.setClientlocation(cdto.getClientlocation());
	        cm.setAgreementstartdate(cdto.getAgreementstartdate());
	        cm.setServiceagreementonboarded(cdto.getServiceagreementonboarded());
	        cm.setAgreementenddate(cdto.getAgreementenddate());
	        cr.save(cm);
	        	
       }
}
