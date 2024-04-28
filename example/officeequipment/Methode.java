package org.example.officeequipment;

import org.example.officeequipment.head_class.OfficeEquipment;

import java.util.Date;
import java.util.List;

public class Methode {
    public static void printAllEquipment(List<OfficeEquipment>equipmentList){
        for (OfficeEquipment equipment : equipmentList) {
            System.out.println(equipment);
        }
    }
    public  static void calculateTotalPrice(List<OfficeEquipment>equipmentList){
        double totalPrice=0;
        for (OfficeEquipment officeEquipment : equipmentList) {
            totalPrice+=officeEquipment.getPrice();
        }
        System.out.println("totalPrice : " + totalPrice);
    }
    public static void findOldestEquipment(List<OfficeEquipment>equipmentList){
        int oldestEquipment=2024;
        for (OfficeEquipment equipment : equipmentList) {
            if (equipment.getYearManufacture()<oldestEquipment){
                oldestEquipment=equipment.getYearManufacture();
            }
        }
        System.out.println("oldestEquipment : " + oldestEquipment);
    }
    public static void countOperational(List<OfficeEquipment>equipmentList){
        int count=0;
        for (OfficeEquipment equipment : equipmentList) {
            if (equipment.isOperational()){
                count+=1;
            }
        }
        System.out.println("countOperational = " + count);
    }
}
