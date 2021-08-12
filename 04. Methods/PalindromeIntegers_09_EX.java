import java.util.Scanner;

public class PalindromeIntegers_09_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while(!command.equals("END")) {
            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String number) {
        String reversedNumber = getReversedNumber(number);
        return number.equals(reversedNumber);
    }

    private static String getReversedNumber(String number) {
        String reversed = "";
        for (int index = number.length() - 1; index >= 0 ; index--) {
            char currentElement = number.charAt(index);
            reversed += currentElement;
        }
        return reversed;
    }
}
