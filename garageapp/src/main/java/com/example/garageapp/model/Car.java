package com.example.garageapp.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;
@Entity
public class Car {
  public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW
    }
    @Id
    private int id;
    private String mode;
    private String brand;
    private int year;
    private Color color;

    public Car(int id,String mode, String brand, int year, Color color) {
        this.id=id;
        this.mode = mode;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
