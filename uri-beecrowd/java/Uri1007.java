package Atividade01;

import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n1 = Integer.parseInt(sc.nextLine());
        Integer n2 = Integer.parseInt(sc.nextLine());
        Integer n3 = Integer.parseInt(sc.nextLine());
        Integer n4 = Integer.parseInt(sc.nextLine());
        System.out.println("DIFERENCA = " + String.format("%.1f", ((n1 * 2)  +  (n2 * 3) + (n3 * 5)) / 10.0));
    }
}
