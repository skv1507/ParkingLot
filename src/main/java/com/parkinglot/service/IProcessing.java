package com.parkinglot.service;

/**
 * Created by sandeep on 23/2/17.
 */
public abstract class IProcessing {

    protected final String file;

    public IProcessing(String file) {
        this.file = file;
    }

    public abstract void process();
}
