import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> num = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int fixNum = num.get(0);
        int potencial = num.get(1);


        while(checkForIndex(nums, fixNum)){
            for(int i = 1; i <= potencial; i++){
                int index = findIndex(nums, fixNum);
                if(index-1 < 0){
                    break;
                }
                nums.remove(index-1);
            }
            for(int i = 1; i <= potencial; i++){
                int index = findIndex(nums, fixNum);
                if(index+1 > nums.size()-1){
                    break;
                }
                nums.remove(index+1);
            }
            int index1 = findIndex(nums, fixNum);
            nums.remove(index1);
        }

        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }

        System.out.println(sum);
    }

    public static int findIndex(List<Integer> nums, int fixNum){
        int j = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == fixNum){
                j = i;
            }
        }
        return j;
    }

    public static boolean checkForIndex(List<Integer> nums, int fixNum){

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == fixNum){
                return true;
            }
        }
        return false;
    }
}
