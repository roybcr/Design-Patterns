package models.Boeing747;

import interfaces.ICockpit;

public class Boeing747Cockpit implements ICockpit {
    public void open() {
        System.out.println("Warning! Boeing747 Cockpit is open.");
    }
}
