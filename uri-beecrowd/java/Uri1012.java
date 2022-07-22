package Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Double> values = new ArrayList<>();
        for (String i : input.split(" ")) {
            values.add(Double.parseDouble(i));
        }
        System.out.println("TRIANGULO: " + String.format("%.3f", values.get(0) * values.get(2) / 2));
        System.out.println("CIRCULO: " + String.format("%.3f", (Math.pow(values.get(2), 2) * 3.14159)));
        System.out.println("TRAPEZIO: "  + String.format("%.3f", ((values.get(0) + values.get(1)) * values.get(2)) / 2));
        System.out.println("QUADRADO: " + String.format("%.3f", Math.pow(values.get(1), 2)));
        System.out.println("RETANGULO: " + String.format("%.3f", values.get(0) * values.get(1)));
    }
}
