package Atividade01;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer r = Integer.parseInt(sc.nextLine());
        System.out.println("VOLUME = " + String.format("%.3f", 4 * 3.14159 * (Math.pow(r, 3) / 3)));
    }
}
