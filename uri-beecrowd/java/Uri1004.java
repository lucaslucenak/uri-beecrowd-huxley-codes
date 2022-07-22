package Atividade01;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double rentPerHour = Double.parseDouble(sc.nextLine());
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", hours * rentPerHour));
    }
}