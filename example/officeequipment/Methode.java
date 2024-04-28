package org.example.officeequipment;

import org.example.officeequipment.head_class.OfficeEquipment;

import java.util.List;

public class Methode {
    public void printAllEquipment(List<OfficeEquipment>equipmentList){
        for (OfficeEquipment equipment : equipmentList) {
            System.out.println(equipment);
        }
    }
    public double calculateTotalPrice(List<OfficeEquipment>equipmentList){
        double totalPrice=0;
        for (OfficeEquipment officeEquipment : equipmentList) {
            totalPrice+=officeEquipment.getPrice();
        }
        System.out.println("totalPrice : " + totalPrice);
        return totalPrice;
    }
}
