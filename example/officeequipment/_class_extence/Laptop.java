package org.example.officeequipment._class_extence;

import org.example.officeequipment.head_class.OfficeEquipment;

/**
 * Класс Laptop (Ноутбук) - наследуется от OfficeEquipment.
 *   Дополнительные поля: processorType, ramSize, storageSize,
 *   batteryLife, screenSize, operatingSystem, isTouchscreen.
 */
public class Laptop extends OfficeEquipment {
    private   String processorType;
    private int ramSize;
    private double storageSize;
    private double batteryLife;
    private double screenSize;
    private String operatingSystem;
    private boolean isTouchscreen;

    public Laptop(String id,
                  String modelName,
                  String manufacturer,
                  int yearManufacture,
                  double price,
                  double weight,
                  boolean isOperational,
                  String processorType,
                  int ramSize,
                  double storageSize,
                  double batteryLife,
                  double screenSize,
                  String operatingSystem,
                  boolean isTouchscreen) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.isTouchscreen = isTouchscreen;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processorType='" + processorType + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                ", batteryLife=" + batteryLife +
                ", screenSize=" + screenSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", isTouchscreen=" + isTouchscreen +
                '}';
    }
}
