package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy(String name) {
        super(name);
    }

    public Happy(String name, Date date) {
        super(name, date);
    }

    @Override
    public String moodReturn() {
        return "Happy";
    }
}
