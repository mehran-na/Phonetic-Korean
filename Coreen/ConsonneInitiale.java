package Coreen;

public enum ConsonneInitiale {
    C_1("\u3131","\u006B"),
    C_2("\u3132","\u006B\u0324"),
    C_3("\u3134","\u006E"),
    C_4("\u3137","\u0074"),
    C_5("\u3138","\u0074\u0324"),
    C_6("\u3139","\u027E"),
    C_7("\u3141","\u006D"),
    C_8("\u3142","\u0070"),
    C_9("\u3143","\u0070\u0324"),
    C_10("\u3137","\u0073"),
    C_11("\u3146","\u0073\u0324"),
    C_12("\u3147",""),
    C_13("\u3148","\u0074\u0255"),
    C_14("\u3149","\u0074\u0324\u0255"),
    C_15("\u314A","\u0074\u0255\u02B0"),
    C_16("\u314B","\u006B\u02B0"),
    C_17("\u314C","\u0074\u02B0"),
    C_18("\u314D","\u0070\u02B0"),
    C_19("\u314E","\u0068");

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
