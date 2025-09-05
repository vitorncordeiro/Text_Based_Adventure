package code;

import java.util.Map;
import java.util.Random;

public class Location {
    private Map<Character, String> nextPlaces;
    private String locationDescription;
    private String asciiArt;
    private int goldQuantity;

    public Location(String locationDescription, Map<Character, String> nextPlaces, String asciiArt){
        this.locationDescription = locationDescription;
        this.nextPlaces = nextPlaces;
        this.asciiArt = asciiArt;
        Random random = new Random();
        this.goldQuantity = random.nextInt(0, 1000);

    }
    public String showNextPlaces(){
        String res = "";
        for(var p : nextPlaces.entrySet()){
            res += p.getKey() + ": " + p.getValue() + "\n";
        }
        return res;
    }
    public String getAsciiArt(){
        return asciiArt;
    }
    @Override
    public String toString(){
        return locationDescription;
    }

}
