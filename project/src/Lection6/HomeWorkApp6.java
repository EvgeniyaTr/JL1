package Lection6;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения
действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/


public class HomeWorkApp6 {


    public static void main (String[] args) {

        Cat cat = new Cat("Murchal");
        cat.speak();
        cat.run(300);
        cat.swim(1);

        Dog dog = new Dog("Richard");
        dog.speak();
        dog.run(500);
        dog.swim(10);

        Cat cat1 = new Cat("Kisenka");
        cat1.speak();
        cat1.run(100);
        cat1.swim(10);

        Dog dog1 = new Dog("Nord");
        dog1.speak();
        dog1.run(516);
        dog1.swim(15);

        Cat[] newCats = new Cat[3];
        newCats[0] = new Cat("Ada");
        newCats[1] = new Cat("Kisulya");
        newCats[2] = new Cat("Kotenochek");

        for(int i = 0; i < newCats.length; i++) {
            newCats[i].speak();
        }

        newCats[0].run(200);
        newCats[0].swim(2);
        newCats[1].run(450);
        newCats[1].swim(15);
        newCats[2].run(120);
        newCats[2].swim(3);


        System.out.println("Number of cats: " + cat.getCounterCats());
        System.out.println("Number of dogs: " + dog.getCounterDogs());
        System.out.println("Number of animals:" + (cat.getCounterCats()+dog.getCounterDogs()));



    }



}
