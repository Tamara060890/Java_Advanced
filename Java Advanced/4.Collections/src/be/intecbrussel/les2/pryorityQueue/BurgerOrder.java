package be.intecbrussel.les2.pryorityQueue;

public class BurgerOrder implements Comparable<BurgerOrder>{
    private String naam;
    private int nummer;

    public BurgerOrder(String naam, int nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public int compareTo(BurgerOrder o) {
        return this.getNummer() - o.getNummer();
    }

    @Override
    public String toString() {
        return  naam +  nummer;
    }
}
