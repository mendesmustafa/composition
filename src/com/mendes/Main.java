package com.mendes;

import javax.swing.*;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Main {

    public static void main(String[] args) {

        EngineVehicle engineVehicle = new EngineVehicle("Fiat", 2018, new Engine(1.6, 130, FuelType.BENZINE));
        JOptionPane.showMessageDialog(null, "EngineVehicle Info:\n" + engineVehicle);

        String brand = new String("Yamaha");
        int year = 2019;
        Engine engine = new Engine(0.6, 120, FuelType.DIZEL);
        EngineVehicle engineVehicle2 = new EngineVehicle(brand, year, engine);
        JOptionPane.showMessageDialog(null, "EngineVehicle2 Info:\n" + engineVehicle2);

        engine.setPower(138);
        JOptionPane.showMessageDialog(null, "Info2 Updated:\n" + engineVehicle2);

        engineVehicle.getEngine().setVolume(1.8);
        JOptionPane.showMessageDialog(null, "Info Updated:\n" + engineVehicle);

        EngineVehicle defaultEngineVehicle = new EngineVehicle("Renault", 2015, new Engine());
        JOptionPane.showMessageDialog(null, "default Info:\n" + defaultEngineVehicle);
    }
}