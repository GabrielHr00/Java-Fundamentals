import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();

        while(!"end".equals(command)) {
            String[] help = command.split("\\s+");
            switch (help[0]) {
                case "Contains":
                    if (list1.contains(Integer.parseInt(help[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (help[1].equals("even")) {
                        for (var i : list1) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }
                    } else {
                        for (var i : list1) {
                            if (i % 2 != 0) {
                                System.out.print(i + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (var i : list1) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (help[1]) {
                        case "<":
                            for (var i : list1) {
                                if (i < Integer.parseInt(help[2])){
                                    System.out.print(i + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (var i : list1) {
                                if (i > Integer.parseInt(help[2])) {
                                    System.out.print(i + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (var i : list1) {
                                if (i <= Integer.parseInt(help[2])) {
                                    System.out.print(i + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (var i : list1) {
                                if (i >= Integer.parseInt(help[2])) {
                                    System.out.print(i + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            command = sc.nextLine();
        }
    }
}
