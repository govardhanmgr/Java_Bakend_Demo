package com.rarjavademo.tables.dto;


import com.rarjavademo.tables.model.ExpensesModel;

public class ExpensesDto {
    private Long id;
    private String expenses;
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


    public static ExpensesDto getDto(ExpensesModel i){
    	ExpensesDto edt= new ExpensesDto();
        edt.setId(i.getId());
        edt.setExpensecode(i.getExpensecode());
        edt.setExpenses(i.getExpenses());
        return edt;
    }
    
}
