package org.example.officeequipment._class_extence;

import org.example.officeequipment.head_class.OfficeEquipment;

/**
 * Класс Router (Маршрутизатор) - наследуется от OfficeEquipment.
 *   Дополнительные поля: speed, band, security, ports, range,
 *   isDualBand, connectivityType.
 */
public class Router extends OfficeEquipment {
    private int speed;
    private String band;
    private String security;
    private int ports;
    private int range;
    private boolean isDualBand;
    private String connectivityType;

    public Router(String id,
                  String modelName,
                  String manufacturer,
                  int yearManufacture,
                  double price,
                  double weight,
                  boolean isOperational,
                  int speed,
                  String band,
                  String security,
                  int ports,
                  int range,
                  boolean isDualBand,
                  String connectivityType) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.speed = speed;
        this.band = band;
        this.security = security;
        this.ports = ports;
        this.range = range;
        this.isDualBand = isDualBand;
        this.connectivityType = connectivityType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public boolean isDualBand() {
        return isDualBand;
    }

    public void setDualBand(boolean dualBand) {
        isDualBand = dualBand;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    @Override
    public String toString() {
        return "Router{" +
                "speed=" + speed +
                ", band='" + band + '\'' +
                ", security='" + security + '\'' +
                ", ports=" + ports +
                ", range=" + range +
                ", isDualBand=" + isDualBand +
                ", connectivityType='" + connectivityType + '\'' +
                '}';
    }
}
