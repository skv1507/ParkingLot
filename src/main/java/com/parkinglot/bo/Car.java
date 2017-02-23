package com.parkinglot.bo;

/**
 * Created by sandeep on 23/2/17.
 */
public class Car {

    private int slotNumber;
    private String registrationNumber;
    private String color;

    public Car(String registrationNumber, String color) {
        this(-1, registrationNumber, color);
    }

    public Car(Integer slotNumber, String registrationNumber, String color) {
        this.slotNumber = slotNumber;
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (slotNumber != car.slotNumber) return false;
        if (registrationNumber != null ? !registrationNumber.equals(car.registrationNumber) : car.registrationNumber != null)
            return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = slotNumber;
        result = 31 * result + (registrationNumber != null ? registrationNumber.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
