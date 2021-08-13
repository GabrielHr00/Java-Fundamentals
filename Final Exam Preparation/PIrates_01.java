import java.util.*;

public class PIrates_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Treas> map = new LinkedHashMap();
        String command = scanner.nextLine();

        while(!command.equals("Sail")){
            String[] com = command.split("\\|\\|");
            String name = com[0];
            if(!map.containsKey(name)){
                map.put(name, new Treas(Integer.parseInt(com[1]), Integer.parseInt(com[2])));
            }
            else{
                map.put(name, new Treas(map.get(name).getPopulation() + Integer.parseInt(com[1]),
                        map.get(name).getGold() + Integer.parseInt(com[2])));
            }
            command = scanner.nextLine();
        }

        String in = scanner.nextLine();

        while(!in.equals("End")){
            String[] com = in.split("=>");
            String first = com[0];

            switch(first){
                case "Plunder":
                    String town = com[1];
                    int pop = Integer.parseInt(com[2]);
                    int gold = Integer.parseInt(com[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, pop);

                    map.put(town, new Treas(map.get(town).getPopulation() - pop, map.get(town).getGold() - gold));
                    if(map.get(town).getGold() <= 0 || map.get(town).getPopulation() <= 0){
                        map.remove(town);
                        System.out.println(town + " has been wiped off the map!");
                    }
                    break;
                case "Prosper":
                    String town1 = com[1];
                    int gold1 = Integer.parseInt(com[2]);

                    if(gold1 < 0){
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }
                    else{
                        map.put(town1, new Treas(map.get(town1).getPopulation(), map.get(town1).getGold() + gold1));
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold1, town1, map.get(town1).getGold());
                    }
                    break;
            }
            in = scanner.nextLine();
        }

        if(map.size() > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", map.size());
            map.entrySet().stream().sorted((e1,e2) -> {
                int result = Integer.compare(e2.getValue().getGold(),e1.getValue().getGold());
                if(result == 0){
                    result = e1.getKey().compareTo(e2.getKey());
                }
                return result;
            }).forEach(e -> System.out.println(e.getKey() + " -> Population: " + e.getValue().getPopulation() + " citizens, Gold: " + e.getValue().getGold() + " kg"));
        }
        else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}

class Treas{
    private int population;
    private int gold;

    public Treas(int population, int gold){
        this.population = population;
        this.gold = gold;
    }

    public int getPopulation(){
        return this.population;
    }

    public int getGold(){
        return this.gold;
    }
}
