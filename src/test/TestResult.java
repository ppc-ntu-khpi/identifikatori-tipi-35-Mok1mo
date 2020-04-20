package test;

import domain.Exercise;

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        int key;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку для проверки на палиндромность: ");
            String str = in.nextLine();

            System.out.println(Exercise.Calculate(str));
            if (Exercise.Calculate(str) == true) {
                System.out.println("Это палендром");
            } else {
                System.out.println("Это не палендром");
            }

            System.out.println("1 - выход, 0 - продолжить");
            key = in.nextInt();
        }while (key!=1);
    }
}
