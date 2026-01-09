package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private String name;
    private Date date;

    public Mood(String name) {
        this.name = name;
        this.date = new Date();
    }

    public Mood(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String moodReturn();
}
