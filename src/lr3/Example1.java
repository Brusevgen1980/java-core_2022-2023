package lr3;
//1. Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.


import java.util.Scanner;
public class Example1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число");
            int dayweek = in.nextInt();
            if (dayweek != 1) {
                if (dayweek == 2) {
                    System.out.println("Вторник");
                } else if (dayweek == 3) {
                    System.out.println("Среда");
                } else if (dayweek == 4) {
                    System.out.println("Четверг");
                } else if (dayweek == 5) {
                    System.out.println("Пятница");
                } else if (dayweek == 6) {
                    System.out.println("Суббота");
                } else if (dayweek == 7) {
                    System.out.println("Воскресенье");
                } else {
                    System.out.println("Введите число от 1 до 7");
                }
            } else {
                System.out.println("Понедельник");
            }
        }
    }

