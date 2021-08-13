import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Map<String, Integer> map = new LinkedHashMap<>();

        for(var i : list){
            String lower = i.toLowerCase();
            map.putIfAbsent(lower, 1);
            map.put(lower, map.get(lower) + 1);
        }

        boolean first = true;
        for(var i : map.entrySet()){
            if(i.getValue() % 2 == 0){
                if(first){
                    first = false;
                    System.out.printf("%s", i.getKey());
                }
                else{
                    System.out.printf(", %s", i.getKey());
                }
            }
        }
    }
}
