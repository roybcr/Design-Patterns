package models;

import interfaces.IAircraftD;

public class Boeing747D implements IAircraftD {

    @Override
    public void fly() {
        System.out.println("Boeing-747D flying ...");
    }

    @Override
    public void land() {
        System.out.println("Boeing-747D landing ...");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }

}
