package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.JobInformationModel;

public interface JobInformationRepository extends JpaRepository<JobInformationModel, Long> {

}
