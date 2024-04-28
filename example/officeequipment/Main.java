package org.example.officeequipment;

import com.github.javafaker.Faker;
import org.example.officeequipment.head_class.OfficeEquipment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         *   Создайте массив из 10 произвольных объектов, выбирая из вышеуказанных классов.
         *   Используйте Faker для генерации значений полей
         */
        Faker faker = new Faker();
        List<OfficeEquipment>equipmentList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            equipmentList.add(new OfficeEquipment(faker.idNumber().valid(),
                    faker.commerce().productName(),
                    faker.company().name(),
                    faker.number().numberBetween(1990,2024),
                    faker.number().randomDouble(2,100,10000),
                    faker.number().randomDouble(2,1,100),
                    faker.bool().bool()));
        }
        System.out.println("equipmentList = " + equipmentList);
        System.out.println();
        Methode.printAllEquipment(equipmentList);
        System.out.println();
        Methode.calculateTotalPrice(equipmentList);
        System.out.println();
        Methode.findOldestEquipment(equipmentList);
        System.out.println();
        Methode.countOperational(equipmentList);
    }
}
