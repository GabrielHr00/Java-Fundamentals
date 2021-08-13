import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();

        while(!command.equals("end")){
            String[] com = command.split("\\s+");
            if(com[0].equals("Add")){
                wagons.add(Integer.parseInt(com[1]));
            }
            else{
                int digit = Integer.parseInt(com[0]);
                for(int i = 0; i < wagons.size(); i++){
                    if(digit + wagons.get(i) <= max){
                        int sum = digit + wagons.get(i);
                        wagons.set(i, sum);
                        break;
                    }
                }
            }
            command = sc.nextLine();
        }

        wagons.forEach(each -> System.out.print(each + " "));
    }
}
