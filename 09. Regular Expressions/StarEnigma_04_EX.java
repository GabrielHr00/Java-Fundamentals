import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("[^\\@\\-\\!\\:\\>]*?@(?<name>[A-Z][a-z]*)[^\\@\\-\\!\\:\\>]*?\\:[^\\@\\-\\!\\:\\>]*?(?<population>\\d+)[^\\@\\-\\!\\:\\>]*?![^\\@\\-\\!\\:\\>]*?(?<attack>[AD])![^\\@\\-\\!\\:\\>]*?\\-\\>[^\\@\\-\\!\\:\\>]*?(?<soldiar>\\d+)[^\\@\\-\\!\\:\\>]*?");
        List<String> attacked = new ArrayList<>();
        List<String> destryed = new ArrayList<>();

        while(n > 0){
            String command = scanner.nextLine();
            int count = 0;
            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < command.length(); i++){
                if(command.charAt(i) == 's' || command.charAt(i) == 'S' || command.charAt(i) == 't' || command.charAt(i) == 'T' || command.charAt(i) == 'a' || command.charAt(i) == 'A' || command.charAt(i) == 'r' || command.charAt(i) == 'R'){
                    count += 1;
                }
            }

            for(int i = 0; i < command.length(); i++){
                builder.append((char)(command.charAt(i) - count));
            }

            Matcher matcher = pattern.matcher(builder.toString());
            if(matcher.find()){
                String name = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                int soldiar = Integer.parseInt(matcher.group("soldiar"));

                if(attack.contains("A")){
                    attacked.add(name);
                }
                else{
                    destryed.add(name);
                }
            }
            n = n-1;
        }

        System.out.println("Attacked planets: " + attacked.size());
        attacked.stream().sorted().forEach(e -> System.out.println("-> " + e));
        System.out.println("Destroyed planets: " + destryed.size());
        destryed.stream().sorted().forEach(e -> System.out.println("-> " + e));
    }
}
