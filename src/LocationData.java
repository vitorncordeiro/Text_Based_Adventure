package code;

import java.util.HashMap;
import java.util.Map;

public class LocationData {
    private Map<String, Location> locations;
    public LocationData(){

        this.locations = new HashMap<>(Map.of(
                /*The String here are the key for locations, and the value are the Object Location. The object location
                has an HashMap as argument, and I used the Map.of again, for the directions wich any location have.
                */
                "camping",
                new Location("camping", "A humble ring of tents stands amidst the wild, smoke curling softly from the hearth.\n" +
                        "Travelers gather here, trading tales beneath the stars.\n" +
                        "It is a fleeting refuge, ever at the mercy of the wandering winds.", new HashMap<>(Map.of("N", "village", "S", "destroyed tower",
                "E", "mountain", "W", "waterfall"
                )), "oi"),
                "mountain",
                new Location("mountain","Dark and stern, the mountain rises like a crown of stone.\n" +
                        "Its crags cut the sky, ever shrouded by drifting clouds.\n" +
                        "Few dare tread its paths, for echoes of giants are said to stir there still.", new HashMap<>(Map.of("N", "sunken ship", "S", "dragon's cave",
                        "W", "camping"
                )), "."),
                "waterfall",
                new Location("waterfall","From the high cliffs tumbles a silver veil of water, roaring with ancient might.\n" +
                        "Mist hangs in the air, cool and sweet, like breath from the mountains.\n" +
                        "Legends whisper that hidden caves lie behind its endless cascade.", new HashMap<>(Map.of("N", "flower garden", "S", "ancient tree",
                        "E", "camping"
                )), "."),
                "dragon's cave",
                new Location("dragon's cave","A yawning maw of black stone gapes against the hillside.\n" +
                        "The air reeks faintly of smoke and brimstone.\n" +
                        "Folk speak in hushed voices, for none return who trespass its lair.", new HashMap<>(Map.of("N", "mountain",
                        "W", "destroyed tower"
                )), """
                        #+#%%#%%%%##########=* -.                                                              *###+-+*- .                                                          \s
                        **++#################*#=-         -:                                                    .+*#+  +**-.                                                        \s
                        *##+.*#######*########*++=:=:      ::                                  +               :##*#** .:-*:.                                                       \s
                        ####+:-=*#####*#######*#*++=:.:                -******#######%######*#*.            -+*+#*****-.+     :=-+=                                                 \s
                        ++##+*-..:-+***-+####+**++*+:. .   :.  =**#####****+++*++++*###%%%%%#                :*###***#**++-    =+*                                                  \s
                        #.-+=--: .  -.=---++=++++++=--+*#%%%%###**+++++*******##*+===*%#++##+               .+####****                                                              \s
                        ###  ::    =-===:   :-=*#%%%%%%%%%%%#######**+**###*==++++**#*===+%#                  =##***#=                                          .+                  \s
                        ####- .:-.     ..:::#%%%%%%%%%%%%%%%%%######%%#*++***++=+#%***+++#%*                 =####**-=                                         +#*                  \s
                        ####*           -%%%%%%%%%%%%%%%%%%%%%%%%%%##*******+**##***+++*%%#.                   =#%#**+:                                     -###%#                  \s
                        ###%%%#     :*%%%%%%%%%%%%%%%%%%%%%%%%%%%###########*#%##***+++%%%:                    ###%#*+=:                     :.     ...::+##+++####                 \s
                        %%%%%%%%#+:#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###########%#####*#%%%%#                         #%#**+.                   -- . ....:+##*+++*#*#**#                \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##%%%###%%%%%########%%%%%::                        #%#***-                ::---::.::#%#*+++++#**#**#=               \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%#%%%%########%***%%#:--                     =#%###**=.            .:-==-----*%#+++*++*#***#*###               \s
                        %%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%####%%%%%%%%%%%%%%#%%%%%##%%*#**%%%*=+                      #%##**==--         ..:=--= :=#%++++++**#*++#****# .    \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###%#%%%%%%%%%%%#%%%%%%###%#######%%##*+                  =#%#%##**+**=      :=--:.    *##+++++++*#++**#*###*  .   \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#######%%%###%%####%%%%###%%#########%%#*#*                +#%#####**+::+    :---.-- .*##%*+++++++#****######*      \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###%%%%#####%%####%%%%%%##%###%%#######%%#***+    +-  :*#%%######*#**=+*+  ::-.-+++##%%%%*+++++**#****#%######      \s
                        #%%%%%%%%%%%%%%%%%%%%%%%%%%%#####%%#######%##%%%%%%%%%%#%%##%%%%%%%#####%%%#****###########****##***#*+#-::*######%%#++%********#**###%#%%%%=  \s
                        %%%%%%%%%%%########%%%%#%######################%###%%###%%%%%%%%%%#%%####%%%%########*##**+#*###%#*#*+******##%%%##****#******+#**###%##%%%%. \s
                        %%%%%%#############%%######         ####################%%%#%%%%%%%%%%%%%%%%%%%%%###*#**++########*#**%#%#%%%%%####***####*###*########%#%%#**# \s
                        #%%%%%%%%%%##%#####*=*##            #####             +%%#%%%%%%%%%%%%%%%%%%%%%%%%%##*++++**##%##****##%%%%##########################%%##%--  \s
                        #%%%%%%%%%%%%######                ###                   - +####%%%%%%%%%%%%%%%%%%%%%##+**##%###%%####**%%####%%%###%%%%#%%############%##* \s
                        %%%%%%%%###%#####                                       .*+#==+**##%%%%%%%%%%##%%%%%%%##**##%%%%########%%%%%%%%%%%%%%%%#%%#####****######  \s
                        %%%%%###%%########=.-:.  :---:                :.       .=*+=***#*##*##%#%#%%%%%%%%%%######%%%%##%###%%#%%%%%%#####%%%%%%%%###*#*+ :*#####* \s
                        %%%%%%%#############:.--.      . . .:=-.           . .-++***##########%%%%%%%%%%%%%#####%%%%%%%%%%%%##%###*=::  .*##%#%%%##*  *=   +*####= \s
                        %%%%%%%%############*.    .                   .:.  =*#+*###########%%%%%%%%%%%%%%%%#####%%%%%%%%%%%####*...       .+*#####-         =*### \s
                        %%%%%%%%%%%##=+*#*###%#:         .::--=-   .:: ....*####%%%%######%%%%%#%%%#%##%%%###%%%%%%%%%%%%%##                   *+           -###:  \s
                        %%%%%%%%%%%%%%%%%%%##%%%#*                  :..:#####%%%%%%%%###%%%%%%%%%#-   #%##%%%#.=:   #%%%#                                  +##=  \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%##+=...:::::.:::.::====*###%%%%  #%%#%%%%   %%%%#   :-%##%%%.       #%%%=                                 .*## \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%###***=-   ..-:----:=##%%%%#  ##%#%%%%%#  #####  =#%%%%%#.     :. +%%%%                                  =# \s
                        %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##%####*--:-=*##%%%%   *#%%%%%%%   ####   =-%%%%%#        -%%%%.                                  #\s
                        %%%%%%%%%%%%#%%%#%%%%%%%%%%%%##%%%%###%%######%%%%*  :%%%%%%%%   =#%%      =%%%%-          #%%:                        \s
                        %%%%%%%%%%%%#####%%###%%%%%%%%%%%%%%%%%%%%%%%%%%#=**##%%%%#*==+####%###*##+%%%%+::=-==-.  :#%%                         \s
                        %%%%%%%%%%%%%#####%%%#########%%%%%%%%%%%%%%%%#*=*###%%%%#%%%%#%##%###**##*%%%%%%%#+++*****#%#+-    :*+                \s                   
                          """),
                "village",
                new Location("village","A cluster of thatched roofs nestles warmly amidst rolling hills.\n" +
                        "Chimneys puff smoke, and laughter carries on the crisp air.\n" +
                        "Here folk live simply, with songs as old as the fields they till.", new HashMap<>(Map.of( "S", "camping",
                        "E", "sunken ship", "W", "flower garden"
                )), "."),
                "sunken ship",
                new Location("sunken ship","Broken masts jut from the waves like skeletal fingers.\n" +
                        "The sea moans through shattered timbers, a dirge of old voyages.\n" +
                        "Treasure, or curses, may yet linger in its drowned hold.", new HashMap<>(Map.of("S", "mountain",
                        "W", "village"
                )), "."),
                "ancient tree",
                new Location("ancient tree","Its gnarled roots clutch the earth as if older than the hills themselves.\n" +
                        "Branches spread wide, sheltering all beneath in solemn shade.\n" +
                        "Whispers ride the wind here, as though the tree remembers forgotten tongues.", new HashMap<>(Map.of("N", "waterfall",
                        "E", "destroyed tower"
                )), "."),
                "destroyed tower",
                new Location("destroyed tower","Once proud and tall, the tower now leans in weary silence.\n" +
                        "Its stones lie scattered, like bones of a forgotten age.\n" +
                        "Yet on moonlit nights, some swear ghostly lights haunt its hollow crown.", new HashMap<>(Map.of("N", "camping",
                        "E", "dragon's cave", "W", "ancient tree"
                )), "."),
                "flower garden",
                new Location("flower garden","A meadow blooms with colors bright as gems in sunlight.\n" +
                        "The air is thick with honey-sweet fragrance, gentle and fair.\n" +
                        "It is said the flowers here never wither, even in the coldest winters.", new HashMap<>(Map.of( "S", "waterfall",
                        "E", "village"
                )), ".")

        ));

    }
    public Map<String, Location> getLocations(){
        return locations;
    }


}
