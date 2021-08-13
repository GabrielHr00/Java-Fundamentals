import java.util.*;

public class AdvertisementMessage_01_EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> phases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.", "Exceptional product.",
                "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        for(int i = 0; i < n; i++){
            Random rnd = new Random();
            int indexPh = rnd.nextInt(phases.size());
            int indexEv = rnd.nextInt(events.size());
            int indexAu = rnd.nextInt(authors.size());
            int indexCi = rnd.nextInt(cities.size());

            System.out.println(phases.get(indexPh) + " " + events.get(indexEv) + " " + authors.get(indexAu) + " - " + cities.get(indexCi));
        }
    }
}
