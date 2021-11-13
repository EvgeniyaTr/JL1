package Lection6;

public class Cat extends Animals {

    private int swimSkill;
    private static int counterCats;

    public Cat(String name) {
        super(name);
        this.runSkill = 200;
        this.swimSkill = 0;
        counterCats++;

    }

    @Override
    void speak() {
        System.out.println("Your pet " + name + " greets you and purrs when you caress it.");
    }


    @Override
    void swim(int distanceSwim) {
            System.out.println("Poor " + name + "! Your cat can't swim at all!");
        }


    public int getCounterCats() {
        return counterCats;
    }


}
