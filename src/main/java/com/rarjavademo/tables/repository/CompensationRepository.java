package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.CompensationModel;

public interface CompensationRepository extends JpaRepository<CompensationModel, Long> {

}
