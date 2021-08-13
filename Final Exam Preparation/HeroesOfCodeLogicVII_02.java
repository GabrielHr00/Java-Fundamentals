import java.util.*;

public class HeroesOfCodeLogicVII_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> map = new LinkedHashMap<>();

        for(int i = 0; i < n; i++) {
            String[] com = scanner.nextLine().split("\\s+");
            map.put(com[0], new Hero(Integer.parseInt(com[1]), Integer.parseInt(com[2])));
        }

        String command = scanner.nextLine();
        while(!command.equals("End")){
            String[] com = command.split(" \\- ");
            String first = com[0];

            switch(first){
                case "CastSpell":
                    String hero1 = com[1];
                    int mp1 = Integer.parseInt(com[2]);

                    if(map.get(hero1).getMp() >= mp1){
                        map.put(hero1, new Hero(map.get(hero1).getHp(), map.get(hero1).getMp() - mp1));
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", hero1, com[3], map.get(hero1).getMp());
                    }
                    else{
                        System.out.printf("%s does not have enough MP to cast %s!\n", hero1, com[3]);
                    }
                    break;
                case "TakeDamage":
                    String hero2 = com[1];
                    int damage = Integer.parseInt(com[2]);
                    String attacker = com[3];

                    map.put(hero2, new Hero(map.get(hero2).getHp() - damage,map.get(hero2).getMp()));

                    if(map.get(hero2).getHp() > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", hero2, damage, attacker, map.get(hero2).getHp());
                    }
                    else{
                        System.out.printf("%s has been killed by %s!\n", hero2, attacker);
                    }
                    break;
                case "Recharge":
                    String hero3 = com[1];
                    int mp3 = Integer.parseInt(com[2]);
                    int currentMp = map.get(hero3).getMp();
                    int sum = mp3 + currentMp;

                    if(sum > 200){
                        mp3 = 200 - currentMp;
                    }
                    map.put(hero3, new Hero(map.get(hero3).getHp(), map.get(hero3).getMp() + mp3));
                    System.out.printf("%s recharged for %d MP!\n", hero3, mp3);
                    break;
                case "Heal":
                    String hero4 = com[1];
                    int hp4 = Integer.parseInt(com[2]);

                    int currentHp = map.get(hero4).getHp();
                    int sum1 = hp4 + currentHp;

                    if(sum1 > 100){
                        hp4 = 100 - currentHp;
                    }
                    map.put(hero4, new Hero(map.get(hero4).getHp() + hp4, map.get(hero4).getMp()));
                    System.out.printf("%s healed for %d HP!\n", hero4, hp4);
                    break;
            }

            command = scanner.nextLine();
        }

        map.entrySet().stream().filter(e -> e.getValue().getHp() > 0).sorted((e1,e2) -> {
            int result = Integer.compare(e2.getValue().getHp(), e1.getValue().getHp());

            if(result == 0){
                result = e1.getKey().compareTo(e2.getKey());
            }
            return result;
        }).forEach(e -> System.out.printf("%s\n  HP: %d\n  MP: %d\n", e.getKey(),e.getValue().getHp(), e.getValue().getMp()));
    }
}

class Hero{
    private int hp;
    private int mp;

    public Hero(int hp, int mp){
        this.mp = mp;
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public int getMp(){
        return this.mp;
    }
}
