package models.C130Hercules;

import interfaces.IAircraft;
import interfaces.IAlliancePart;

public class C130Hercules implements IAircraft, IAlliancePart {
    
    private final int PERSONNEL = 5;
    
    public int getPersonnel() {
        return this.PERSONNEL;
    }
    
    public void fly() {}
}
