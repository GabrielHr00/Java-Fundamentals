import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> map = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(value);
        }

        for(var i : map.entrySet()){
            System.out.printf("%s - %s\n", i.getKey(), String.join(", ", i.getValue()));
        }

    }
}
