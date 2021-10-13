package cz.educanet.praha;

import java.util.Scanner;

public class DelovaVez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte souřadnici X");
        int x = sc.nextInt();

        System.out.println("Zadejte souřadnici Y");
        int y = sc.nextInt();

        System.out.println("Zadejte dostřel věže");
        int range = sc.nextInt();

        double distance = Math.sqrt((x * x) + (y * y));
        if (range >= distance) System.out.println("V dostřelu");
        else System.out.println("Mimo dostřel");
    }
}
