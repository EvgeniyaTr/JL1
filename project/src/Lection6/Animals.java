package Lection6;

public abstract class Animals {
    protected String name;
    protected int runSkill;
    protected int swimSkill;

    public Animals(String name) {
        this.name = name;
    }

    abstract void speak();
    abstract void run(int distanceRun);
    abstract void swim(int distanceSwim);


    }
