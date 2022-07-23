package Atividade01;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1 = Double.parseDouble(sc.nextLine());
        Double n2 = Double.parseDouble(sc.nextLine());
        Double n3 = Double.parseDouble(sc.nextLine());
        System.out.println("MEDIA = " + String.format("%.1f", ((n1 * 2)  +  (n2 * 3) + (n3 * 5)) / 10.0));
    }
}