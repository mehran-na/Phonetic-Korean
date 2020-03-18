package Coreen;

import java.util.*;

public class TexteCoreen {
    String texte;

    ArrayList<HangeulChiffre> hangeulChiffres = new ArrayList<>();
    ArrayList<Hangeul> hangeulObjects = new ArrayList<>();
    //ArrayList<HangeulModifie> hangeulModifies = new ArrayList<>();

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

    /*
    private void creerHangeulModifie(){
        String ci = "";
        String di = "";
        for (int i = 1; i < jamoObjects.size(); i++){
            di = jamoObjects.get(i-1).jamoFinale;
            ci = jamoObjects.get(i).jamoInitiale;
            HangeulModifie hm = new HangeulModifie(ci, di);
            hangeulModifies.add(hm);
        }
    }
    */

    /*
    private void modifierHangeuls(){
        for(HangeulModifie item : hangeulModifies){
            item.trouverIPA();
            //call method for find unicode correct
            //method for split unicodeCorrect
        }
    }
    */

    private void modifierHangeuls() {
        int di = 0;
        int ci = 0;
        for(int i = 0; i < hangeulObjects.size() - 1 ; i++) {
            Hangeul.setObjectNumber();

            di = hangeulChiffres.get(i).getDi();
            ci = hangeulChiffres.get(i+1).getCi();

            if(di != 0){
                hangeulObjects.get(i).trouverIPA(di, ci);

                hangeulObjects.get(i).trouverUnicodeCorrect();

                hangeulObjects.get(i).assigneUnicodeCorrect();
            }else {
                hangeulObjects.get(i).setCi(Hangeul.getCiProchainObject());
            }

        }
    }

    private String Resultat() {
        String str = "";
        for(Hangeul item : hangeulObjects) {
            str += item.getCi()+item.getVi()+item.getDi();
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

        /*textTraduire = Arrays.toString(Hangeul.tableModification);
        for(int i = 9; i < 10; i++) {
            for(int j = 0; j < Hangeul.tableModification[i].length; j++) {
                    textTraduire += "\n" + Hangeul.tableModification[i][j];
            }

        }*/

        //textTraduire = Hangeul.tableModification[1][25];

        return textTraduire;
    }


}
