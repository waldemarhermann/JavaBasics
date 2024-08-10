package HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String [] args) {
        Map<String, Integer> mountains = new HashMap<>();
        mountains.put("Lhotse", 8516);
        mountains.put("Kangchendzönga", 8586);
        mountains.put("Mount Godwin Austen", 8611);
        mountains.put("Mount Everest", 8848);

        Set<String> keySet = mountains.keySet();
        for (String s : keySet) {
            System.out.println("Die Höhe des Berges: " + s + " beträgt: " + mountains.get(s)); // Über get bekommt man das value, s ist dabei der key.
        }
    }
}
