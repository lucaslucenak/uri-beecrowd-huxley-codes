package Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xInput = sc.nextLine();
        String yInput = sc.nextLine();
        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();

        for (String i : xInput.split(" ")) {
            xValues.add(Double.parseDouble(i));
        }
        for (String i : yInput.split(" ")) {
            yValues.add(Double.parseDouble(i));
        }
        Double x1 = xValues.get(0);
        Double y1 = xValues.get(1);
        Double x2 = yValues.get(0);
        Double y2 = yValues.get(1);

        System.out.println(String.format("%.4f", Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)))));
    }
}
