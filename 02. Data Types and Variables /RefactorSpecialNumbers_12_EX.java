import java.util.Scanner;

public class RefactorSpecialNumbers_12_EX {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= n; count++) {
            int currentDigit = count;
            int sum = 0;
            while (currentDigit > 0) {
                sum += currentDigit % 10;
                currentDigit = currentDigit / 10;
            }
            boolean isEqualTo = false;
            isEqualTo = (sum == 5) || (sum == 7) || (sum == 11);
            String found = "False";
            if(isEqualTo){found = "True";}
            System.out.printf("%d -> %s%n", count, found);
        }
    }
}
