import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> map = new TreeMap<>();

        for(var i : arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                int current = map.get(i) + 1;
                map.put(i, current);
            }
        }

        for(var i : map.entrySet()){
            System.out.printf("%.0f -> %d\n", i.getKey(), i.getValue());
        }
    }
}
