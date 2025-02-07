package Interface;

public class Schäferhund implements HundInterface {

    int alter;
    String name;
    String farbe;

    public Schäferhund(int alter, String name, String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    @Override
    public void bellen() {
        System.out.println("Waff");
    }

    @Override
    public void fressen() {
        System.out.println("Mumpf");
    }

}
