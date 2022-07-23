package Atividade01;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        Integer h, m, s;
        h = n / 3600;
        m = (n % 3600) / 60;
        s = ((n % 3600) % 60);
        System.out.println(h + ":" + m + ":" + s);
    }
}
