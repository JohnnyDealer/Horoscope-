package com.example.windowmain;

public enum Symbols {
    Aries("Овен"),
    Taurus("Телец"),
    Gemini("Близнецы"),
    Cancer("Рак"),
    Leo("Лев"),
    Virgo("Дева"),
    Libra("Весы"),
    Scorpio("Скорпион"),
    Sagittarius("Стрелец"),
    Capricorn("Козерог"),
    Aquarius("Водолей"),
    Pisces("Рыбы");
    private String string;
    Symbols(String str)
    {
        this.string = str;
    }
    public String getTranslateSymbol(){return this.string;}
}
