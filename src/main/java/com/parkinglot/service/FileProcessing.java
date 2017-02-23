package com.parkinglot.service;

import com.parkinglot.command.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by sandeep on 23/2/17.
 */
public class FileProcessing extends IProcessing {

    public FileProcessing(String file) {
        super(file);
    }

    public void process() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
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
