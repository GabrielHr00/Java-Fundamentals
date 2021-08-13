import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(", ");
        Map<String, Integer> map = new LinkedHashMap<>();
        String com = scanner.nextLine();

        for(var i : command){
            map.put(i, 0);
        }

        Pattern patternName = Pattern.compile("[A-Za-z]");
        Pattern km = Pattern.compile("[0-9]");


        while(!com.equals("end of race")){
            StringBuilder builder = new StringBuilder();
            int sum = 0;

            Matcher matcherName = patternName.matcher(com);
            Matcher matcherkm = km.matcher(com);

            while(matcherName.find()) {
                builder.append(matcherName.group());
            }
            while(matcherkm.find()) {
                sum += Integer.parseInt(matcherkm.group());
            }

            if(map.containsKey(builder.toString())){
                map.put(builder.toString(), map.get(builder.toString()) + sum);
            }

            com = scanner.nextLine();
        }

        int i = 1;
        List<String> list = map.entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .limit(3).map(e -> e.getKey()).collect(Collectors.toList());

        System.out.println("1st place: "+ list.get(0));
        System.out.println("2nd place: "+ list.get(1));
        System.out.println("3rd place: "+ list.get(2));
    }
}
