package Atividade01;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer distance = Integer.parseInt(sc.nextLine());
        Double gas = Double.parseDouble(sc.nextLine());
        System.out.println((String.format("%.3f", distance / gas)) + " km/l");
    }
}
