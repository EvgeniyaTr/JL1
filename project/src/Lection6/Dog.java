package Lection6;

public class Dog extends Animals {
    private int swimSkill;
    private static int counterDogs;

    public Dog(String name) {
        super(name);
        this.runSkill = 500;
        this.swimSkill = 10;
        counterDogs++;

    }

    @Override
    void speak() {
        System.out.println("Your pet "+ name + " greets you and wags the tail!");
    }


    @Override
    void swim(int distanceSwim) {
        if(swimSkill >= distanceSwim) {
            System.out.println("Your dog " + name + " has already swam " + distanceSwim + "m!");
        } else {
            System.out.println("Your dog " + name + " has swam only " + swimSkill + "m and stopped. You got to retrieve it!");
        }
    }

    public int getCounterDogs() {
        return counterDogs;
    }
}


