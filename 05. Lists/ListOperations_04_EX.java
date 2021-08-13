import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04_EX {public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    String command = sc.nextLine();

    while(!command.equals("End")){
        String[] com = command.split(" ");

        if(com[0].equals("Add")){
            numbers.add(Integer.parseInt(com[1]));
        }
        else if(com[0].equals("Insert")){
            int index = Integer.parseInt(com[2]);
            int digit = Integer.parseInt(com[1]);
            if(index < 0 || index > numbers.size() - 1){
                System.out.println("Invalid index");
            }
            else{
                numbers.add(index, digit);
            }
        }
        else if(com[0].equals("Remove")){
            int index = Integer.parseInt(com[1]);
            if(index < 0 || index > numbers.size() - 1){
                System.out.println("Invalid index");
            }
            else{
                numbers.remove(index);
            }
        }
        else if(com[0].equals("Shift")){
            int count = Integer.parseInt(com[2]);
            if(com[1].equals("left")){
                for(int i = 0; i < count; i++){
                    int dig = numbers.get(0);
                    numbers.add(dig);
                    numbers.remove(0);

                }
            }
            else if(com[1].equals("right")){
                for(int i = 0; i < count; i++){
                    int dig = numbers.get(numbers.size() - 1);
                    numbers.add(0, dig);
                    numbers.remove(numbers.size() - 1);
                }
            }
        }
        command = sc.nextLine();
    }
    numbers.forEach(each -> System.out.print(each + " "));
}

}
