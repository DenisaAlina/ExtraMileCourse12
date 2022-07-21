package com.fasttrack;

import java.util.*;

public class CarShop {
    private List<Car> carList;

    public CarShop(List<Car> carList) {
        this.carList = carList;
    }

    public Map<String, Integer> nameToNumberOfCars() {
        Map<String, List<Car>> result = new HashMap<>();
        for (Car car : carList) {
            List<Car> cars = result.get(car.getName());
            if (cars == null) {
                cars = new LinkedList<>();
                result.put(car.getName(), cars);
            }
            cars.add(car);

        }
        Map<String, Integer> finalResult = new HashMap<>();
        for (Map.Entry<String, List<Car>> entry : result.entrySet()) {
            finalResult.put(entry.getKey(), (entry.getValue()).size());
        }
        return finalResult;
    }

    public Map<String, Integer> nameToNumberOfCars1() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carList) {
            if (result.get(car.getName()) == null) {
                result.put(car.getName(), 0);
            }
            result.put(car.getName(), (result.get(car.getName()) + 1));
        }
        return result;
    }


    public Map<String, Integer> nameToSumOfKilometers() {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : carList) {
            if (result.get(car.getName()) == null) {
                result.put(car.getName(), 0);
            }
            result.put(car.getName(), (result.get(car.getName()) + car.getKm()));
        }
        return result;
    }

    /*

    public Map<String, List<Integer>> nameToKilometers() {
        Map<String, List<Integer>> result = new HashMap<>();
        for (Car car : carList) {
            List<Integer> cars = result.get(car.getName());
            if (cars == null) {
                cars = new LinkedList<>();
                result.put(car.getName(), cars);
            }
            cars.add(sum(car.getKm()));

        }
        return result;
    }

     */

    public Map<Range, List<Car>> fromKmRangeToCars(Range range) {

        Map<Range, List<Car>> result = new HashMap<>();
        List<Car> cars = new LinkedList<>();
        for (Car car : carList) {
            if (range.contains(car.getKm())) {
                cars.add(car);
            }
        }
        result.put(range, cars);
        return result;
    }

    public Map<Range, List<Car>> fromPriceRangeToCars(Range range) {

        Map<Range, List<Car>> result = new HashMap<>();
        List<Car> cars = new LinkedList<>();
        for (Car car : carList) {
            if (range.contains(car.getPrice())) {
                cars.add(car);
            }
        }
        result.put(range, cars);
        return result;
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "carList=" + carList +
                '}';
    }
}


