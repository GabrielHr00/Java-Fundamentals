import java.util.*;
import java.util.stream.Collectors;

public class SoftUniParking_05_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>(); // TreeMap
        int n = Integer.parseInt(scanner.nextLine());

        for( int i = 0; i < n ; i++){
            String[] com = scanner.nextLine().split("\\s+");

            if(com[0].equals("register")){
                if(map.containsKey(com[1])){
                    System.out.println("ERROR: already registered with plate number " + com[2]);
                }
                else if(!map.containsKey(com[1])){
                    map.put(com[1], com[2]);
                    System.out.println(com[1] + " registered " + com[2] + " successfully");
                }

            }
            else if(com[0].equals("unregister")) {
                if(map.containsKey(com[1])){
                    map.remove(com[1]);
                    System.out.println(com[1] + " unregistered successfully");
                }
                else{
                    System.out.println("ERROR: user " + com[1] + " not found");
                }
            }
        }

        map.entrySet().forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
    }
}
