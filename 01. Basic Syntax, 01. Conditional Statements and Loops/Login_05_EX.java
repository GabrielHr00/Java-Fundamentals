import java.util.Scanner;

public class Login_05_EX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        String password1 = "";
        for(int i = username.length()-1; i >= 0; i--){
            char symbol = username.charAt(i);
            password1 += symbol;
        }

        String password = sc.nextLine();
        int count = 0;

        while(!password.equals(password1)){
            if(count >= 3){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            count++;
            password = sc.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}
