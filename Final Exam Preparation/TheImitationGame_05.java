import java.util.*;

public class TheImitationGame_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        if(!builder.toString().isEmpty() && !command.isEmpty()){
            while(!command.equals("Decode")){
                String[] com = command.split("\\|");
                String co = com[0];

                if(co.equals("Move")){
                    int n = Integer.parseInt(com[1]);
                    String sub = builder.substring(0,n);
                    builder.delete(0,n);
                    builder.append(sub);
                }
                else if(co.equals("Insert")){
                    int index = Integer.parseInt(com[1]);
                    builder.insert(index, com[2]);
                }
                else if(co.equals("ChangeAll")){
                    String newSt = builder.toString();
                    newSt = newSt.replace(com[1], com[2]);
                    builder = new StringBuilder(newSt);
                }

                command = scanner.nextLine();
            }
        }

        System.out.printf("The decrypted message is: %s", builder.toString());
    }
}
