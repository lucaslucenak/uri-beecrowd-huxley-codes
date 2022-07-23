package Atividade01;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = Integer.parseInt(sc.nextLine());
        Integer hours = Integer.parseInt(sc.nextLine());
        Double salaryPerHour = Double.parseDouble(sc.nextLine());
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", (hours * salaryPerHour)));
    }
}