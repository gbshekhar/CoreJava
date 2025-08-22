package com.modernjava.sealed;

public sealed class Car extends Vehicle implements SmartMediaPlayer permits FlyingCar {

    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void smartConnect() {
        System.out.println("Phone Connected");
    }
}
