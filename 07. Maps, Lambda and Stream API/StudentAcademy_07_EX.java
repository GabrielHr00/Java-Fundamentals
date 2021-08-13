import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy_07_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> map = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!map.containsKey(name)){
                map.put(name, new ArrayList<>(Arrays.asList(grade)));
            }
            else{
                List<Double> list = map.get(name);
                list.add(grade);
                map.put(name, list);
            }
        }

        Map<String, Double> mapy = new LinkedHashMap<>();
        for(var i : map.entrySet()){
            double av = 0.0;
            for(var j : i.getValue()){
                av += j;
            }
            av = av/i.getValue().size();
            mapy.put(i.getKey(), av);
        }

        mapy.entrySet().stream().filter(e -> e.getValue() >= 4.50)
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(ent -> System.out.printf("%s -> %.2f\n", ent.getKey(), ent.getValue()));
    }
}
