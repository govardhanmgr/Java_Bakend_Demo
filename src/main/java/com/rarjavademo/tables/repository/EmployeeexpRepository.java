package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rarjavademo.tables.model.EmployeeexpModel;

public interface EmployeeexpRepository extends JpaRepository<EmployeeexpModel, Long> {

}
