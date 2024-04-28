package org.example.officeequipment.classes;

/**
 *
 Класс Switch (Коммутатор) - наследуется от OfficeEquipment.
 Дополнительные поля: portCount, speed, layer, managementType,
 powerOverEthernet, stackable, formFactor.
 */
public class Switch extends OfficeEquipment{
    private int portCount;
    private int speed;
   private int layer;
   private String managementType;
   private boolean powerOverEthernet;
   private boolean stackable;
   private String formFactor;

    public Switch(int id,
                  String modelName,
                  String manufacturer,
                  int yearManufacture,
                  int price,
                  double weight,
                  boolean isOperational,
                  int portCount,
                  int speed,
                  int layer,
                  String managementType,
                  boolean powerOverEthernet,
                  boolean stackable,
                  String formFactor) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.portCount = portCount;
        this.speed = speed;
        this.layer = layer;
        this.managementType = managementType;
        this.powerOverEthernet = powerOverEthernet;
        this.stackable = stackable;
        this.formFactor = formFactor;
    }

    public int getPortCount() {
        return portCount;
    }

    public void setPortCount(int portCount) {
        this.portCount = portCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public boolean isPowerOverEthernet() {
        return powerOverEthernet;
    }

    public void setPowerOverEthernet(boolean powerOverEthernet) {
        this.powerOverEthernet = powerOverEthernet;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Switch{" +
                "portCount=" + portCount +
                ", speed=" + speed +
                ", layer=" + layer +
                ", managementType='" + managementType + '\'' +
                ", powerOverEthernet=" + powerOverEthernet +
                ", stackable=" + stackable +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
