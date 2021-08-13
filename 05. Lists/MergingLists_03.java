import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> help = new ArrayList<>();
        int helpSize = 0;
        if(list1.size() > list2.size()){
            helpSize = list2.size();
        }
        else{
            helpSize = list1.size();
        }

        for(int i = 0; i < helpSize; i++){
            help.add(list1.get(i));
            help.add(list2.get(i));
        }

        if(list1.size() > list2.size()){
            for(int i = helpSize; i < list1.size(); i++){
                help.add(list1.get(i));
            }
        }
        else{
            for(int i = helpSize; i < list2.size(); i++){
                help.add(list2.get(i));
            }
        }
        help.forEach(e -> System.out.print(e + " "));
    }
}
