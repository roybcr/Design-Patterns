package decorators;

import interfaces.IAircraftD;

public class BulletProof extends BoeingDecorator {

    private IAircraftD boeing;

    public BulletProof(IAircraftD boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        this.boeing.fly();
    }

    @Override
    public void land() {
        this.boeing.land();
    }
    
    @Override 
    public float getWeight() {
        return 50f + this.boeing.getWeight();
    }
}
