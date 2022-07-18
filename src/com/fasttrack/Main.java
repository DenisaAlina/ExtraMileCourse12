package com.fasttrack;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList =new LinkedList<>();
        carList.add(new Car("Volvo", 6, 150000, 24000));
        carList.add(new Car("Skoda", 7, 140000, 15000));
        carList.add(new Car("Volvo", 2, 20000, 27000));
        carList.add(new Car("Audi", 14, 200000, 7000));
        carList.add(new Car("Toyota", 4, 230000, 20000));
        carList.add(new Car("Skoda", 1, 20000, 25000));
        CarShop carShop = new CarShop(carList);
        System.out.println(carShop.nameToNumberOfCars());
        System.out.println(carShop.nameToKilometers());
        Range range= new Range(10000, 100000);
        System.out.println(carShop.fromKmRangeToCars(range));
        Range priceRange = new Range(0, 20000);
        System.out.println(carShop.fromPriceRangeToCars(priceRange));


    }
}
