package Coreen;

public enum ConsonneInitiale {
    c1("\u006B"),
    c2("\u006B\u0324"),
    c3("\u006E"),
    c4("\u0074"),
    c5("\u0074\u0324"),
    c6("\u027E"),
    c7("\u006D"),
    c8("\u0070"),
    c9("\u0070\u0324"),
    c10("\u0073"),
    c11("\u0073\u0324"),
    c12(""),
    c13("\u0074\u0255"),
    c14("\u0074\u0324\u0255"),
    c15("\u0074\u0255\u02B0"),
    c16("\u006B\u02B0"),
    c17("\u0074\u02B0"),
    c18("\u0070\u02B0"),
    c19("\u0068");

    private String uniCode;

    ConsonneInitiale(String aUniCode) {
        uniCode = aUniCode;
    }

    public String getUniCode() {
        return uniCode;
    }
}
