package Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = Integer.parseInt(scanner.nextLine());
        List<Integer> values = new ArrayList<>();
        List<Integer> oddValues = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            values.add(i);
        }
        for (Integer i : values) {
            if (i % 2 != 0) {
                oddValues.add(i);
            }
        }
        for (Integer i : oddValues) {
            System.out.println(i);
        }
    }
}

