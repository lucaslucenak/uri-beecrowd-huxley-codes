package Atividade01;

import java.util.*;

public class Uri1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Double> values = new ArrayList<>();
        Set<Double> setValues = new HashSet<>();
        for (String i : input.split(" ")) {
            values.add(Double.parseDouble(i));
            setValues.add(Double.parseDouble(i));
        }
        Double a = values.get(0);
        Double b = values.get(1);
        Double c = values.get(2);


        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a.equals(b) && b.equals(c)) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (setValues.size() == 2) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
