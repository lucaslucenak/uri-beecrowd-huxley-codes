package Atividade01;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1 = Double.parseDouble(sc.nextLine());
        Double n2 = Double.parseDouble(sc.nextLine());
        System.out.println("MEDIA = " + String.format("%.5f", ((n1 * 3.5)  +  (n2 * 7.5)) / 11.0));
    }
}
