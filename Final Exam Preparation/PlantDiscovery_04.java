import java.util.*;

public class PlantDiscovery_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> map = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            String[] com = scanner.nextLine().split("<->");
            map.put(com[0], new Plant(com[1], new ArrayList<>()));
        }

        String command = scanner.nextLine();

        while(!command.equals("Exhibition")){
            String[] cont = command.split(" \\- |: ");
            String com = cont[0];

            if (!map.containsKey(cont[1])) {
                command = scanner.nextLine();
                System.out.println("error");
                continue;
            }

            switch(com){
                case "Rate":
                    String plant = cont[1];
                    String rate = cont[2];
                    map.get(plant).addRating(rate);
                    break;
                case "Update":
                    String plant1 = cont[1];
                    String newRare = cont[2];
                    map.get(plant1).setRarity(newRare);
                    break;
                case "Reset":
                    String plant2 = cont[1];
                    map.get(plant2).getRating().clear();
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition: ");
        map.entrySet().stream()
                .sorted((e1,e2) -> {
                    int result = Integer.compare(Integer.parseInt(e2.getValue().getRarity()), Integer.parseInt(e1.getValue().getRarity()));
                    if(result == 0){
                        result = Double.compare(e2.getValue().getAverage(), e1.getValue().getAverage());
                    }
                    return result;
                }).forEach(p -> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n",
                p.getKey(),
                p.getValue().getRarity(),
                p.getValue().getAverage()));
    }
}

class Plant{
    private String rarity;
    private List<String> rating;

    public Plant(String rarity, List<String> rating){
        this.rarity = rarity;
        this.rating = rating;
    }

    public List<String> getRating(){
        return this.rating;
    }

    public String getRarity(){
        return this.rarity;
    }

    public void addRating(String rate){
        this.rating.add(rate);
    }

    public void setRarity(String rarity){
        this.rarity = rarity;
    }

    public double getAverage(){
        double av = 0.0;

        for(int i = 0; i < this.rating.size(); i++){
            av += Double.parseDouble(this.rating.get(i));
        }
        if(av != 0.0){
            av /= this.rating.size();
        }
        return av;
    }
}
