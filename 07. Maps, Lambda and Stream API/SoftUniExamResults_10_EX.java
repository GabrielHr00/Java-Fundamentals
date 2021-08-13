import java.util.*;

public class SoftUniExamResults_10_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String,String>> map = new TreeMap<>();
        String command = scanner.nextLine();

        while(!command.equals("exam finished")){
            String[] com = command.split("\\-");
            if(com.length < 2){break;}

            if(com[1].equals("banned")){
                for(var lan : map.entrySet()){
                    for(var ma : lan.getValue().entrySet()){
                        if(ma.getKey().equals(com[0])){
                            map.get(lan.getKey()).put(com[0], "X");
                            break;
                        }
                    }
                }
            }
            else{
                map.putIfAbsent(com[1], new LinkedHashMap<>());
                for(var i : map.get(com[1]).entrySet()){
                    if(i.getKey().equals(com[0])){
                        map.get(com[1]).put("X", "X");
                        break;
                    }
                }
                map.get(com[1]).put(com[0], com[2]);
            }
            command = scanner.nextLine();
        }

        Map<String,String> mapy = new TreeMap<>();
        for(var i : map.entrySet()){
            for(var entry : i.getValue().entrySet()){
                if(!entry.getValue().equals("X")){
                    mapy.put(entry.getKey(), entry.getValue());
                }
            }
        }

        if(!mapy.entrySet().isEmpty()){
            System.out.println("Results: ");
            mapy.entrySet().stream()
                    .sorted((e1,e2) -> Double.compare(Double.parseDouble(e2.getValue()),
                            Double.parseDouble(e1.getValue())))
                    .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

            System.out.println("Submissions: ");
            map.entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                    .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue().size()));
        }
    }
}
