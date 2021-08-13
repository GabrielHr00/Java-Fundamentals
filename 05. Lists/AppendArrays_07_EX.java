import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String digits = sc.nextLine();
        List<String> num = Arrays.stream(digits.split("\\|")).collect(Collectors.toList());
        Collections.reverse(num);

        System.out.println(num.toString().replace("[", "").replaceAll(",", "").replaceAll("\\s+", " ").replace("]", "").replace("\\s+",""));
    }
}
