package com.rashiktimalsina.OOPs.Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private int screen_size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int screen_size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screen_size = screen_size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + ", " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreen_size() {
        return screen_size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }



}
