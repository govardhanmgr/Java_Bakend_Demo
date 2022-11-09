package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.rarjavademo.tables.model.RegModel;

public interface RegRepository  extends JpaRepository<RegModel, Long> {



}
