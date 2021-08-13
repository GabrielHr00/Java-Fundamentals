import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();

        while(!"end".equals(command)){
            String[] help = command.split("\\s+");
            switch(help[0]){
                case "Add":
                    list1.add(Integer.parseInt(help[1]));
                    break;
                case "Remove":
                    list1.remove(Integer.valueOf(help[1]));
                    break;
                case "RemoveAt":
                    list1.remove(Integer.parseInt(help[1]));
                    break;
                case "Insert":
                    list1.add(Integer.parseInt(help[2]), Integer.parseInt(help[1]));
                    break;
            }
            command = sc.nextLine();
        }

        list1.forEach(e -> System.out.print(e + " "));

    }
}
