package Coreen;

public class TexteCoreen {
    String texte;

    public TexteCoreen(String texte) {
        this.texte = texte;
    }

    public int noConsonneInitiale(int position) {
        return 5;
    }

    public int noVoyelle(int position) {
        return 0;
    }

    public int noConsonneFinale(int position) {
        return 0;
    }

    public String traduire() {
        return texte;
    }
}
