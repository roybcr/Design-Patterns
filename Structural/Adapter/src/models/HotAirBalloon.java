package models;

public class HotAirBalloon {

    private final String gasUsed = "Helium";

    public void fly(String gasUsed) {
        System.out.printf("Hot Air Balloon is now flying on %s.", gasUsed);
    }

    public String inflateWithGas() {
        return this.gasUsed;
    }
}
