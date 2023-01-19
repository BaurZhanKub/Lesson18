package com.company;

public class Lamp {
    private int brightness;
    private boolean turnedOn = false;
    private int maxBrightness = 100;
    private int minBrightness = 10;
    private String color;
    public Lamp(String color){
        this.color = color;
    }
    public Lamp(String color,int minBright, int maxBright){
        this.color = color;
        maxBrightness = maxBright;
        minBrightness = minBright;
    }
    public Lamp(int minBrightness, int maxBrightness){
        this.minBrightness = minBrightness;
        this.maxBrightness = maxBrightness;
    }
    void toggle(){
        turnedOn = !turnedOn;
    }
    void makeBrightness(){
        brightness = Math.min(100, brightness+10);
    }
    void makeDimmer(){
        brightness = Math.max(10, brightness-10);
    }
}
