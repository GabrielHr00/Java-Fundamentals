import java.util.*;

public class SecretChat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("Reveal")){
            String[] com = command.split("\\:\\|\\:");
            String firstCom = com[0];

            switch(firstCom){
                case "InsertSpace":
                    input.insert(Integer.parseInt(com[1]), " ");
                    System.out.println(input);
                    break;

                case "Reverse":
                    String subString = com[1];
                    String current = input.toString();

                    if(current.contains(subString)){
                        current = current.replaceFirst(subString, "");

                        StringBuilder newStr = new StringBuilder(subString);
                        newStr.reverse();

                        current += newStr.toString();
                        input = new StringBuilder(current);
                        System.out.println(input);
                    }
                    else{
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String sub = com[1];
                    String repl = com[2];

                    String current1 = input.toString();

                    current1 = current1.replaceAll(sub, repl);

                    input = new StringBuilder(current1);
                    System.out.println(input);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s\n", input.toString());
    }
}
