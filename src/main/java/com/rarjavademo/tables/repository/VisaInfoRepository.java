package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rarjavademo.tables.model.VisaInfoModel;


@Repository 
public interface VisaInfoRepository extends JpaRepository<VisaInfoModel, Long>{


}
