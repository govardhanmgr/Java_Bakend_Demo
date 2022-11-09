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
import com.rarjavademo.tables.services.EmloyeeexpService;





@RestController
public class EmployeeexpController {
     @Autowired
     EmloyeeexpService exs;
     
     @GetMapping(value = "/getemployeeexpdata")
        public com.rarjavademo.tables.dto.ResponseWrapper getEmployeeexpRec( HttpServletRequest request, HttpServletResponse response){
            com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
            try {
                List<EmployeeexpDto> employeeexp = exs.getEmployeeexpRec();
                rw.setData(employeeexp);
            }
            catch (Exception e){
                rw.setSuccess(false);
            }
            return  rw;
        }
     @PostMapping(value = "/postemployeeexp")
     public com.rarjavademo.tables.dto.ResponseWrapper postJonInfoData(@RequestBody EmployeeexpDto emxdt, HttpServletRequest request,
             HttpServletResponse response) {
      com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
         try {
             exs.saveMyData(emxdt);



           
         } catch (Exception e) {
             rw.setSuccess(false);
         }
         rw.setMessage("Inserted Successfully");
         return rw;
     }
}
