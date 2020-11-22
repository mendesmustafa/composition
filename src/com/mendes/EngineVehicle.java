package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class EngineVehicle {

    private String brand;
    private int year;
    private Engine engine;


    public EngineVehicle(String brand, int year, Engine engine) {
        this.brand = brand;
        this.year = year;
        this.engine = engine;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "EngineVehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
