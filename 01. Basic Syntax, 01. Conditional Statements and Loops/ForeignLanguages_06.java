import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String language = sc.nextLine();

        switch (language) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Argentina":
            case "Spain":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
