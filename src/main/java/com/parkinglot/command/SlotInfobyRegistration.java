package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.List;

/**
 * Created by sandeep on 24/2/17.
 */
public class SlotInfobyRegistration extends ACommand {

    private String reg;

    public SlotInfobyRegistration(String command) {
        super(command);
    }

    public void execute() {
        if (cars == null) {
            throw new RuntimeException("Invalid command.Initialized parking lot first");
        }
        Car car = registrationCarMap.get(reg);
        if (car != null) {
            System.out.println(car.getSlotNumber());
        } else {
            System.out.println("Not found");
        }
    }

    public void parse() {
        this.reg = command.split("[ ]")[1].trim();
    }
}
