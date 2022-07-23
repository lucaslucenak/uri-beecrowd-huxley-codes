package Atividade01;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Double fixeSalary = Double.parseDouble(sc.nextLine());
        Double variableSalary = Double.parseDouble(sc.nextLine());
        System.out.println("TOTAL = R$ " + String.format("%.2f", (fixeSalary + (variableSalary * 0.15))));
    }
}
