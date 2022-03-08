package decorators;

import interfaces.IAircraftD;

public class LuxuryFittings extends BoeingDecorator {

    private IAircraftD boeing;

    public LuxuryFittings(IAircraftD boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        this.boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return (30.5f + this.boeing.getWeight());
    }
}
