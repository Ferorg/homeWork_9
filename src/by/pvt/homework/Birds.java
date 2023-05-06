package by.pvt.homework;

public class Birds extends Animals {
    private String family;
    private int maxFlightHeight;


    public Birds(String family, int maxFlightHeight, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void sing() {
        System.out.println(family + " чирикает.");
    }

}
