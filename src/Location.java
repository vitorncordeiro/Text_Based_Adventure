package code;

import java.util.Map;
import java.util.Random;

public class Location {
    private Map<String, String> nextPlaces;
    private String locationDescription;
    private String locationName;
    private String asciiArt;
    private int goldQuantity;

    public Location(String locationName, String locationDescription, Map<String, String> nextPlaces, String asciiArt){
        this.locationDescription = locationDescription;
        this.nextPlaces = nextPlaces;
        this.asciiArt = asciiArt;
        this.locationName = locationName;
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
    public String getLocationName(){
        return locationName;
    }
    public Map<String, String> getNextPlaces(){
        return nextPlaces;
    }
    public String getLocationDescription(){
        return locationDescription;
    }
    @Override
    public String toString(){
        return locationName;
    }

}
