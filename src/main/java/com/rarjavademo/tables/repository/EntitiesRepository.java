package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.EntitiesModel;


public interface EntitiesRepository extends JpaRepository<EntitiesModel,Long>  {

	

}
