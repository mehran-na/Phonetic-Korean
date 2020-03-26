package Coreen;

import java.util.*;

public class TexteCoreen {
    String texte;

    ArrayList<HangeulChiffre> hangeulChiffres = new ArrayList<>();
    ArrayList<Hangeul> hangeulObjects = new ArrayList<>();

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
    private void createHangeulChiffre() {
        int ci;
        int vi;
        int di;
        for(int i = 0; i < texte.length(); i++) {
            ci = noConsonneInitiale(i);
            vi = noVoyelle(i);
            di = noConsonneFinale(i);
            HangeulChiffre h = new HangeulChiffre(ci, vi, di);
            hangeulChiffres.add(h);
        }
    }

    /**
     * Créer object IPA et ajouter dans arrayList ipaObjects.
     *
     * @return void
     */
    private void creerHangeulObject() {
        String jamoInitiale;
        String jamoVoyelle;
        String jamoFinale;

        for(HangeulChiffre item : hangeulChiffres) {
            ConsonneInitiale ci = Enum.valueOf(ConsonneInitiale.class, "C_" + item.getCi());
            jamoInitiale = ci.getIpaUniCode();

            Voyelle vi = Enum.valueOf(Voyelle.class, "V_" + item.getVi());
            jamoVoyelle = vi.getIpaUniCode();

            ConsonneFinale di = Enum.valueOf(ConsonneFinale.class, "D_" + item.getDi());
            jamoFinale = di.getIpaUniCode();

            Hangeul u = new Hangeul(jamoInitiale, jamoVoyelle, jamoFinale);
            hangeulObjects.add(u);
        }
    }

    private void modifierHangeuls() {
        int di = 0;
        int ci = 0;
        for(int i = 0; i < hangeulObjects.size() - 1; i++) {
            Hangeul.setObjectNumber();

            di = hangeulChiffres.get(i).getDi();
            ci = hangeulChiffres.get(i + 1).getCi();

            if (i == 0) {
                if (di != 0) {
                    Hangeul.trouverIPA(di, ci);
                    hangeulObjects.get(i).trouverUnicodeCorrect();
                    hangeulObjects.get(i).assigneUnicodeCorrect();
                }else{
                    Hangeul.setCiProchainObject(hangeulObjects.get(i + 1).getCi());
                }
            }else{
                if (di != 0) {
                    hangeulObjects.get(i).setCi(Hangeul.getCiProchainObject());
                    Hangeul.trouverIPA(di, ci);
                    hangeulObjects.get(i).trouverUnicodeCorrect();
                    hangeulObjects.get(i).assigneUnicodeCorrect();
                }else{
                    hangeulObjects.get(i).setCi(Hangeul.getCiProchainObject());
                    Hangeul.setCiProchainObject(hangeulObjects.get(i + 1).getCi());
                }
            }
        }
    }

    private String Resultat() {
        String str = "";
        for(Hangeul item : hangeulObjects) {
            str += item.getCi() + item.getVi() + item.getDi();
        }
        return str;
    }

    public String traduire() {
        // 쏙누붤댅딡
        String textTraduire = "";
        createHangeulChiffre();
        creerHangeulObject();
        modifierHangeuls();
        textTraduire = Resultat();
        return textTraduire;
    }


}
