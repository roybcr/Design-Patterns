import decorators.BulletProof;
import decorators.LuxuryFittings;
import interfaces.IAircraftD;
import models.Boeing747D;

public class Decorator {

    public static void main(String[] args) {

        IAircraftD standardBoeing = new Boeing747D();
        IAircraftD luxuriousBoeing = new LuxuryFittings(standardBoeing);
        IAircraftD bulletProofBoeing = new BulletProof(luxuriousBoeing);

        System.out.printf(
            "Net weight of a premium Boeing that is bulletproof and has luxurious fittings, is: %f tons.\n",
            bulletProofBoeing.getWeight()
        );
    }
}
