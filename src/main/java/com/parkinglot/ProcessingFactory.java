package com.parkinglot;

import com.parkinglot.service.FileProcessing;
import com.parkinglot.service.IProcessing;
import com.parkinglot.service.TerminalProcessing;

/**
 * Created by sandeep on 23/2/17.
 */
public class ProcessingFactory {

    public static IProcessing getProcessingInstance(String[] args) {
        if (args != null && args.length > 0) {
            String file = args[0].trim();
            return new FileProcessing(file);
        } else {
            return new TerminalProcessing(null);
        }
    }
}
