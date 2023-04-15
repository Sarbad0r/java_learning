package models;

import java.util.HashMap;
import java.util.Map;

public class TransportModel {
    // public, private, protected

    byte age = 27;
    short num1 = 128;
    int num2 = 12;
    long num3 = 31;

    float floatNum = 25.0f;
    double doubleNum = 25.0;
    public float speed;
    public float weight;
    public String color;
    public byte[] coordinate;

    //constructor in java
    //we can create many constructors to class in java
    public TransportModel(float speed, float weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.coordinate = coordinate;
    }

    //if some class is extending us this will help to not create constructor in another class
    public TransportModel(){}

    public TransportModel(Map<String, String> json) {
        speed = json.get("speed") != null ? Float.parseFloat(json.get("speed")) : 0;
        weight = json.get("weight") != null ? Float.parseFloat(json.get("weight")) : 0;

    }

    public void printTransport() {
        System.out.println("speed: " + speed + " weight: " + weight + " color: " + color + " coordinates: " + coordinate);
    }
}
