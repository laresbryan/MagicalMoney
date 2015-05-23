package com.example.laresbryan.magicalmoney;



public class Transaction {
    private String payee;
    private int expense;
    private int amount;
    private String note;
    private String date;

    public Transaction() {
    }

    public Transaction(String payee, int expense, int amount, String date) {
        this.payee = payee;
        this.expense= expense;
        this.amount = amount;
        this.date = date;
    }

    public Transaction(String payee, int expense, int amount, String date, String note) {
        this.payee = payee;
        this.expense= expense;
        this.amount = amount;
        this.date = date;
        this.note = note;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense= expense;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }
}

