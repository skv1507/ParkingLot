package com.parkinglot.service;

import com.parkinglot.command.*;

/**
 * Created by sandeep on 24/2/17.
 */
public class ParkingUtils {

    public static void process(String command){
        if (command.startsWith("create_parking_lot")) {
            new CreateParkingLot(command).execute();
        } else if (command.startsWith("park")) {
            new ParkCar(command).execute();
        } else if (command.startsWith("leave")) {
            new LeaveParking(command).execute();
        } else if (command.equalsIgnoreCase("status")) {
            new ParkingStatus(command).execute();
        } else if (command.startsWith("registration_numbers_for_cars_with_colour")) {
            new RegistationInfoByColor(command).execute();
        } else if (command.startsWith("slot_numbers_for_cars_with_colour")) {
            new SlotInfobyColor(command).execute();
        } else if (command.startsWith("slot_number_for_registration_number")) {
            new SlotInfobyRegistration(command).execute();
        } else {
            System.out.println("Invalid command!!!");
        }

    }
}
