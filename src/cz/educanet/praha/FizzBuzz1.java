package cz.educanet.praha;

import java.util.Scanner;

public class FizzBuzz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo");
        int a = sc.nextInt();

        if (a % 15 == 0) System.out.println("FizzBuzz");
        else {
            if (a % 3 == 0) System.out.println("Fizz");
            else {
                if (a % 5 == 0) System.out.println("Buzz");
                else System.out.println(a);
            }
        }
    }
}
