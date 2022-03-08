/**
 * F16-C 
 * 
 * The Composite version of the standard F16,
 * created in the Abstract Factory.
 */

package models.F16C;

import interfaces.IAircraft;
import interfaces.IAlliancePart;

public class F16C implements IAircraft, IAlliancePart {

    private final int PERSONNEL = 2;

    public F16C() {
    }
    
    public int getPersonnel() {
        return this.PERSONNEL;
    }

    @Override
    public void fly() {}
}