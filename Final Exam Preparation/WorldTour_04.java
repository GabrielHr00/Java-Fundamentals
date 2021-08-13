import java.util.*;

public class WorldTour_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while(!command.equals("Travel")){
            String[] com = command.split(":");
            String oper = com[0];

            switch (oper){
                case "Add Stop":
                    int index = Integer.parseInt(com[1]);
                    String string = com[2];

                    if(index >= 0 && index < input.length()){
                        input.insert(index, string);
                    }
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(com[1]);
                    int end = Integer.parseInt(com[2]);

                    if(start >= 0 && start < input.length() && end >= 0 && end < input.length()){
                        input.delete(start, end+1);
                    }
                    System.out.println(input);
                    break;
                case "Switch":
                    String oldStr = com[1];
                    String newStr = com[2];
                    String input1 = input.toString();

                    if(input1.contains(oldStr)){
                        input1 = input1.replaceAll(oldStr, newStr);
                        input = new StringBuilder(input1);
                    }
                    System.out.println(input);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s\n", input);
    }
}
