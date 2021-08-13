import java.util.*;

public class PasswordReset_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Done")){
            String[] com = command.split(" ");
            String first = com[0];

            switch(first){
                case "TakeOdd":
                    StringBuilder current = new StringBuilder();
                    for(int i = 0; i < input.length(); i++){
                        if(i % 2 != 0){
                            current.append(input.charAt(i));
                        }
                    }
                    input = current.toString();
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(com[1]);
                    int length1 = Integer.parseInt(com[2]);

                    String sub = input.substring(index, index + length1);
                    input = input.replaceFirst(sub, "");
                    System.out.println(input);
                    break;
                case "Substitute":
                    String subs = com[1];
                    String minus = com[2];

                    if(input.contains(subs)){
                        input = input.replaceAll(subs, minus);
                        System.out.println(input);
                    }
                    else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Your password is: %s\n", input);
    }
}
