package HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
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


        Map<String, String> capitals = new HashMap<>();
        capitals.put("Deutschland", "Berlin");
        capitals.put("Frankreich", "Paris");
        capitals.put("Belgien", "Brüssel");
        capitals.put("Schweiz", "Bern");
        capitals.put("Österreich", "Wien");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Philippinen", "Manila");
        capitals.put("Taiwan", "Taipeh");
        capitals.put("Südkorea", "Seoul");
        capitals.put("Grönland", "Nuuk");

        while (true) {
            Set<String> keySet2 = capitals.keySet();
            for (String string : keySet2) {
                System.out.println("Was ist die Hauptstadt von: " + string);
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if (capitals.get(string).equals(input)) {
                    System.out.println("richtig!");
                } else {
                    System.out.println("Falsch");
                }
            }
            break;
        }
    }
}
