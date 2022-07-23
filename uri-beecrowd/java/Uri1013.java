package Atividade01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> values = new ArrayList<>();
        for (String i : input.split(" ")) {
            values.add(Integer.parseInt(i));
        }
        System.out.println(values.get(values.indexOf(Collections.max(values))) + " eh o maior");

    }
}
