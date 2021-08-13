import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInString_01_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if(current != ' ') {
                if (!map.containsKey(current)) {
                    map.put(current, 1);
                } else {
                    map.put(current, map.get(current) + 1);
                }
            }
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
