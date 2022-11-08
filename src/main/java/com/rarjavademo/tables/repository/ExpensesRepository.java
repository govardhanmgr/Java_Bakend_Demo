package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rarjavademo.tables.model.ExpensesModel;

public interface ExpensesRepository extends JpaRepository<ExpensesModel, Long>{

}
