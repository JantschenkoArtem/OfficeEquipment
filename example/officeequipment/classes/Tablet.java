package org.example.officeequipment.classes;

/**
 * Класс Tablet (Планшет) - наследуется от OfficeEquipment.
 *   Дополнительные поля: screenSize, storageSize, operatingSystem,
 *   batteryLife, isCellular, cameraResolution, processorType.
 */
public class Tablet extends OfficeEquipment {

    double screenSize;
    int storageSize;
    String operatingSystem;
    int batteryLife;
    boolean isCellular;
    String cameraResolution;
    String processorType;

    public Tablet(int id,
                  String modelName,
                  String manufacturer,
                  int yearManufacture,
                  int price,
                  double weight,
                  boolean isOperational,
                  double screenSize,
                  int storageSize,
                  String operatingSystem,
                  int batteryLife,
                  boolean isCellular,
                  String cameraResolution,
                  String processorType) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isCellular = isCellular;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isCellular() {
        return isCellular;
    }

    public void setCellular(boolean cellular) {
        isCellular = cellular;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "screenSize=" + screenSize +
                ", storageSize=" + storageSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryLife=" + batteryLife +
                ", isCellular=" + isCellular +
                ", cameraResolution='" + cameraResolution + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
