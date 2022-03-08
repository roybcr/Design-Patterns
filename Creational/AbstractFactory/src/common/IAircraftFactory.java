package common;

import interfaces.ICockpit;
import interfaces.IEngine;
import interfaces.IWings;

public interface IAircraftFactory {
    IWings createWings();
    IEngine createEngine();
    ICockpit createCockpit();
}
