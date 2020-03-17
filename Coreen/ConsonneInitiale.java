package Coreen;

public enum ConsonneInitiale {
    c1("\u3131","\u006B"),
    c2("\u3132","\u006B\u0324"),
    c3("\u3134","\u006E"),
    c4("\u3137","\u0074"),
    c5("\u3138","\u0074\u0324"),
    c6("\u3139","\u027E"),
    c7("\u3141","\u006D"),
    c8("\u3142","\u0070"),
    c9("\u3143","\u0070\u0324"),
    c10("\u3137","\u0073"),
    c11("\u3146","\u0073\u0324"),
    c12("\u3147",""),
    c13("\u3148","\u0074\u0255"),
    c14("\u3149","\u0074\u0324\u0255"),
    c15("\u314A","\u0074\u0255\u02B0"),
    c16("\u314B","\u006B\u02B0"),
    c17("\u314C","\u0074\u02B0"),
    c18("\u314D","\u0070\u02B0"),
    c19("\u314E","\u0068");

    private String jamosUnicode;
    private String ipaUniCode;

    ConsonneInitiale(String jamosUnicode, String ipaUniCode) {
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
