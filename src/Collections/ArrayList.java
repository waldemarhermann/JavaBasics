package Collections;

import java.util.List;
import java.util.Scanner;

public class ArrayList {

    public static void main(String [] args) {
        // Array
        int[] primeNumbers = new int[3];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;

        // ArrayList
        java.util.ArrayList primeNumberList = new java.util.ArrayList();
        primeNumberList.add(2);
        primeNumberList.add(3);
        primeNumberList.add(5);

        /*ArrayList mit Interface List: Stellt sicher, dass primeNumberListInteger-Objekt
        * nur die Methoden benutzen kann, die von List-Interface bereitgestellt werden.
        * */
        List<Integer> primeNumberListInteger = new java.util.ArrayList<>();
        primeNumberListInteger.add(2);
        primeNumberListInteger.add(3);
        primeNumberListInteger.add(5);

        primeNumberListInteger.remove(0);

        System.out.println(primeNumberListInteger.contains(4));

        for (int i : primeNumberListInteger) {
            System.out.println(i);
        }

        // Einkaufsliste erstellen
        List<String> einkaufsliste = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Brauchen wir noch etwas? (j/n)");
            String s = scanner.next();
            if (s.equals("j")) {
                System.out.println("Bitte geben Sie Ihr Produkt ein: ");
                String produkt = scanner.next();
                einkaufsliste.add(produkt);
            } else if (s.equals("n")){
                for (String produkte : einkaufsliste) {
                    System.out.println(produkte);
                }
                break;
            }
        }

    }
}


/* Hauptunterschiede:
 * 1. Größe: Arrays haben feste Größe (wie eine Art feste Box), ArrayLists sind dynamisch (wie eine Liste).
 * 2. Typ: Arrays können primitive Datentypen speichern, ArrayLists nur Objekte.
 * 3. Funktionalität: ArrayLists bieten mehr eingebaute Methoden.
 * 4. Performance: Arrays sind schneller bei direktem Zugriff.
 * 5. Syntax: Arrays verwenden eckige Klammern, ArrayLists Methoden.
 * */
