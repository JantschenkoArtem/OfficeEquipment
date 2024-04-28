package org.example.officeequipment.head_class;

/**
 * Базовый класс OfficeEquipment (Офисная техника) - общий класс для всей техники.
 *   Поля: id, modelName (модель), manufacturer (производитель),
 *   yearOfManufacture (год выпуска), price, weight, isOperational (исправность).
 */
public class OfficeEquipment {
    private String id;
    private String modelName;
    private String manufacturer;
    private int yearManufacture;
    private double price;
    private double weight;
    private boolean isOperational;

    public OfficeEquipment(String id, String modelName, String manufacturer, int yearManufacture, double price, double weight, boolean isOperational) {
        this.id = id;
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        this.price = price;
        this.weight = weight;
        this.isOperational = isOperational;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public String toString() {
        return "OfficeEquipment{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}' + '\'';
    }
}
