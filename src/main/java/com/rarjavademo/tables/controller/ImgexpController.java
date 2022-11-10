package com.rarjavademo.tables.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rarjavademo.tables.dto.ImgexpDto;
import com.rarjavademo.tables.dto.JobInformationDto;
import com.rarjavademo.tables.dto.ResponseWrapper;
import com.rarjavademo.tables.services.ImgexpServices;

@RestController

public class ImgexpController {

	@Autowired
	ImgexpServices es;

	@GetMapping(value = "/getimgexpdata")
	public ResponseWrapper getImgexpRecs(HttpServletRequest request, HttpServletResponse response) {
		ResponseWrapper rw = new ResponseWrapper(true);
		try {
			List<ImgexpDto> listofImgexp = es.getImgexpRecs();
			rw.setData(listofImgexp);
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		return rw;
	}
	 @PostMapping(value = "/postimgexpdata")
		public com.rarjavademo.tables.dto.ResponseWrapper postimgexpdata(@RequestBody ImgexpDto idto, HttpServletRequest request,
				HttpServletResponse response) {
		 com.rarjavademo.tables.dto.ResponseWrapper rw = new com.rarjavademo.tables.dto.ResponseWrapper(true);
			try {
				es.saveMyData(idto);

				// rw.setData(gfg);
			} catch (Exception e) {
				rw.setSuccess(false);
			}
			rw.setMessage("Inserted Successfully");
			return rw;
		}

}
