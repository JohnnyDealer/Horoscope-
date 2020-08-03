package com.example.windowmain;

public enum Elements {
    EARTH(new String[] {"Taurus", "Virgo", "Capricorn"}),
    WATER(new String[] {"Cancer", "Scorpio", "Pisces"}),
    FIRE(new String[] {"Aries", "Leo", "Sagittarius"}),
    AIR(new String[] {"Gemini", "Libra", "Aquarius"});
    private String[] str;
    Elements(String[] strings)
    {
        this.str = strings;
    }
    public String[] getSymbols(){return this.str;}

}
