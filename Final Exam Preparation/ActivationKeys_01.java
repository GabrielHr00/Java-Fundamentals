import java.util.*;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String command = scanner.nextLine();

        while(!command.equals("Generate")){
            String[] com = command.split(">>>");
            String first = com[0];

            switch(first){
                case "Contains":
                    String sub = com[1];
                    if(input.contains(sub)){
                        System.out.printf("%s contains %s\n",input, sub);
                    }
                    else{
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String uplo = com[1];
                    int start = Integer.parseInt(com[2]);
                    int end = Integer.parseInt(com[3]);

                    if(uplo.equals("Upper")){
                        char[] newA = input.toCharArray();
                        for(int i = start; i < end; i++){
                            newA[i] = Character.toUpperCase(newA[i]);
                        }
                        input = String.valueOf(newA);
                    }
                    else{
                        char[] newA = input.toCharArray();
                        for(int i = start; i < end; i++){
                            newA[i] = Character.toLowerCase(newA[i]);
                        }
                        input = String.valueOf(newA);
                    }
                    System.out.println(input);
                    break;

                case "Slice":
                    int start1 = Integer.parseInt(com[1]);
                    int end1 = Integer.parseInt(com[2]);

                    String subStr = input.substring(start1, end1);
                    input = input.replace(subStr, "");
                    System.out.println(input);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s\n", input);

    }
}
