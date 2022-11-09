package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.ClientdataModel;


public interface ClientdataRepository extends JpaRepository<ClientdataModel, Long> {

}
