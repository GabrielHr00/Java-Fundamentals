import java.util.*;
import java.util.stream.Collectors;

public class ForceBook_09_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new TreeMap<>();
        String command = scanner.nextLine();

        while(!command.equals("Lumpawaroo")){
            String[] com = command.split(" \\| ");
            String[] comm = command.split(" \\-\\> ");


            if(com.length > 1){
                String first = com[0];
                String last = com[1];
                if(!map.containsKey(first)){
                    map.put(first, new ArrayList<>(Arrays.asList(last)));
                }
                else{
                    boolean found = false;
                    for(var i : map.get(first)){
                        if(i.equals(last)){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        List<String> temp = map.get(first);
                        temp.add(last);
                        map.put(first, temp);
                    }
                }
            }
            else if(comm.length > 1){
                String first = comm[0];
                String last = comm[1];
                if(!map.containsKey(last)){
                    map.put(last, new ArrayList<>(Arrays.asList(first)));
                    System.out.printf("%s joins the %s side!\n", first, last);
                }
                else{
                    boolean found = false;
                    String where = "";
                    for(var n : map.keySet()){
                        for(var i : map.get(n)) {
                            if (i.equals(first)) {
                                where = n;
                                found = true;
                                break;
                            }
                        }
                        if(found){break;}
                    }
                    if(!found){
                        List<String> temp = map.get(last);
                        temp.add(first);
                        map.put(last, temp);
                        System.out.printf("%s joins the %s side!\n", first, last);
                    }
                    else{
                        List<String> temp = map.get(where);
                        temp.remove(first);
                        map.put(where, temp);

                        map.putIfAbsent(last, new ArrayList<>());
                        map.get(last).add(first);
                        System.out.printf("%s joins the %s side!\n", first, last);
                    }
                }
            }
            command = scanner.nextLine();
        }

        if(!map.entrySet().isEmpty()){
            map.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                    .forEach(e -> {
                        if(!e.getValue().isEmpty()){
                            System.out.println("Side: " + e.getKey() + ", Members: "+ e.getValue().size());
                            List<String> list = e.getValue().stream().sorted().collect(Collectors.toList());
                            for(var i : list){
                                System.out.println("! " + i.toString());
                            }
                        }
                    });
        }
    }
}
