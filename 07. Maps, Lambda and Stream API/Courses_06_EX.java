import java.util.*;
import java.util.stream.Collectors;

public class Courses_06_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String sc = scanner.nextLine();

        while(!sc.equals("end")){
            String[] com = sc.split(" : ");
            if(!map.containsKey(com[0])){
                map.put(com[0], new ArrayList<>(Arrays.asList(com[1])));
            }
            else{
                List<String> list = map.get(com[0]);
                list.add(com[1]);
                map.put(com[0], list);
            }
            sc = scanner.nextLine();
        }

        map.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(i -> {
                    System.out.println(i.getKey() + ": " + i.getValue().size());
                    i.getValue().stream().sorted().forEach(e -> System.out.println("-- " + e.toString()));
                });
    }
}
