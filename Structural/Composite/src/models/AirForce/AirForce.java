package models.AirForce;

import java.util.ArrayList;
import java.util.Iterator;

import interfaces.IAlliancePart;

public class AirForce implements IAlliancePart {

    ArrayList<IAlliancePart> planes = new ArrayList<IAlliancePart>();

    public void add(IAlliancePart alliancePart) {
        this.planes.add(alliancePart);
    }

    public int getPersonnel() {
        Iterator<IAlliancePart> itr = this.planes.iterator();
        int staff = 0;
        while (itr.hasNext()) 
            staff += itr.next().getPersonnel();
        
        return staff;
    }
}
