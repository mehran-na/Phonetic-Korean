package Coreen;

public enum Voyelle {
    v1("\u314F","\u0061"),
    v2("\u3150","\u025B"),
    v3("\u3151","\u006A\u0061"),
    v4("\u3152","\u006A\u025B"),
    v5("\u3153","\u028C"),
    v6("\u3154","\u0065"),
    v7("\u3155","\u006A\u028C"),
    v8("\u3156","\u006A\u0065"),
    v9("\u3157","\u006F"),
    v10("\u3158","\u0077\u0061"),
    v11("\u3159","\u0077\u025B"),
    v12("\u315A","\u00F8"),
    v13("\u315B","\u006A\u006F"),
    v14("\u315C","\u0075"),
    v15("\u315D","\u0077\u028C"),
    v16("\u315E","\u0077\u0065"),
    v17("\u315F","\u0079"),
    v18("\u3160","\u006A\u0075"),
    v19("\u3161","\u026F"),
    v20("\u3162","\u0270\u0069"),
    v21("\u3163","\u0069");

    private String jamosUnicode;
    private String ipaUniCode;

    Voyelle(String jamosUnicode, String ipaUniCode) {
        this.jamosUnicode = jamosUnicode;
        this.ipaUniCode = ipaUniCode;
    }

    public String getJamosUnicode() {
        return jamosUnicode;
    }

    public String getIpaUniCode() {
        return ipaUniCode;
    }
}
