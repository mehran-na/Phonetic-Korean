package Coreen;

/*
 * Classe enum ConsonneInitiale
 *
 * table consonne initiale contient la prononciation international pour chaque jamo
 *
 * */
public enum ConsonneInitiale {
    C_1("\u3131", "\u006B", 1),
    C_2("\u3132", "\u006B\u0324", 2),
    C_3("\u3134", "\u006E",3),
    C_4("\u3137", "\u0074",4),
    C_5("\u3138", "\u0074\u0324",5),
    C_6("\u3139", "\u027E",6),
    C_7("\u3141", "\u006D",7),
    C_8("\u3142", "\u0070",8),
    C_9("\u3143", "\u0070\u0324",9),
    C_10("\u3137", "\u0073",10),
    C_11("\u3146", "\u0073\u0324",11),
    C_12("\u3147", "",12),
    C_13("\u3148", "\u0074\u0255",13),
    C_14("\u3149", "\u0074\u0324\u0255",14),
    C_15("\u314A", "\u0074\u0255\u02B0",15),
    C_16("\u314B", "\u006B\u02B0",16),
    C_17("\u314C", "\u0074\u02B0",17),
    C_18("\u314D", "\u0070\u02B0",18),
    C_19("\u314E", "\u0068",19);

    private String jamosUnicode;
    private String ipaUniCode;
    private int num;

    //constructor :
    ConsonneInitiale(String jamosUnicode, String ipaUniCode, int num) {
        this.jamosUnicode = jamosUnicode;
        this.ipaUniCode = ipaUniCode;
        this.num = num;
    }

    //getters :
    public String getJamosUnicode() {
        return jamosUnicode;
    }

    public String getIpaUniCode() {
        return ipaUniCode;
    }

    public int getNum() {
        return num;
    }

    /*
     * Trouver jamos correspondance
     *
     * elle prendre un integer et il trouver jamos
     *
     * @param num : un chiffre integer
     * @return jamos correspondance
     * */
    public static String trouverJamos(int num) {
        for(ConsonneInitiale item : ConsonneInitiale.values()) {
            if (item.getNum() == num) {
                return item.jamosUnicode;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        return "ConsonneInitiale{" +
                "jamosUnicode='" + jamosUnicode + '\'' +
                ", ipaUniCode='" + ipaUniCode + '\'' +
                "} ";
    }
}
