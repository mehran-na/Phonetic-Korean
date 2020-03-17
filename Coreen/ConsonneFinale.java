package Coreen;

public enum ConsonneFinale {
    D_0("",""),
    D_1("\u3131","\u006B\u031A"),
    D_2("\u3132","\u006B\u031A"),
    D_3("\u3133","\u006B"),
    D_4("\u3134","\u006E"),
    D_5("\u3135","\u006E\u0074\u0255"),
    D_6("\u3136","\u006E\u0068"),
    D_7("\u3137","\u0074\u031A"),
    D_8("\u3139","\u006C"),
    D_9("\u313A","\u006B"),
    D_10("\u313B","\u006D"),
    D_11("\u313C","\u0070"),
    D_12("\u313d","\u0073"),
    D_13("\u313E","\u0074\u02B0"),
    D_14("\u313F","\u0070\u02B0"),
    D_15("\u3140","\u0068"),
    D_16("\u3141","\u006D"),
    D_17("\u3142","\u0070\u031A"),
    D_18("\u3144","\u0070\u031A"),
    D_19("\u3137","\u0074\u031A"),
    D_20("\u3146","\u0074\u031A"),
    D_21("\u3147","\u014B"),
    D_22("\u3148","\u0074\u031A"),
    D_23("\u314A","\u0074\u031A"),
    D_24("\u314B","\u006B\u031A"),
    D_25("\u314C","\u0074\u031A"),
    D_26("\u314D","\u0070\u031A"),
    D_27("\u314E","\u0074\u031A");

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
