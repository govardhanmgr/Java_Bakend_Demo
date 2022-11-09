package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.EmpdataModel;



public interface EmpdataRepository extends JpaRepository<EmpdataModel, Long> {

}
