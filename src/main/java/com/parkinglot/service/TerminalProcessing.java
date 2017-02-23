package com.parkinglot.service;

import com.parkinglot.command.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by sandeep on 23/2/17.
 */
public class TerminalProcessing extends IProcessing {

    public TerminalProcessing(String file) {
        super(file);
    }

    public void process() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String command = null;
            while ((command = reader.readLine()) != null) {
                ParkingUtils.process(command);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
