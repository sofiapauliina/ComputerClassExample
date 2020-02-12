package com;

public class Monitor {
    private String model;
    private int manufacturingYear;
    private String manufacturer;
    private int price;
    private int size;

    public Monitor(String model, int manufacturingYear, String manufacturer, int price, int size) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.manufacturer = manufacturer;
        this.price = price;
        this.size = size;
    }

    public void colorPixel (int x, int y, String color) {
        System.out.println("Coloring pixel at " + x + " , " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
