package Lection6;

public class Dog extends Animals {

    private int runSkill;
    private int swimSkill;

    public Dog(String name) {
        super(name);
        this.runSkill = 500;
        this.swimSkill = 10;

    }

    @Override
    void speak() {
        System.out.println("Ваш питомец "+ name + " приветствует ваc, весело гавкает и виляет хвостом.");
    }

    @Override
    void run(int distanceRun) {
        int tmp = distanceRun - runSkill;
        if(runSkill >= distanceRun) {
            System.out.println("Ваш питомец " + name + " успешно пробежал " + distanceRun + "м!");
        } else {
            System.out.println("Ваш питомец " + name + " пробежал " + runSkill + "м и остановился. " +
                    "Похоже ему нужно отдохнуть! Впереди еще " + tmp + "м!");
        }
    }

    @Override
    void swim(int distanceSwim) {
        if(swimSkill >= distanceSwim) {
            System.out.println("Ваш питомец " + name + " успешно проплыл " + distanceSwim + "м!");
        } else {
            System.out.println("Ваш питомец " + name + " проплыл " + swimSkill + "м и остановился. Скорее спасайте его!");
        }
    }
}


