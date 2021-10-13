package cz.educanet.praha;

import java.util.Scanner;

public class SudeCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo.");
        int a = sc.nextInt();

        if (a % 2 == 0) System.out.println("Sudé");
        else System.out.println("Liché");
    }
}
