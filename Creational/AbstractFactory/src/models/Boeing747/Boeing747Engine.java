package models.Boeing747;

import interfaces.IEngine;

public class Boeing747Engine implements IEngine {
    public void start() {
        System.out.println("Boeing747 Engine is on.");
    }
}
