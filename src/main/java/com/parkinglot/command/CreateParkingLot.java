package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.LinkedHashMap;

/**
 * Created by sandeep on 23/2/17.
 */
public class CreateParkingLot extends ACommand {

    public CreateParkingLot(String command) {
        super(command);
    }

    public void execute() {
        if (lotSize <= 0) {
            throw new RuntimeException("Invalid command. Initialized parking lot size");
        }
        this.cars = new Car[lotSize];
        System.out.println("Created a parking lot with " + lotSize + " slots");
    }

    public void parse() {
        this.lotSize = Integer.parseInt(this.command.split("[ ]")[1]);
    }
}
