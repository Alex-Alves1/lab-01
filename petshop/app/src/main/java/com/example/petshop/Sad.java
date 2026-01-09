package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{

    public Sad(String name, Date date) {
        super(name, date);
    }

    public Sad(String name) {
        super(name);
    }

    @Override
    public String moodReturn() {
        return "Sad";
    }
}
