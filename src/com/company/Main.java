package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1 Циклы
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println("");
            for (int s = 10; s > 0; s--) {
                System.out.print(" " + s);

            }
            //     Задача 2
            for (int a = 5; a < 31; a = a + 7) {
                System.out.println(" сегодня пятница " + a + " необходимо подготовить отчет");
            }

//      Задача 3
            int cur_date = 2021;
            int period = 79;
            int date = cur_date - 200;
            int afterYear = cur_date + 100;
            for (int z = date; z < afterYear; z++) {

                if (z % period == 0) {
                    System.out.println(z);
                }
            }
        }
    }
