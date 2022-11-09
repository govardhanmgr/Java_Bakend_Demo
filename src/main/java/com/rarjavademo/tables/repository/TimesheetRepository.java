package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.TimesheetModel;

public interface TimesheetRepository extends JpaRepository<TimesheetModel,Long>{

	

}
