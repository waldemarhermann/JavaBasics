package AnonymeKlasse;


public class Main {

    public static void main(String[] args) {

        Katze katze = new Katze() {

            public void macheLaut() {
                System.out.println("mache meow");
            }

        };

        katze.macheLaut();


        rufeMethodeAuf(new Lebewesen() {

            @Override
            public void macheEtwas() {
                System.out.println("Wau");
            }
        });

    print(new Printable() {

        @Override
        public void print () {
            System.out.println("printPrint");
        }
    });

}


    public static void rufeMethodeAuf(Lebewesen lebewesen) {
        lebewesen.macheEtwas();
    }

    public static void print(Printable printable) {
        printable.print();
    }

}
