package com.parkinglot.command;

import com.parkinglot.bo.Car;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sandeep on 23/2/17.
 */
public abstract class ACommand implements ICommand {

    protected static Car[] cars;
    protected static Map<String, List<Car>> colorCarMap = new HashMap<String, List<Car>>();
    protected static Map<String, Car> registrationCarMap = new HashMap<String, Car>();
    protected static int lotSize = -1;
    protected String command = null;

    public ACommand(String command) {
        this.command = command;
        parse();
    }

    public abstract void parse();

}
