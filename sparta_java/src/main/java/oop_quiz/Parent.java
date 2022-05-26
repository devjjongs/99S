package oop_quiz;

public class Parent extends Human implements Walkable, Runnable {
    public Parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void walk(int x, int y) {
        whoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }

    @Override
    public void running(int x, int y) {
        whoAmI();
        System.out.println("run speed: " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("run to " + getLocation());
    }
}
