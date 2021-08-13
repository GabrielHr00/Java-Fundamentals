import java.util.*;

public class ThePianist_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Piece> map = new TreeMap<>();

        for(int i = 0; i < n; i++){
            String[] command = scanner.nextLine().split("\\|");
            String piece = command[0];
            String composer = command[1];
            String key = command[2];

            map.put(piece, new Piece(composer, key));
        }


        String com = scanner.nextLine();
        while(!com.equals("Stop")){
            String[] comm = com.split("\\|");
            String command = comm[0];

            switch(command){
                case "Add":
                    String piece = comm[1];
                    if(map.containsKey(piece)){
                        System.out.println(piece + " is already in the collection!");
                    }
                    else{
                        map.put(piece, new Piece(comm[2], comm[3]));
                        System.out.println(piece + " by " + comm[2] + " in " + comm[3] + " added to the collection!");
                    }
                    break;

                case "Remove":
                    String piece1 = comm[1];
                    if(map.containsKey(piece1)){
                        map.remove(piece1);
                        System.out.println("Successfully removed " + piece1 + "!");
                    }
                    else{
                        System.out.println("Invalid operation! " + piece1 + " does not exist in the collection.");
                    }

                    break;

                case "ChangeKey":
                    String piece2 = comm[1];
                    if(map.containsKey(piece2)){
                        map.get(piece2).setKey(comm[2]);
                        System.out.println("Changed the key of " + piece2 + " to " + comm[2] + "!");
                    }
                    else{
                        System.out.println("Invalid operation! " + piece2 + " does not exist in the collection.");
                    }
                    break;
                default:
                    break;
            }

            com = scanner.nextLine();
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e.getKey() + " -> Composer: " + e.getValue().getComposer() + ", Key: " + e.getValue().getKey()));
        //sorted((e1,e2) -> e2.getValue().getComposer().compareTo(e1.getValue().getComposer()))
        //                .sorted((e1,e2) -> e1.getValue().getComposer().compareTo(e2.getValue().getComposer())).
    }
}

class Piece{
    private String composer;
    private String key;

    public Piece(String composer, String key){
        this.composer = composer;
        this.key = key;
    }

    public String getKey(){
        return this.key;
    }

    public String getComposer(){
        return this.composer;
    }

    public void setKey(String key){
        this.key = key;
    }
}
