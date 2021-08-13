import java.util.*;
import java.util.stream.Collectors;

public class MinerTask_02_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>(); // TreeMap

        while(!res.equals("stop")){
            int quan = Integer.parseInt(scanner.nextLine());

            if(!map.containsKey(res)){
                map.put(res, quan);
            }
            else{
                map.put(res, map.get(res) + quan);
            }
            res = scanner.nextLine();
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
