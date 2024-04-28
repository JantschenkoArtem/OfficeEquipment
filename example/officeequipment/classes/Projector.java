package org.example.officeequipment.classes;

/**
 *
 Класс Projector (Проектор) - наследуется от OfficeEquipment.
 Дополнительные поля: lumen, resolution, contrastRatio, lampLife,
 projectionSize, connectivity, is3DReady.
 */
public class Projector extends OfficeEquipment {
    private int lumen;
    private String resolution;
    private String contrastRatio;
    private int lampLife;
    private double projectionSize;
    private String connectivity;
    private boolean is3DReady;

    public Projector(int id,
                     String modelName,
                     String manufacturer,
                     int yearManufacture,
                     int price,
                     double weight,
                     boolean isOperational,
                     int lumen,
                     String resolution,
                     String contrastRatio,
                     int lampLife,
                     double projectionSize,
                     String connectivity,
                     boolean is3DReady) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.lumen = lumen;
        this.resolution = resolution;
        this.contrastRatio = contrastRatio;
        this.lampLife = lampLife;
        this.projectionSize = projectionSize;
        this.connectivity = connectivity;
        this.is3DReady = is3DReady;
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getContrastRatio() {
        return contrastRatio;
    }

    public void setContrastRatio(String contrastRatio) {
        this.contrastRatio = contrastRatio;
    }

    public int getLampLife() {
        return lampLife;
    }

    public void setLampLife(int lampLife) {
        this.lampLife = lampLife;
    }

    public double getProjectionSize() {
        return projectionSize;
    }

    public void setProjectionSize(double projectionSize) {
        this.projectionSize = projectionSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isIs3DReady() {
        return is3DReady;
    }

    public void setIs3DReady(boolean is3DReady) {
        this.is3DReady = is3DReady;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "lumen=" + lumen +
                ", resolution='" + resolution + '\'' +
                ", contrastRatio='" + contrastRatio + '\'' +
                ", lampLife=" + lampLife +
                ", projectionSize=" + projectionSize +
                ", connectivity='" + connectivity + '\'' +
                ", is3DReady=" + is3DReady +
                '}';
    }
}
