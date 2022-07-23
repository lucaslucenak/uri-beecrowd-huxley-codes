package Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        List<Double> values1 = new ArrayList<>();
        List<Double> values2 = new ArrayList<>();
        for (String i : input1.split(" ")) {
            values1.add(Double.parseDouble(i));
        }
        for (String i : input2.split(" ")) {
            values2.add(Double.parseDouble(i));
        }
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", ((values1.get(1) * values1.get(2)) + (values2.get(1) * values2.get(2)))));
    }
}
