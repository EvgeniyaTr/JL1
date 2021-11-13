package Lection6;

public abstract class Animals {
    protected String name;
    protected int runSkill;

    public Animals(String name) {
        this.name = name;
    }

    abstract void speak();

    public void run(int distanceRun) {
        int tmp = distanceRun - runSkill;
        if(runSkill >= distanceRun) {
            System.out.println("Your pet " + name + " has already run for " + distanceRun + "m!");
        } else {
            System.out.println("Your pet " + name + " has run only " + runSkill + "m and stopped. " +
                    "It seems your pet want to have a break! " + tmp + "m to go!");
        }
    }

    abstract void swim(int distanceSwim);


    }
