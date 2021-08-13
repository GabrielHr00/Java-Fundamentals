import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming_03_EX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> junk = new TreeMap<>();
        Map<String, Integer> goods = new TreeMap<>();

        String winner = "";

        while(winner.isEmpty()){
            String[] input = scanner.nextLine().split("\\s+");

            for(int j = 0; j < input.length; j+=2) {
                int power = Integer.parseInt(input[j]);
                String res = input[j + 1].toLowerCase();

                if (res.equals("shards") || res.equals("fragments") || res.equals("motes")) {
                    if (!goods.containsKey(res)) {
                        goods.put(res, power);

                    } else {
                        goods.put(res, goods.get(res) + power);
                    }
                } else {
                    if (!junk.containsKey(res)) {
                        junk.put(res, power);

                    } else {
                        junk.put(res, junk.get(res) + power);
                    }
                }

                for (var i : goods.entrySet()) {
                    if (i.getKey().equals("shards") && i.getValue() >= 250) {
                        winner = "Shadowmourne";
                        goods.put(i.getKey(), i.getValue() - 250);
                        break;
                    }
                    if (i.getKey().equals("fragments") && i.getValue() >= 250) {
                        winner = "Valanyr";
                        goods.put(i.getKey(), i.getValue() - 250);
                        break;
                    }
                    if (i.getKey().equals("motes") && i.getValue() >= 250) {
                        winner = "Dragonwrath";
                        goods.put(i.getKey(), i.getValue() - 250);
                        break;
                    }
                }
                if (!winner.isEmpty()) {
                    break;
                }
            }
            if (!winner.isEmpty()) {
                break;
            }
        }


        boolean frag = false;
        boolean motes = false;
        boolean shards = false;

        for(var n : goods.entrySet()) {
            if(n.getKey().equals("motes")) {
                motes = true;
            }
            else if(n.getKey().equals("fragments")) {
                frag = true;
            }
            else if(n.getKey().equals("shards")) {
                shards = true;
            }
        }

        if(!frag){
            goods.put("fragments", 0);
        }if(!motes){
            goods.put("motes", 0);
        }if(!shards){
            goods.put("shards", 0);
        }

        System.out.println(winner + " obtained!");
        goods.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));

        for(var m : junk.entrySet()){
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}
