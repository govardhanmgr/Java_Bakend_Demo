package com.rarjavademo.tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rarjavademo.tables.model.PayrollExpensesModel;

public interface PayrollExpensesRepository extends JpaRepository<PayrollExpensesModel, Long> {

}
