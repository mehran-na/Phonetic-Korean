package Coreen;

public enum ConsonneFinale {
    d0(""),
    d1("\u006B\u031A"),
    d2("\u006B\u031A"),
    d3("\u006B"),
    d4("\u006E"),
    d5("\u006E\u0074\u0255"),
    d6("\u006E\u0068"),
    d7("\u0074\u031A"),
    d8("\u006C"),
    d9("\u006B"),
    d10("\u006D"),
    d11("\u0070"),
    d12("\u0073"),
    d13("\u0074\u02B0"),
    d14("\u0070\u02B0"),
    d15("\u0068"),
    d16("\u006D"),
    d17("\u0070\u031A"),
    d18("\u0070\u031A"),
    d19("\u0074\u031A"),
    d20("\u0074\u031A"),
    d21("\u014B"),
    d22("\u0074\u031A"),
    d23("\u0074\u031A"),
    d24("\u006B\u031A"),
    d25("\u0074\u031A"),
    d26("\u0070\u031A"),
    d27("\u0074\u031A");

    private String uniCode;

    ConsonneFinale(String aUniCode) {
        uniCode = aUniCode;
    }

    public String getUniCode() {
        return uniCode;
    }
}
