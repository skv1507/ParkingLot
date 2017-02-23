package com.parkinglot;

import com.parkinglot.service.IProcessing;

public class App {
    public static void main(String[] args) {
        IProcessing processing = ProcessingFactory.getProcessingInstance(args);
        processing.process();
    }
}
