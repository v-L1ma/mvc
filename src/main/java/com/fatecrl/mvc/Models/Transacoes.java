package com.fatecrl.mvc.Models;

public class Transacoes {
    int id;
    String type;
    String receiverName;
    String date;
    int value;
    
    public Transacoes(int id, String type, String receiverName, String date, int value) {
        this.id = id;
        this.type = type;
        this.receiverName = receiverName;
        this.date = date;
        this.value = value;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
