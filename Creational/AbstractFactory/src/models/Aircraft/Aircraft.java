package models.Aircraft;

import common.IAircraftFactory;
import interfaces.ICockpit;
import interfaces.IEngine;
import interfaces.IWings;

public class Aircraft {

    IWings wings;
    IEngine engine;
    ICockpit cockpit;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        this.engine = factory.createEngine();
        this.cockpit = factory.createCockpit();
        this.wings = factory.createWings();
        return this;
    }

    private void taxi() {
        System.out.println("Taxing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();
        System.out.println("Flying");
    }
}
