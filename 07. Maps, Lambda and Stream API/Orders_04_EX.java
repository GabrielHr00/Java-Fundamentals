import java.util.*;
import java.util.stream.Collectors;

public class Orders_04_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<Double, Integer>> map = new LinkedHashMap<>(); // TreeMap

        String com = scanner.nextLine();

        while(!com.equals("buy")){
            String[] comm = com.split("\\s+");
            if(!map.containsKey(comm[0])){
                Map<Double, Integer> mapy = new LinkedHashMap<>();
                mapy.put(Double.parseDouble(comm[1]), Integer.parseInt(comm[2]));
                map.put(comm[0], mapy);
            }
            else{
                int quan = 0;
                for(var n : map.get(comm[0]).entrySet()){
                    quan = n.getValue();
                    break;
                }
                Map<Double, Integer> mapy = new LinkedHashMap<>();
                mapy.put(Double.parseDouble(comm[1]), Integer.parseInt(comm[2]) + quan);
                map.put(comm[0], mapy);
            }
            com = scanner.nextLine();
        }

        map.entrySet().forEach(e ->
        {
            double av = 0.0;
            for(var n : e.getValue().entrySet()){
                av = n.getKey()*n.getValue();
                break;
            }
            System.out.printf("%s -> %.2f\n", e.getKey(), av);
        });
    }
}
