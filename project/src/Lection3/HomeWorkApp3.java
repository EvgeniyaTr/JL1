package Lection3;

public class HomeWorkApp3 {

    public static void main(String[] args) {

        changeArr();
        createArr();
        multiplyArr();
        createSquareArr();
        createArrParam(10, 5);
        findMinMaxArr();

    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    public static void changeArr() {
        System.out.println("Задание 1");
        int[] arr1 = {1, 0, 1, 1, 0, 0, 1, 0};
        for (int y = 0; y < arr1.length; y++) {
            System.out.print(arr1[y] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void createArr() {
        System.out.println("Задание 2");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
    }

        /*
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */

    public static void multiplyArr() {
        System.out.println("Задание 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        for (int j = 0; j <= 11; j++) {
            if (arr3[j] < 6) {
                arr3[j] = arr3[j] * 2;
            }
            System.out.print(arr3[j] + " ");
        }
        System.out.println();
    }

        /*
        4. Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами(можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу:индексы таких элементов равны, то
        есть[0][0], [1][1], [2][2], …, [n][n];
        */

    public static void createSquareArr() {
        System.out.println("Задание 4");
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || j == 6 - i) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();

        }
    }

         /*
        5. Написать метод, принимающий на вход два аргумента:len и initialValue, и возвращающий одномерный массив типа
        int длиной len, каждая ячейка которого равна initialValue;
          */

    public static int[] createArrParam(int len, int initialValue) {
        System.out.println("Задание 5");
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
            System.out.print(arr5[i] + " ");
        }
        System.out.println();
        return arr5;
    }

    /*
     6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */
    public static void findMinMaxArr() {
        System.out.println("Задание 6");
        int[] arr6 = {1, 9, 25, 0, 8, 7, -2, 150, 4};
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }
        System.out.println();
        int min = arr6[0];
        int max = arr6[0];
        for (int j = 0; j < 9; j++) {
            if (arr6[j] < min) {
                min = arr6[j];
            } else {
                if (arr6[j] > max) {
                    max = arr6[j];
                }
            }
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
    }


        }














