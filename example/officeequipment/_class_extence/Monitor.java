package org.example.officeequipment._class_extence;

import org.example.officeequipment.head_class.OfficeEquipment;

/**
 *   Класс Monitor (Монитор) - наследуется от OfficeEquipment.
 *   Дополнительные поля: screenSize, resolution, panelType,
 *   refreshRate, isCurved, ports, isHDR.
 */
public class Monitor extends OfficeEquipment {

    double screenSize;
    String resolution;
    String panelType;
    boolean isCurved;
    String ports;
    boolean isHDR;

    public Monitor(int id,
                   String modelName,
                   String manufacturer,
                   int yearManufacture,
                   int price,
                   double weight,
                   boolean isOperational,
                   double screenSize,
                   String resolution,
                   String panelType,
                   boolean isCurved,
                   String ports,
                   boolean isHDR) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.panelType = panelType;
        this.isCurved = isCurved;
        this.ports = ports;
        this.isHDR = isHDR;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public boolean isHDR() {
        return isHDR;
    }

    public void setHDR(boolean HDR) {
        isHDR = HDR;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", panelType='" + panelType + '\'' +
                ", isCurved=" + isCurved +
                ", ports='" + ports + '\'' +
                ", isHDR=" + isHDR +
                '}';
    }
}
