import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                double sum = list.get(i) + list.get(i + 1);
                list.set(i, sum);
                list.remove(i + 1);
                i = -1;
            }
        }

        for(var f : list)
            System.out.print((new DecimalFormat("0.#").format(f) + " "));
    }

}
