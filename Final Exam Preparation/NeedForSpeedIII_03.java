import java.util.*;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> map = new LinkedHashMap<>();

        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");

            String car = input[0];
            int miles = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            map.put(car, new Car(miles, fuel));
        }

        String command = scanner.nextLine();

        while(!command.equals("Stop")){
            String[] input = command.split(" \\: ");
            String com = input[0];

            switch(com){
                case "Drive":
                    String car1 = input[1];
                    int miles1 = Integer.parseInt(input[2]);
                    int fuel1 = Integer.parseInt(input[3]);

                    int current = map.get(car1).getFuel();
                    if(fuel1 > current){
                        System.out.println("Not enough fuel to make that ride");
                    }
                    else{
                        map.put(car1, new Car(map.get(car1).getMiles() + miles1, map.get(car1).getFuel() - fuel1));
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car1, miles1, fuel1);
                        if(map.get(car1).getMiles() >= 100000){
                            map.remove(car1);
                            System.out.printf("Time to sell the %s!\n", car1);
                        }
                    }
                    break;
                case "Refuel":
                    String car2 = input[1];
                    int fuel2 = Integer.parseInt(input[2]);

                    int currentFuel = map.get(car2).getFuel();
                    int sumFuel = fuel2 + currentFuel;
                    int fuelToPour = fuel2;

                    if(sumFuel > 75){
                        fuelToPour = 75 - currentFuel;
                    }
                    map.put(car2, new Car(map.get(car2).getMiles(), map.get(car2).getFuel() + fuelToPour));
                    System.out.printf("%s refueled with %d liters\n", car2, fuelToPour);
                    break;
                case "Revert":
                    String car3 = input[1];
                    int miles3 = Integer.parseInt(input[2]);

                    map.put(car3, new Car(map.get(car3).getMiles() - miles3, map.get(car3).getFuel()));
                    if(map.get(car3).getMiles() >= 10000){
                        System.out.printf("%s mileage decreased by %d kilometers\n", car3, miles3);
                    }
                    else{
                        map.put(car3, new Car(10000, map.get(car3).getFuel()));
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        map.entrySet().stream().sorted((e1,e2) -> {
            int result = Integer.compare(e2.getValue().getMiles(), e1.getValue().getMiles());

            if(result == 0){
                result = e1.getKey().compareTo(e2.getKey());
            }
            return result;
        })
                .forEach(e ->
                        System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                                e.getKey(),
                                e.getValue().getMiles(),
                                e.getValue().getFuel()
                        ));
    }
}

class Car{
    private int miles;
    private int fuel;

    public Car(int miles, int fuel){
        this.miles = miles;
        this.fuel = fuel;
    }

    public int getFuel(){
        return this.fuel;
    }
    public int getMiles(){
        return this.miles;
    }
}
