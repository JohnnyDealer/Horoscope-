package com.example.windowmain;

public enum Rulers {
    Sun("Солнце"),
    Jupiter("Юпитер"),
    Saturn("Сатурн"),
    Mars("Марс"),
    Mercury("Меркурий"),
    Venus("Венера"),
    Neptune("Нептун"),
    Chiron("Хирон"),
    Moon("Луна");
    private String string;
    Rulers(String str)
    {
        this.string = str;
    }
    public String getTranslateRuler(){return this.string;}
}
