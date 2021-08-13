import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int el = Integer.parseInt(sc.nextLine());

        List<String> guests = new ArrayList<>();


        for(int i = 0; i < el; i++){
            String[] com = sc.nextLine().split("\\s+");
            boolean found = true;

            if(com[2].equals("going!")){
                for(int j = 0; j < guests.size(); j++){
                    if(guests.get(j).equals(com[0])){
                        System.out.println(com[0] + " is already in the list!");
                        found = false;
                        break;
                    }
                }
                if(found){
                    guests.add(com[0]);
                }
            }
            else{
                for(int j = 0; j < guests.size(); j++){
                    if(guests.get(j).equals(com[0])){
                        guests.remove(com[0]);
                        found = false;
                        break;
                    }
                }
                if(found){
                    System.out.println(com[0] + " is not in the list!");
                }
            }

        }

        guests.forEach(each -> System.out.println(each));
    }
}
