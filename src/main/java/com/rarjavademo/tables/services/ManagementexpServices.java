package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.ClientdataDto;
import com.rarjavademo.tables.dto.ManagementexpDto;
import com.rarjavademo.tables.model.ClientdataModel;
import com.rarjavademo.tables.model.EmployeeexpModel;
import com.rarjavademo.tables.model.ManagementexpModel;
import com.rarjavademo.tables.repository.ManagementexpRepository;

@Component
public class ManagementexpServices {
	@Autowired
	ManagementexpRepository mr;
	public List<ManagementexpDto> getManagementexpRec(){
		Iterable<ManagementexpModel> mm = mr.findAll(); 
		List<ManagementexpDto> mdto = new ArrayList<>();
		for (ManagementexpModel m:mm){
            mdto.add(ManagementexpDto.getManagementexpDto(m) );
        }
		return null;
		
	}
	public void saveMyData(ManagementexpDto mgxdt) {
		 ManagementexpModel mgx = new ManagementexpModel();
		 mgx.setId(mgxdt.getId());
		 mgx.setEmployeeid(mgxdt.getEmployeeid());
		 mgx.setEntity(mgxdt.getEntity());
		 mgx.setExpensecode(mgxdt.getExpensecode());
		 mgx.setExpensedate(mgxdt.getExpensedate());
		 mgx.setClientcode(mgxdt.getClientcode());
		 mgx.setAmount(mgxdt.getAmount());
		 mgx.setApprovedby(mgxdt.getApprovedby());
		 mgx.setApprovaldate(mgxdt.getApprovaldate());
		 mgx.setModeofpayment(mgxdt.getModeofpayment());
		 mgx.setPaymentdate(mgxdt.getPaymentdate());
		 mgx.setCreationdate(mgxdt.getCreationdate());
		 mgx.setCreatedby(mgxdt.getCreatedby());
		 mgx.setUpdatedby(mgxdt.getUpdatedby());
		 mr.save(mgx);
		
	} 
}
