import java.util.Scanner;

public class StringExplosion_07_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        int power = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '>') {
                power += Character.getNumericValue(sb.charAt(i + 1));
                if (power < 0){
                    power = 0;
                }
            } else if (power > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                power--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
