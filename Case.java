package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private CaseDimensions dimensions;
    private int price;

    public Case(String model, String manufacturer, CaseDimensions dimensions, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CaseDimensions getDimensions() {
        return dimensions;
    }

    public int getPrice() {
        return price;
    }
}



