package Interface;

public class Dackel implements HundInterface {

        int alter;
        String name;
        String farbe;

        public Dackel(int alter, String name, String farbe) {
            this.alter = alter;
            this.name = name;
            this.farbe = farbe;
        }

        public String getName() {
            return name;
        }

        @Override
        public void bellen() {
            System.out.println("Wuff");
        }

        @Override
        public void fressen() {
            System.out.println("Mampf");
        }

}
