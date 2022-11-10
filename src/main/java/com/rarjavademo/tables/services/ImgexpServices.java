package com.rarjavademo.tables.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rarjavademo.tables.dto.ImgexpDto;
import com.rarjavademo.tables.model.ImgexpModel;
import com.rarjavademo.tables.repository.ImgexpRepository;
@Component
public class ImgexpServices {
	
	@Autowired
	ImgexpRepository er;

	public List<ImgexpDto> getImgexpRecs() {
		Iterable<ImgexpModel> em = er.findAll();
        List<ImgexpDto> edto = new ArrayList<>();
        for (ImgexpModel e:em){
            edto.add(ImgexpDto.getDto(e) );

        }
        return edto;
    }

	public void saveMyData(ImgexpDto idto) {
		// TODO Auto-generated method stub
		ImgexpModel img=new ImgexpModel();
		img.setEmployeeid(idto.getEmployeeid());
		img.setEntity(idto.getEntity());
		img.setExpensescode(idto.getExpensescode());
		img.setExpdate(idto.getExpdate());
		img.setAmount(idto.getAmount());
		img.setApprovedby(idto.getApprovedby());
		img.setApprovaldate(idto.getApprovaldate());
		img.setModeofpayment(idto.getModeofpayment());
		img.setPaymentdate(idto.getPaymentdate());
		img.setCreationdate(idto.getCreationdate());
		img.setCreatedby(idto.getCreatedby());
		img.setUpdatedby(idto.getUpdatedby());
		img.setId(idto.getId());
		
		er.save(img);
		
		
		
		
		
		
		
		
	}
	

}
