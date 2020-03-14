package Coreen;

import java.util.ArrayList;

public class TexteCoreen {
    String texte;
    ArrayList<Integer> codePoints = new ArrayList<>();
    ArrayList<Hangeul> hangeuls = new ArrayList<>();

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

    /**
     * Calculer code point Correspondant de chaque caractère.
     *
     * @return void
     */
    private void transferAuCodesPoints() {
        int codePoint;
        for(int i = 0; i < texte.length(); i++) {
            codePoint = texte.codePointAt(i);
            codePoints.add(codePoint);
        }
    }

    /**
     * Calculer ci, vi, di et créer object Hangeul de chaque code point.
     *
     * @return void
     */
    private void calculerHangeul() {
        int uiTemp;
        int ci;
        int vi;
        int di;
        for(int codePoint : codePoints) {
            uiTemp = codePoint - 44032;
            di = uiTemp % 28;
            vi = 1 + ((uiTemp - di) % 588) / 28;
            ci = 1 + (uiTemp / 588);
            Hangeul h = new Hangeul(ci, vi, di);
            hangeuls.add(h);
        }
    }

    public String traduire() {
        transferAuCodesPoints();
        calculerHangeul();
        //return texte;
    }
}
