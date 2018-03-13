package com.task.epamtask4;

import com.task.epamtask4.pojo.Car;
import com.task.epamtask4.util.Task4Util;

public class Runner {
    public static void main(String[] args) {

        Car[] cars = new Car[]{new Car(1,"BMW","x6",2013,"black",1000000,"xx 007 xx"),new Car(1,"BMW","x5",2012,"black",100000,"xx 0078 x")};
        Car[] result = Task4Util.carsByModelAndRunAge("x6",1,cars);
        for (Car car :
                result) {
            System.out.println(car);
        }
    }
}
