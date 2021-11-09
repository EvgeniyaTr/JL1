package Lection6;

public class Cat extends Animals {
    private int runSkill;
    private int swimSkill;

    public Cat(String name) {
        super(name);
        this.runSkill = 200;
        this.swimSkill = 0;

    }

    @Override
    void speak() {
        System.out.println("Ваш питомец " + name + " приветствует вас и мурчит, когда вы гладите его.");
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
            System.out.println("Это какая-то ошибка! Коты не умеют плавать, но ваш питомец " + name + " только что проплыл " + distanceSwim + "м!");
        } else {
            System.out.println("Бедняжка " + name + "! Коты совсем не умеют плавать! Скорее достаньте питомца из воды!");
        }
    }
}
