package code;

import java.util.Map;
import java.util.Random;

public class Location {
    private Map<Character, String> nextPlaces;
    private String locationDescription;
    private int goldQuantity;

    public Location(String locationDescription, Map<Character, String> nextPlaces){
        this.locationDescription = locationDescription;
        this.nextPlaces = nextPlaces;
        Random random = new Random();
        this.goldQuantity = random.nextInt(0, 1000);

    }

}
