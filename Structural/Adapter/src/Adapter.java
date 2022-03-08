/**
 * Adapter Pattern
 *
 * The adapter pattern is defined as allowing incompatible classes to work together
 * by converting the interface of one class into another expected by the clients.
 */

import interfaces.IAircraft;
import models.HotAirBalloon;

public class Adapter implements IAircraft {

    private HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String feulUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(feulUsed);
    }

    private static void main() {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBalloon);

        hotAirBalloonAdapter.fly();
    }

    public static void main(String[] args) {
        main();
    }
}