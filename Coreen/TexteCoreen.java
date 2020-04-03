package Coreen;

import java.util.*;

/**
 * Classe TexteCoreen
 *
 * @author : Mehran Nazemi
 * @version : mars 2020
 * @Professeur : M.Bruno Malenfant
 * @email : nazemi.mehran@courrier.uqam.ca
 * @code permanent  : NAZM30088507
 */
public class TexteCoreen {
    private String texte;

    private ArrayList<HangeulChiffre> hangeulChiffres = new ArrayList<>();
    private ArrayList<Hangeul> hangeulObjects = new ArrayList<>();

    //Constructor
    public TexteCoreen(String texte) {
        this.texte = texte;
    }

    /**
     * Calculer ci pour chaque caractère de text coreen
     *
     * @param position : index de chaque caractère dans text coreen
     *
     * @return int (ci)
     */
    public int noConsonneInitiale(int position) {
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return 1 + (uiTemp / 588);
    }

    /**
     * Calculer vi pour chaque caractère de text coreen
     *
     * @param position : index de chaque caractère dans text coreen
     *
     * @return int (vi)
     */
    public int noVoyelle(int position) {
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return 1 + ((uiTemp - (uiTemp % 28)) % 588) / 28;
    }

    /**
     * Calculer di pour chaque caractère de text coreen
     *
     * @param position : index de chaque caractère dans text coreen
     *
     * @return int (di)
     */
    public int noConsonneFinale(int position) {
        int codePoint = texte.codePointAt(position);
        int uiTemp = codePoint - 44032;
        return uiTemp % 28;
    }


    /**
     * Créer object de la classe HangeulChiffre et ajouter dans array list
     *
     * il deviant par exemple comme ça : [(11,9,1), (3,14,0), ...]
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
     * Créer object de la classe Hangeul et ajouter dans arrayList hangeulObjects.
     *
     * il deviant par exemple comme ça : [(s̤,o,k ̚), (n,u,-), ...]
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

    /**
     * modifier les objet hanguel dans array list
     *
     * remplacement pour 2 consonnes qui se suivent, il deviant par exemple comme ça :
     * [(s̤,o,ŋ), (-,u,-), ...]
     *
     * @return void
     */
    private void modifierHangeuls() {
        int di = 0;
        int ci = 0;
        for(int i = 0; i < hangeulObjects.size(); i++) {
            if (i == 0) {
                Hangeul.setCiProchainObject(hangeulObjects.get(i).getCi());
            }

            if (i == hangeulObjects.size() - 1) {
                hangeulObjects.get(i).setCi(Hangeul.getCiProchainObject());
            }else{
                di = hangeulChiffres.get(i).getDi();
                ci = hangeulChiffres.get(i + 1).getCi();
                aiderFunction(di, ci, i);
            }
        }
    }

    /**
     * cette function va aider la function modifierHangeuls
     *
     * parce que je veux pas avoire beaucoup code dans function modifierHanguel
     * alors j'ai mis une partie de code ici
     *
     * @param di : dernière consonne du objet hangeul
     * @param ci : première  consonne du objet hangeul suivant
     * @param i : index d'objet dans array list
     *
     * @return void
     */
    private void aiderFunction(int di, int ci, int i) {
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

    /**
     * Prendre array list des hangeuls et returner les element comme string
     *
     * @return String
     */
    private String Resultat() {
        String str = "";
        for(Hangeul item : hangeulObjects) {
            str += item.getCi() + item.getVi() + item.getDi();
        }
        return str;
    }

    public String traduire() {
        //쏙누붤댅딡
        //각나
        String textTraduire = "";
        createHangeulChiffre();
        creerHangeulObject();
        modifierHangeuls();
        textTraduire = Resultat();
        return textTraduire;
    }
}