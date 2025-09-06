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
            System.out.println(currentLocation.getLocationDescription());
            System.out.println(currentLocation.getAsciiArt());
            System.out.println("Choose an direction:\n" + locations.getLocations().get(currentLocation.getLocationName()).showNextPlaces());
            String direction = scanner.nextLine().toUpperCase();
            if(locations.getLocations().get(currentLocation.getLocationName()).getNextPlaces().containsKey(direction) || direction.equals("Q")){
                switch(direction){
                    case "W" -> currentLocation = locations.getLocations().get(currentLocation.getNextPlaces().get("W"));
                    case "N" -> currentLocation = locations.getLocations().get(currentLocation.getNextPlaces().get("N"));
                    case "S" -> currentLocation = locations.getLocations().get(currentLocation.getNextPlaces().get("S"));
                    case "E" -> currentLocation = locations.getLocations().get(currentLocation.getNextPlaces().get("E"));
                    case "Q" -> flag = false;
                }
            }else{
                System.out.println("From here, the wind doesnt blow in that direction");
            }
        }


//        for (var location : locations.getLocations().entrySet()){
//            System.out.println(location.getValue().getAsciiArt());
//            System.out.println(location.getValue() + "\nFrom here, you can go to these places:");
//            System.out.println(location.getValue().showNextPlaces());
//        }

    }

}
