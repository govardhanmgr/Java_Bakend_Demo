package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.EducationModel;

public interface EducationRepository extends JpaRepository<EducationModel, Long> {

}
