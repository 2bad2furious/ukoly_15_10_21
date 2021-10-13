package cz.educanet.praha;

import java.util.Scanner;

public class Kalkulacka3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte první číslo.");
        int a = sc.nextInt();

        System.out.println("Zadejte druhé číslo.");
        int b = sc.nextInt();

        System.out.println("Součet je");
        System.out.println(a + b);

        System.out.println("Součin je");
        System.out.println(a * b);

        System.out.println("Rozdíl je");
        System.out.println(a - b);

        if (b == 0)
            System.out.println("Nelze dělit nulou");
        else {
            System.out.println("Podíl je");
            System.out.println((double) a / b);
        }
    }
}
