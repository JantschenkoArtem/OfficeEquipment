package org.example.officeequipment._class_extence;

import org.example.officeequipment.head_class.OfficeEquipment;

/**
 * Класс Scanner (Сканер) - наследуется от OfficeEquipment.
 * Дополнительные поля: scanResolution, scanSpeed, colorDepth,
 * maxPaperSize, connectivity, isDuplexScanning, scannerType.
 */
public class Scanner extends OfficeEquipment {
    private int scanResolution;
    private int scanSpeed;
    private int colorDepth;
    private String maxPaperSize;
    private String connectivity;
    private boolean isDuplexScanning;
    private String scannerType;

    public Scanner(int id,
                   String modelName,
                   String manufacturer,
                   int yearManufacture,
                   int price,
                   double weight,
                   boolean isOperational,
                   int scanResolution,
                   int scanSpeed,
                   int colorDepth,
                   String maxPaperSize,
                   String connectivity,
                   boolean isDuplexScanning,
                   String scannerType) {
        super(id, modelName, manufacturer, yearManufacture, price, weight, isOperational);
        this.scanResolution = scanResolution;
        this.scanSpeed = scanSpeed;
        this.colorDepth = colorDepth;
        this.maxPaperSize = maxPaperSize;
        this.connectivity = connectivity;
        this.isDuplexScanning = isDuplexScanning;
        this.scannerType = scannerType;
    }

    public void setScanResolution(int scanResolution) {
        this.scanResolution = scanResolution;
    }

    public void setScanSpeed(int scanSpeed) {
        this.scanSpeed = scanSpeed;
    }

    public void setColorDepth(int colorDepth) {
        this.colorDepth = colorDepth;
    }

    public void setMaxPaperSize(String maxPaperSize) {
        this.maxPaperSize = maxPaperSize;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setDuplexScanning(boolean duplexScanning) {
        isDuplexScanning = duplexScanning;
    }

    public void setScannerType(String scannerType) {
        this.scannerType = scannerType;
    }

    @Override
    public String toString() {
        return "Scanner{" +
                "scanResolution=" + scanResolution +
                ", scanSpeed=" + scanSpeed +
                ", colorDepth=" + colorDepth +
                ", maxPaperSize='" + maxPaperSize + '\'' +
                ", connectivity='" + connectivity + '\'' +
                ", isDuplexScanning=" + isDuplexScanning +
                ", scannerType='" + scannerType + '\'' +
                '}';
    }
}
