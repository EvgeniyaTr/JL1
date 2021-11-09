package Lection5;

public class HomeWorkApp5 {

    public static void main(String[] args) {


        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Котова Полина Сергеевна", "Стилист", "kotova@gmail.com", "+79153351402", 65000, 23);
        employeesArr[1] = new Employee("Смирнов Кирилл Юрьевич", "Супервайзер", "smirkir@mail.ru", "+79169958474", 80000, 31);
        employeesArr[2] = new Employee("Полякова Анна Сергеевна", "Дизайнер", "nutochka16@mail.ru", "89212653017", 50000, 21);
        employeesArr[3] = new Employee("Бобров Илья Николаевич", "Экспедитор", "bobrov@bk.ru", "89685472360", 55000, 41);
        employeesArr[4] = new Employee("Михалкова Галина Сергеевна", "Бухгалтер", "buh@crlk.com", "+79158213002", 70000, 45);


        //Вывод информации о всех сотрудниках
    /*
    System.out.println("Список всех сотрудников");
    System.out.println();
    for(int j = 0; j < employeesArr.length; j++) {
        employeesArr[j].printInfo();
    }
         */

        System.out.println("Список сотрудников старше 40 лет");
        System.out.println();
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40) {
                employeesArr[i].printInfo();
            }

        }
    }
}



    /*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
потом для каждой ячейки массива задаем объект
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

    */



