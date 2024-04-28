package org.example.officeequipment.classes;

/**
 *
 Класс Printer (Принтер) - наследуется от OfficeEquipment.
 Дополнительные поля: printTechnology, printSpeed, maxResolution,
 isColor, paperSize, connectivity, dutyCycle.
 */
public class Printer extends OfficeEquipment {
    String connectivity;
    String printTechnology;
    String  paperSize;
    double printSpeed;
    String maxResolution;
    boolean isColor;
    int dutyCycle;

    public Printer(int id,
                   String modelName,
                   String manufacturer,
                   int yearManufacture,
                   int price,
                   double weight,
                   boolean isOperational,
                   String connectivity,
                   String printTechnology,
                   String paperSize,
                   double printSpeed,
                   String maxResolution,
                   boolean isColor,
                   int dutyCycle) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.connectivity = connectivity;
        this.printTechnology = printTechnology;
        this.paperSize = paperSize;
        this.printSpeed = printSpeed;
        this.maxResolution = maxResolution;
        this.isColor = isColor;
        this.dutyCycle = dutyCycle;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getPrintTechnology() {
        return printTechnology;
    }

    public void setPrintTechnology(String printTechnology) {
        this.printTechnology = printTechnology;
    }

    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public double getPrintSpeed() {
        return printSpeed;
    }

    public void setPrintSpeed(double printSpeed) {
        this.printSpeed = printSpeed;
    }

    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public int getDutyCycle() {
        return dutyCycle;
    }

    public void setDutyCycle(int dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "connectivity='" + connectivity + '\'' +
                ", printTechnology='" + printTechnology + '\'' +
                ", paperSize='" + paperSize + '\'' +
                ", printSpeed=" + printSpeed +
                ", maxResolution='" + maxResolution + '\'' +
                ", isColor=" + isColor +
                ", dutyCycle=" + dutyCycle +
                '}';
    }
}
