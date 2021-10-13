package cz.educanet.praha;

import java.util.Scanner;

public class Delitelnost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo");
        int a = sc.nextInt();

        System.out.println(a % 2 == 0);
        System.out.println(a % 3 == 0);
        System.out.println(a % 4 == 0);
        System.out.println(a % 5 == 0);
        System.out.println(a % 6 == 0);
        System.out.println(a % 7 == 0);
        System.out.println(a % 8 == 0);
        System.out.println(a % 9 == 0);
        System.out.println(a % 10 == 0);
    }
}
