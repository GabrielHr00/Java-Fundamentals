import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers_08_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new TreeMap<>();
        String sc = scanner.nextLine();

        while(!sc.equals("End")){
            String[] com = sc.split(" -> ");
            String company = com[0];
            String id = com[1];

            if(!map.containsKey(company)){
                map.put(company, new ArrayList<>(Arrays.asList(id)));
            }
            else if(map.containsKey(company)){
                List<String> list = map.get(company);
                boolean found = false;
                for(var i : list){
                    if(i.equals(id)){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    list.add(id);
                    map.put(company, list);
                }
            }
            sc = scanner.nextLine();
        }

        map.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            for(var i : e.getValue()){
                System.out.println("-- " + i.toString());
            }
        });

    }
}
