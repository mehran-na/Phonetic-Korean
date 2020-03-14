package Coreen;

public enum Voyelle {
    v1("\u0061"),
    v2("\u025B"),
    v3("\u006A\u0061"),
    v4("\u006A\u025B"),
    v5("\u028C"),
    v6("\u0065"),
    v7("\u006A\u028C"),
    v8("\u006A\u0065"),
    v9("\u006F"),
    v10("\u0077\u0061"),
    v11("\u0077\u025B"),
    v12("\u00F8"),
    v13("\u006A\u006F"),
    v14("\u0075"),
    v15("\u0077\u028C"),
    v16("\u0077\u0065"),
    v17("\u0079"),
    v18("\u006A\u0075"),
    v19("\u026F"),
    v20("\u0270\u0069"),
    v21("\u0069");

    private String uniCode;

    Voyelle(String aUniCode) {
        uniCode = aUniCode;
    }

    public String getUniCode() {
        return uniCode;
    }
}
