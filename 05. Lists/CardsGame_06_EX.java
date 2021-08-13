import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> deck1 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while(deck1.size() != 0 || deck2.size() != 0){
            if(deck1.isEmpty() || deck2.isEmpty()){
                break;
            }
            int value = deck1.get(0);
            int value2 = deck2.get(0);

            if(value > value2){
                deck1.add(value);
                deck1.add(value2);
                deck1.remove(0);
                deck2.remove(0);
            }
            else if(value < value2){
                deck2.add(value2);
                deck2.add(value);
                deck2.remove(0);
                deck1.remove(0);
            }
            else if(value == value2){
                deck1.remove(0);
                deck2.remove(0);
            }
        }

        int sum = 0;
        boolean first = false;
        if(!deck1.isEmpty()){
            for(int i = 0; i < deck1.size(); i++){
                sum += deck1.get(i);
            }
            first = true;
        }
        else{
            for(int i = 0; i < deck2.size(); i++){
                sum += deck2.get(i);
            }
        }

        if(first){
            System.out.println("First player wins! Sum: " + sum);
        }
        else{
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
