package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.EntitiesModel;

public class EntitiesDto {
	private Long id;
    private String entity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	public static EntitiesDto getDto(EntitiesModel e) {
		EntitiesDto ent = new EntitiesDto();
		ent.setId(e.getId());
		ent.setEntity(e.getEntity());
		return ent;
		
	}

}
