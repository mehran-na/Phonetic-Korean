package Coreen;

import java.util.*;

public class TexteCoreen {
    String texte;

    ArrayList<Hangeul> hangeuls = new ArrayList<>();
    ArrayList<Jamo> jamoObjects = new ArrayList<>();

    //Constructor
    public TexteCoreen(String texte) {
        this.texte = texte;
    }

    public int noConsonneInitiale(int position) {
        //char monChar = texte.charAt(position); //쏙
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return 1 + (uiTemp / 588);
    }

    public int noVoyelle(int position) {
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return 1 + ((uiTemp - (uiTemp % 28)) % 588) / 28;
    }

    public int noConsonneFinale(int position) {
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return uiTemp % 28;
    }


    /**
     * Calculer ci, vi, di et créer object Hangeul de chaque code point.
     *
     * @return void
     */
    private void createHangeul() {
        int ci;
        int vi;
        int di;
        for(int i = 0; i < texte.length(); i++) {
            ci = noConsonneInitiale(i);
            vi = noVoyelle(i);
            di = noConsonneFinale(i);
            Hangeul h = new Hangeul(ci, vi, di);
            hangeuls.add(h);
        }
    }

    /**
     * Créer object IPA et ajouter dans arrayList ipaObjects.
     *
     * @return void
     */
    private void createJamoObject() {
        String jamoInitiale;
        String jamoVoyelle;
        String jamoFinale;

        for(Hangeul item : hangeuls) {
            ConsonneInitiale ci = Enum.valueOf(ConsonneInitiale.class, "c" + item.getCi());
            jamoInitiale = ci.getJamosUnicode();

            Voyelle vi = Enum.valueOf(Voyelle.class, "v" + item.getVi());
            jamoVoyelle = vi.getJamosUnicode();

            ConsonneFinale di = Enum.valueOf(ConsonneFinale.class, "d" + item.getDi());
            jamoFinale = di.getJamosUnicode();

            Jamo u = new Jamo(jamoInitiale, jamoVoyelle, jamoFinale);
            jamoObjects.add(u);
        }
    }

    public String traduire() {
        // 쏙누붤댅딡
        String textTraduire = "";
        createHangeul();
        createJamoObject();
        textTraduire = jamoObjects.get(0).toString();
        return textTraduire;
    }
}
