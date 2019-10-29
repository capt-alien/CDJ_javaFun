import java.util.HashMap;
import java.util.Set;


public class Hashmap {
    public static void main(String[] args){
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Somehting", "something something something");
        trackMap.put("Somehting else", "Yiddie");
        trackMap.put("Tribute", "This is not the greatest Hashmap in the world...this is just a Tribute");
        trackMap.put("aaaaa", "bbbb");

        // get keys
        Set<String> keys = trackMap.keySet();
        for (String key: keys){
            System.out.println(key);
            System.out.println(trackMap.get(key));
        }
        String track = trackMap.get("Tribute");
        System.out.println(track);

    }
}
