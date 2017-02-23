package com.parkinglot.command;

import com.parkinglot.bo.Car;

/**
 * Created by sandeep on 24/2/17.
 */
public class ParkingStatus extends ACommand {

    public ParkingStatus(String command) {
        super(command);
    }

    public void execute() {
        if (cars == null) {
            throw new RuntimeException("Invalid command.Initialized parking lot first");
        }
        System.out.printf("Slot No.\tRegistration No\tColour\n");
        for (Car car : cars) {
            if (car == null) continue;
            System.out.printf("%d\t\t%s\t\t%s\n", car.getSlotNumber(), car.getRegistrationNumber(), car.getColor());
        }
        System.out.println();
    }

    public void parse() {

    }
}
