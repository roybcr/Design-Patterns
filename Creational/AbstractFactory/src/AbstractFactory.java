/**
 * Abstract Factory
 *
 * The abstract factory pattern is defined as defining an
 * interface to create families of related or dependent objects
 * without specifying their concrete classes.
 *
 */

import java.util.ArrayList;
import java.util.Collection;

import models.Aircraft.Aircraft;
import models.Boeing747.Boeing747Factory;
import models.F16.F16Factory;

public class AbstractFactory {

    public static void main(String[] args) {
        main();
    }

    public static void main() {

        F16Factory f16Fcatory = new F16Factory();
        Boeing747Factory boeing747Factory = new Boeing747Factory();
        Collection<Aircraft> myPlanes = new ArrayList<>();

        myPlanes.add(new Aircraft(f16Fcatory));
        myPlanes.add(new Aircraft(boeing747Factory));

        for (Aircraft aircraft : myPlanes) {
            aircraft.fly();
        }
    }
}
