package com.company;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int RamSlots;
    private int cardSlots;
    private int price;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        RamSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.price = price;
    }

    public void setUpProgram (String programName) {
        System.out.println("Setting up " + programName + "...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return RamSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getPrice() {
        return price;
    }
}
