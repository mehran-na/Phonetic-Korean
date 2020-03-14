package Coreen;

import java.util.ArrayList;

public class TexteCoreen {
    String texte;
    ArrayList<Integer> codePoints = new ArrayList<>();

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

    public void transferAuCodesPoints(){
        int codePoint;
        for (int i = 0; i < texte.length(); i++){
            codePoint = texte.codePointAt(i);
            codePoints.add(codePoint);
        }
    }

    public String traduire() {
        transferAuCodesPoints();
        return codePoints.toString();
        //return texte;
    }
}
