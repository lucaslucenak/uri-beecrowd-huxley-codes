package Atividade01;

import java.util.*;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            String input = sc.nextLine();
            List<Integer> values = new ArrayList<>();
            for (String i : input.split(" ")) {
                values.add(Integer.parseInt(i));
            }
            Integer min = values.get(values.indexOf(Collections.min(values)));
            Integer max = values.get(values.indexOf(Collections.max(values)));
            List<Integer> allValues = new ArrayList<>();
            if (min == 0 || max == 0) {
                break;
            }
            else {
                for (int i = min; i <= max; i++) {
                    System.out.print(i + " ");
                    allValues.add(i);
                }
                System.out.print("Sum=" + allValues.stream().mapToInt(i -> i).sum() + "\n");
            }
        } while (true);
    }
}
