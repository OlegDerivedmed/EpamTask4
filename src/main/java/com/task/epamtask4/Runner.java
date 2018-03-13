package com.task.epamtask4;

import com.task.epamtask4.pojo.Car;
import com.task.epamtask4.util.Task4Util;

public class Runner {
    public static void main(String[] args) {

        Car[] cars = new Car[]{new Car(1,"BMW","x6",2013,"black",1000000,"xx 007 xx")};
        Car[] result = Task4Util.carsByBrand("BMW",cars);
        for (Car car :
                result) {
            System.out.println(car);
        }
    }
}
