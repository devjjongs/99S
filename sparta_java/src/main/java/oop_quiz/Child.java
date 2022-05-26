package oop_quiz;

public class Child extends Human implements Walkable, Runnable, Swimmable {
    public Child(String name, int age) {
        super(name, age, 5);
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
        System.out.println("My run speed is " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("run to " + getLocation());
    }

    @Override
    public void swim(int x, int y) {
        whoAmI();
        System.out.println("swim speed: " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("swum to " + getLocation());
    }
}
