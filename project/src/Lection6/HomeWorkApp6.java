package Lection6;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения
действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/


public class HomeWorkApp6 {


    public static void main (String[] args) {

        Cat cat = new Cat("Мурчаль");
        cat.speak();
        cat.run(300);
        cat.swim(1);

        Dog dog = new Dog("Ричард");
        dog.speak();
        dog.run(500);
        dog.swim(10);

        Cat cat1 = new Cat("Кисенька");
        cat1.speak();
        cat.run(100);
        cat.swim(10);

        Dog dog1 = new Dog("Норд");
        dog1.speak();
        dog1.run(516);
        dog1.swim(15);

        Cat[] newCats = new Cat[3];
        newCats[0] = new Cat("Ада");
        newCats[1] = new Cat("Аделаида");
        newCats[2] = new Cat("Романия");

        for(int i = 0; i < newCats.length; i++) {
            newCats[i].speak();
            newCats[i].run(150);
            newCats[i].swim(1);
        }









    }





}
