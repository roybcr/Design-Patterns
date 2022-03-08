import models.AirForce.AirForce;
import models.C130Hercules.C130Hercules;
import models.F16C.F16C;

public class Composite {

    public static void main(String[] args) {

        AirForce natoAlliance = new AirForce();
        
        /**
         * Todo: Implement those methods in order to better understand the Composite Pattern.
         * natoAlliance.add(createCanadaAirForce());
         * natNatoAlliance.add(createUSAAirForce());
         */

        F16C frenchF16 = new F16C();
        C130Hercules germanCargo = new C130Hercules();

        natoAlliance.add(frenchF16);
        natoAlliance.add(germanCargo);

        System.out.println(natoAlliance.getPersonnel());
    }
}
