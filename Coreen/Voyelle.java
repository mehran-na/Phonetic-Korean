package Coreen;

/*
* Classe enum Voyelle
*
* table voyelle contient la prononciation international pour chaque jamo
* */
public enum Voyelle {
    V_1("\u314F","\u0061"),
    V_2("\u3150","\u025B"),
    V_3("\u3151","\u006A\u0061"),
    V_4("\u3152","\u006A\u025B"),
    V_5("\u3153","\u028C"),
    V_6("\u3154","\u0065"),
    V_7("\u3155","\u006A\u028C"),
    V_8("\u3156","\u006A\u0065"),
    V_9("\u3157","\u006F"),
    V_10("\u3158","\u0077\u0061"),
    V_11("\u3159","\u0077\u025B"),
    V_12("\u315A","\u00F8"),
    V_13("\u315B","\u006A\u006F"),
    V_14("\u315C","\u0075"),
    V_15("\u315D","\u0077\u028C"),
    V_16("\u315E","\u0077\u0065"),
    V_17("\u315F","\u0079"),
    V_18("\u3160","\u006A\u0075"),
    V_19("\u3161","\u026F"),
    V_20("\u3162","\u0270\u0069"),
    V_21("\u3163","\u0069");

    private String jamosUnicode;
    private String ipaUniCode;

    //constructor :
    Voyelle(String jamosUnicode, String ipaUniCode) {
        this.jamosUnicode = jamosUnicode;
        this.ipaUniCode = ipaUniCode;
    }

    //getters :
    public String getJamosUnicode() {
        return jamosUnicode;
    }

    public String getIpaUniCode() {
        return ipaUniCode;
    }
}
