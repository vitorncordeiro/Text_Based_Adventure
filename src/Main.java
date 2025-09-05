package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocationData locations = new LocationData();
        System.out.println("Lets start the adventure");
        Location currentLocation = locations.getLocations().get("camping");
        boolean flag = true;
        while(flag){
            System.out.println("Current Location: " + currentLocation);
            System.out.println("Choose an direction:\n" + locations.getLocations().get("camping").showNextPlaces());
            String direction = scanner.nextLine();
            if(locations.getLocations().containsKey(direction)){
                //FAZ UM SWITCH CASE AQUI AGORA COM AS DIREÇÕES
            }
        }


//        for (var location : locations.getLocations().entrySet()){
//            System.out.println(location.getValue().getAsciiArt());
//            System.out.println(location.getValue() + "\nFrom here, you can go to these places:");
//            System.out.println(location.getValue().showNextPlaces());
//        }

    }

}
