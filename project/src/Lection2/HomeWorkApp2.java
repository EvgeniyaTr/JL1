package Lection2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        System.out.println("задание 1");
        if (checkSum(1, 19)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Задание 2");
        if (checkNumber(555)) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        System.out.println("Задание 3");
        if (antiCheckNumber(-1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("Задание 4");
        for (int i = 0; i < countPhrase(7); i++) {
            System.out.println(printPhrase("Got it"));
        }

        System.out.println("Задание 5");
        if(checkYear(1996)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),если да – вернуть true, в противном случае – false.
    */

    public static boolean checkSum(int a, int b) {
        return a+b >= 10 & a+b <=20;
    }

    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */

    public static boolean checkNumber(int a) {
        return a >= 0;
    }

    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */

    public static boolean antiCheckNumber(int a) {
        return a * -1 > 0;
    }

    /*4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static String printPhrase(String phrase) {
        return phrase;
    }

    public static int countPhrase(int count) {
        return count;
    }

    /*5. * Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    /*
    public static void checkYear(int year) {
        int a = year% 4;
        int b = year% 100;
        int c = year% 400;
        if(c == 0) {
            System.out.println("Год високосный");
        } else {
            if(b == 0) {
                System.out.println("Год не високосный");
            } else {
                if(a == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }
            }
        }
        return;
    }
     */

    public static boolean checkYear(int year) {
        int a = year% 4;
        int b = year% 100;
        int c = year% 400;
        if (c==0){
        return c==0;
    } else {
            if (b==0){
                return b !=0;
            } else {
                if (a==0) {
                    return a==0;
                } else {
                    return a==0;
                }
            }
        }
    }

}
