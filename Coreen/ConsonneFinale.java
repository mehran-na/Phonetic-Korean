package Coreen;
/*
* Classe enum ConsonneFinale
* table consonne final contient la prononciation international pour chaque jamo
*
* */
public enum ConsonneFinale {
    D_0("", "", 0),
    D_1("\u3131", "\u006B\u031A", 1),
    D_2("\u3132", "\u006B\u031A", 2),
    D_3("\u3133", "\u006B", 3),
    D_4("\u3134", "\u006E",4 ),
    D_5("\u3135", "\u006E\u0074\u0255",5 ),
    D_6("\u3136", "\u006E\u0068", 6),
    D_7("\u3137", "\u0074\u031A", 7),
    D_8("\u3139", "\u006C", 8),
    D_9("\u313A", "\u006B", 9),
    D_10("\u313B", "\u006D", 10),
    D_11("\u313C", "\u0070", 11),
    D_12("\u313d", "\u0073", 12),
    D_13("\u313E", "\u0074\u02B0",13 ),
    D_14("\u313F", "\u0070\u02B0", 14),
    D_15("\u3140", "\u0068", 15),
    D_16("\u3141", "\u006D", 16),
    D_17("\u3142", "\u0070\u031A", 17),
    D_18("\u3144", "\u0070\u031A", 18),
    D_19("\u3137", "\u0074\u031A", 19),
    D_20("\u3146", "\u0074\u031A", 20),
    D_21("\u3147", "\u014B", 21),
    D_22("\u3148", "\u0074\u031A", 22),
    D_23("\u314A", "\u0074\u031A", 23),
    D_24("\u314B", "\u006B\u031A", 24),
    D_25("\u314C", "\u0074\u031A", 25),
    D_26("\u314D", "\u0070\u031A", 26),
    D_27("\u314E", "\u0074\u031A", 27);

    private String jamosUnicode;
    private String ipaUniCode;
    private int num;

    //constructor
    ConsonneFinale(String jamosUnicode, String ipaUniCode, int num) {
        this.jamosUnicode = jamosUnicode;
        this.ipaUniCode = ipaUniCode;
        this.num = num;
    }

    //geters :
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
    * trouver jamos correspondance, il prendre un integer et il trouver jamos
    *
    * @param num : un chiffre integer
    * @return jamos correspondance
    * */
    public static String trouverJamos(int num) {
        for(ConsonneFinale item : ConsonneFinale.values()) {
            if (item.getNum() == num) {
                return item.jamosUnicode;
            }
        }
        return null;
    }
}
