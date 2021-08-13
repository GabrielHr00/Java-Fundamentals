import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int size = list.size()/2;
        for(int i = 0; i < size; i++){
            list.set(i, list.get(i) + list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        list.forEach(e -> System.out.print(e + " "));
    }
}
