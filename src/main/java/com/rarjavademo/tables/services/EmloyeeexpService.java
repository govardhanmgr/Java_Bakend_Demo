package com.rarjavademo.tables.services;



import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import com.rarjavademo.tables.dto.EmployeeexpDto;
import com.rarjavademo.tables.model.ClientdataModel;
import com.rarjavademo.tables.model.EmployeeexpModel;
import com.rarjavademo.tables.repository.EmployeeexpRepository;



@Component
public class EmloyeeexpService {
    @Autowired
    EmployeeexpRepository exr;



   public List<EmployeeexpDto> getEmployeeexpRec() {
         Iterable<EmployeeexpModel> em = exr.findAll();
            List<EmployeeexpDto> emxdto = new ArrayList<>();
            for (EmployeeexpModel e:em){
                emxdto.add(EmployeeexpDto.getDto(e) );
            }
            return emxdto;
        
        
    }



public void saveMyData(EmployeeexpDto emxdt) {
	 EmployeeexpModel emx = new EmployeeexpModel();
      emx.setId(emxdt.getId());
         emx.setEmployeeid(emxdt.getEmployeeid());
         emx.setEntity(emxdt.getEntity());
         emx.setExpensecode(emxdt.getExpensecode());
         emx.setExpensedate(emxdt.getExpensedate());
         emx.setClientcode(emxdt.getClientcode());
         emx.setAmount(emxdt.getAmount());
         emx.setApprovedby(emxdt.getApprovedby());
         emx.setApprovaldate(emxdt.getApprovaldate());
         emx.setModeofpayment(emxdt.getModeofpayment());
         emx.setPaymentdate(emxdt.getPaymentdate());
         emx.setCreationdate(emxdt.getCreationdate());
         emx.setCreatedby(emxdt.getCreatedby());
         emx.setUpdatedby(emxdt.getUpdatedby());
         exr.save(emx);
         
	
}



}