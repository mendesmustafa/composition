package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Engine {

    private static double DEFAULT_VOLUME = 1.4;
    private static int DEFAULT_POWER = 90;
    private static FuelType DEFAULT_FUEL = FuelType.HYBRİD;

    private double volume;
    private int power;
    private FuelType fuelType;

    public Engine(double volume, int power, FuelType fuelType) {
        this.volume = volume;
        this.power = power;
        this.fuelType = fuelType;
    }

    public Engine() {
        this(DEFAULT_VOLUME, DEFAULT_POWER, DEFAULT_FUEL);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                ", fuelType=" + fuelType +
                '}';
    }
}
