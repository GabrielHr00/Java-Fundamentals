import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            char symbol1 = (char) ('a' + i);
            for(int j = 0; j < n; j++){
                char symbol2 = (char) ('a' + j);
                for(int k = 0; k < n; k++){
                    char symbol3 = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", symbol1,symbol2,symbol3);
                }
            }
        }
    }
}
