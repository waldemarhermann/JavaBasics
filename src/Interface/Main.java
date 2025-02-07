package Interface;

public class Main {

    public static void main(String[] args) {
        HundInterface labrador = new Labrador(3, "Bello", "braun");
        HundInterface dackel = new Dackel(2, "Dacki", "Schwarz");
        HundInterface schäferhund = new Schäferhund(5, "Luna", "Tan");

        HundInterface[] hunde = {labrador, dackel, schäferhund};

        for (HundInterface hund : hunde) {
            System.out.println(hund.getClass().toString());
            hund.bellen();
            hund.fressen();
        }

    }

}
