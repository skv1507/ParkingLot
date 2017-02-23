package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.List;

/**
 * Created by sandeep on 24/2/17.
 */
public class RegistationInfoByColor extends ACommand {

    private String color;

    public RegistationInfoByColor(String command) {
        super(command);
    }

    public void execute() {
        if (cars == null) {
            throw new RuntimeException("Invalid command.Initialized parking lot first");
        }
        List<Car> cars = colorCarMap.get(color);
        int i = 0;
        for (Car c : cars) {
            if (i++ > 0) {
                System.out.print(", ");
            }
            System.out.print(c.getRegistrationNumber());
        }
        System.out.println();
    }

    public void parse() {
        this.color = command.split("[ ]")[1].trim();
    }
}
