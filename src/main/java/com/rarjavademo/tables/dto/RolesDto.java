package com.rarjavademo.tables.dto;

import com.rarjavademo.tables.model.RolesModel;

public class RolesDto {
	
	private Long id;
    private String roles;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	public static RolesDto getDto(RolesModel r) {
		RolesDto rdt = new RolesDto();
		rdt.setId(r.getId());
		rdt.setRoles(r.getRoles());
		return rdt;
		
	}

}
