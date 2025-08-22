package com.modernjava.sealed;

public sealed abstract class Vehicle permits Truck, Car {

    public  abstract String drive();
}

