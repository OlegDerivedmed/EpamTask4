package com.task.epamtask4.util;

import com.task.epamtask4.pojo.Car;

import java.util.*;

public class Task4Util {

    public static Car[] carsByBrand(String brand, Car[] cars) {
        List<Car> result = new LinkedList<Car>();

        for (Car car :
                cars) {
            if (brand.equals(car.getBrand())) {
                result.add(car);
            }
        }
        return result.toArray(new Car[result.size()]);
    }

    public static Car[] carsByModelAndRunAge(String carModel, int years, Car[] cars) {
        List<Car> result = new LinkedList<Car>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int currentyear = calendar.get(Calendar.YEAR);
        System.out.println(currentyear);
        for (Car car :
                cars) {
            if (carModel.equals(car.getModel()) && (currentyear - car.getYear() > years)) {
                result.add(car);
            }
        }
        return result.toArray(new Car[result.size()]);
    }

    public static Car[] carByYearAndPrice(int year, int price, Car[] cars) {
        List<Car> result = new LinkedList<Car>();

        for (Car car :
                cars) {
            if (year == car.getYear() && (price < car.getPrice())) {
                result.add(car);
            }
        }
        return result.toArray(new Car[result.size()]);
    }
}
