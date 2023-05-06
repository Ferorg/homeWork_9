package by.pvt.homework;

public class Lions extends Animals {
    private String nickName;


    public Lions(String nickName, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.nickName = nickName;
    }

    public void sing() {
        System.out.println(nickName + " издайет громкий рыk.");
    }
}