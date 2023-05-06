package by.pvt.homework;

public class Lions extends Animals {
    private final String nam = "Лев";
    private String nickName;
    private static int kollLions;

    public Lions(String nickName, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.nickName = nickName;
    }
    public  void sing(){
        System.out.println(nickName+" издайет громкий рычит.");
    }
}