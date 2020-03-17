package Coreen;

public enum ConsonneFinale {
    d0("",""),
    d1("\u3131","\u006B\u031A"),
    d2("\u3132","\u006B\u031A"),
    d3("\u3133","\u006B"),
    d4("\u3134","\u006E"),
    d5("\u3135","\u006E\u0074\u0255"),
    d6("\u3136","\u006E\u0068"),
    d7("\u3137","\u0074\u031A"),
    d8("\u3139","\u006C"),
    d9("\u313A","\u006B"),
    d10("\u313B","\u006D"),
    d11("\u313C","\u0070"),
    d12("\u313d","\u0073"),
    d13("\u313E","\u0074\u02B0"),
    d14("\u313F","\u0070\u02B0"),
    d15("\u3140","\u0068"),
    d16("\u3141","\u006D"),
    d17("\u3142","\u0070\u031A"),
    d18("\u3144","\u0070\u031A"),
    d19("\u3137","\u0074\u031A"),
    d20("\u3146","\u0074\u031A"),
    d21("\u3147","\u014B"),
    d22("\u3148","\u0074\u031A"),
    d23("\u314A","\u0074\u031A"),
    d24("\u314B","\u006B\u031A"),
    d25("\u314C","\u0074\u031A"),
    d26("\u314D","\u0070\u031A"),
    d27("\u314E","\u0074\u031A");

    private String jamosUnicode;
    private String ipaUniCode;

    ConsonneFinale(String jamosUnicode, String ipaUniCode) {
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
