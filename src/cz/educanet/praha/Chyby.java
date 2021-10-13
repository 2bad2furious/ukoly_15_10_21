package cz.educanet.praha;

import java.util.Scanner;

public class Chyby {
    public static void main(String[] args) {
        String sentence = " Yasuo je Xkrát horší než Teemo ";
        sentence = sentence.replace("Yasuo", "Yone");
        sentence = sentence.replace("Xkrát", "3krát");
        sentence = sentence.trim();

        System.out.println(sentence);
        System.out.println(sentence.startsWith("Yone"));
        System.out.println(sentence.contains("3krát"));
    }
}
