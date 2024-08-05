import java.util.HashMap;
import java.util.Map;

public class Hashmatique {
    public static void main(String[] args) {
        // Create a HashMap to store song titles and lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Adding songs to the trackList
        trackList.put("Starlight", "Our hopes and expectations, black holes and revelations");
        trackList.put("Uprising", "We will be victorious");
        trackList.put("Hysteria", "I want it now, give me your heart and your soul");
        trackList.put("Supermassive Black Hole", "Glaciers melting in the dead of night");

        // Pull out one song by its track title
        String songTitle = "Hysteria";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics for " + songTitle + ": " + lyrics);

        // Print all track names and lyrics
        System.out.println("\nAll tracks:");
        for (Map.Entry<String, String> track : trackList.entrySet()) {
            System.out.println("Track: " + track.getKey() + " - Lyrics: " + track.getValue());
        }
    }
}