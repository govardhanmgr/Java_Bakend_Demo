package com.rarjavademo.tables.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expenses")
public class ExpensesModel {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(name = "expenses")
    private String expenses;

    @Column(name = "expensecode")
    private String expensecode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public String getExpensecode() {
        return expensecode;
    }

    public void setExpensecode(String expensecode) {
        this.expensecode = expensecode;
    }

    @Override
    public String toString() {
        return "ExpModel{" +
                "id=" + id +
                ", expenses='" + expenses + '\'' +
                ", expensecode='" + expensecode + '\'' +
                '}';
    }
}
