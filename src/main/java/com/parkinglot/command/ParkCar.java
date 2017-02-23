package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.LinkedList;

/**
 * Created by sandeep on 24/2/17.
 */
public class ParkCar extends ACommand {

    private Car car;

    public ParkCar(String command) {
        super(command);
    }

    public void execute() {
        if (cars == null) {
            throw new RuntimeException("Invalid command.Initialized parking lot first");
        }
        int num = findMinAvailableParking();
        if (num == -1) {
            System.out.println("Sorry, parking lot is full");
        } else {
            car.setSlotNumber(num + 1);
            cars[num] = car;
            if (colorCarMap.get(car.getColor()) == null) {
                colorCarMap.put(car.getColor(), new LinkedList<Car>());
            }
            colorCarMap.get(car.getColor()).add(car);
            registrationCarMap.put(car.getRegistrationNumber(), car);
            System.out.println("Allocated slot number: " + (num + 1));
        }
    }

    private int findMinAvailableParking() {
        for (int i = 0; i < lotSize; ++i) {
            if (this.cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void parse() {
        String[] token = this.command.split("[ ]");
        String reg = token[1];
        String color = token[2];
        car = new Car(reg, color);
    }
}
