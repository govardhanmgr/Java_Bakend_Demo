package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.RolesModel;

public interface RolesRepository extends JpaRepository<RolesModel, Long> {

	

}
