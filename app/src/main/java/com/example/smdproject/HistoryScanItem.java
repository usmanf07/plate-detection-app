package com.example.smdproject;

public class HistoryScanItem {
    private String date;
    private String carName;
    private String plateNumber;
    private String ownerName;
    private int imageResId;
    private int ownerImageResId;

    public HistoryScanItem(String date, String carName, String plateNumber, String ownerName, int imageResId, int ownerImageResId) {
        this.date = date;
        this.carName = carName;
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.imageResId = imageResId;
        this.ownerImageResId = ownerImageResId;
    }

    public String getDate() {
        return date;
    }

    public String getCarName() {
        return carName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getOwnerImageResId() {
        return ownerImageResId;
    }
}

