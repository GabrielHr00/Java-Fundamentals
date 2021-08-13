import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextLine());
        }

        list = list.stream().sorted().collect(Collectors.toList());
        int j = 1;
        for(var i : list){
            System.out.println(j + "." + i);
            j+= 1;
        }
    }
}
