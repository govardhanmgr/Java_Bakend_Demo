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
	

}
