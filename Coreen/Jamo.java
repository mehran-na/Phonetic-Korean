package Coreen;

public class Jamo {
    String jamoInitiale;
    String jamoVoyelle;
    String jamoFinale;

    public Jamo(String jamoInitiale, String jamoVoyelle, String jamoFinale) {
        this.jamoInitiale = jamoInitiale;
        this.jamoVoyelle = jamoVoyelle;
        this.jamoFinale = jamoFinale;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "jamoInitiale='" + jamoInitiale + '\'' +
                ", jamoVoyelle='" + jamoVoyelle + '\'' +
                ", jamoFinale='" + jamoFinale + '\'' +
                '}';
    }
}
