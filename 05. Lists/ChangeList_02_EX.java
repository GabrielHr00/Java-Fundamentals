import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while(!command.equals("end")){
            String[] com = command.split("\\s+");
            if(com[0].equals("Delete")){
                int num = Integer.parseInt(com[1]);
                for(int i = 0; i < numbers.size(); i++){
                    if(numbers.get(i) == num){
                        numbers.remove(i);
                        break;
                    }
                }
            }
            else if(com[0].equals("Insert")){
                int num = Integer.parseInt(com[1]);
                int position = Integer.parseInt(com[2]);

                numbers.add(position, num);
            }
            command = sc.nextLine();
        }

        numbers.forEach(each -> System.out.print(each + " "));
    }
}
