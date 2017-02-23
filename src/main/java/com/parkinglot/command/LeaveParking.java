package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.List;

/**
 * Created by sandeep on 24/2/17.
 */
public class LeaveParking extends ACommand {

    private int index;

    public LeaveParking(String command) {
        super(command);
    }

    public void execute() {
        if (cars == null) {
            throw new RuntimeException("Invalid command.Initialized parking lot first");
        }
        if (index <= 0 || index > lotSize) {
            System.out.println("Not Found");
        } else {
            Car c = cars[index - 1];
            if (c == null) {
                System.out.println("Not Found");
            } else {
                cars[index - 1] = null;
                registrationCarMap.remove(c.getRegistrationNumber());
                if (colorCarMap.get(c.getColor()) != null) {
                    colorCarMap.get(c.getColor()).remove(c);
                }
                System.out.println("Slot number " + (index) + " is free");
            }
        }
    }

    public void parse() {
        this.index = Integer.parseInt(this.command.split("[ ]")[1]);
    }
}
