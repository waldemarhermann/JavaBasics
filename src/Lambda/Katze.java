package Lambda;

public class Katze implements Lebewesen{

    public String macheEtwas(String vor, String nach) {
        return vor + "Miau" + nach;
    }

    public void essen() {
        System.out.println("Essen");
    }

}
