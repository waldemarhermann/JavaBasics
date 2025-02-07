package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Functional Interface - Interface mit einer Methode

        /*Lebewesen hund = (v, n) -> return v + "Wuff" + n;
        Lebewesen katze = (v, n) -> return v + "Miau" + n;*/

        /*Lebewesen hund = (vor, nach) -> vor + "Wauff" + nach;

        String s = hund.macheEtwas("Das Lebewesen macht: ", "!!!");
        System.out.println(s); */

        /*Lebewesen katze = new Lebewesen() {

            @Override
            public String macheEtwas(String vor, String nach) {
                return vor + "Miau" + nach;
            }
        };*/

        /*Lebewesen katze = (vor, nach) -> vor + "Miau" + nach;

         rufeMethodeAuf(katze);*/


        /*List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        intList.forEach(item -> System.out.println(item));*/

        Rechner sum2 = new Rechner() {

            @Override
            public int rechnen(int zahl1, int zahl2) {
                return zahl1 + zahl2;
            }
        };


        Rechner sum = (zahl1, zahl2) -> zahl1+zahl2;
        Rechner sub = (zahl1, zahl2) -> zahl1-zahl2;
        Rechner mul = (zahl1, zahl2) -> zahl1*zahl2;
        Rechner div = (zahl1, zahl2) -> zahl1/zahl2;

        rechenOperation(sum, 5,3);

    }

    public static void rechenOperation(Rechner rechner, int zahl1, int zahl2) {
        int i = rechner.rechnen(zahl1,zahl2);
        System.out.println(i);
    }

    /*public static void rufeMethodeAuf(Lebewesen lebewesen) {
        String s = lebewesen.macheEtwas("Das Lebewesen sagt: ", "!!!");
        System.out.println(s);
    }*/
}
