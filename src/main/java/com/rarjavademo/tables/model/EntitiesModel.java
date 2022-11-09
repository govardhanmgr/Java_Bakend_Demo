package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orgndata")

public class EntitiesModel {
	@Id
    @GeneratedValue
    @Column
    private Long id;
	
	@Column(name = "entity")
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

	@Override
	public String toString() {
		return "EntitiesModel [id=" + id + ", entity=" + entity + "]";
	}



	

	

}
