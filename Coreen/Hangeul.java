package Coreen;

public class Hangeul {
    String ci;
    String vi;
    String di;

    private String unicodeCorrect;


    private int[] placeIPA = new int[2];


    private static String[] jamosFinale =
            {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ",
                    "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ", "ㄳ",
                    "ㄵ", "ㄶ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅄ"};

    private static String[] jamosFinaleUnicode =
            {
                    "\u3131", "\u3132", "\u3134", "\u3137", "\u3138",
                    "\u3139", "\u3141", "\u3142", "\u3143", "\u3145",
                    "\u3146", "\u3147", "\u3148", "\u3149", "\u314a",
                    "\u314b", "\u314c", "\u314d", "\u314e", "\u3133",
                    "\u3135", "\u3136", "\u313a", "\u313b", "\u313c",
                    "\u313d", "\u313e", "\u313f", "\u3140", "\u3144"
            };


    private static String[] jamosInitiale =
            {"ㅇ", "ㅎ", "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅈ"};

    private static String[] jamosInitialeUnicode =
            {
                    "\u3147", "\u314e", "\u3131", "\u3134", "\u3137",
                    "\u3139", "\u3141", "\u3142", "\u3145", "\u3148"
            };


    public static String[][] tableModification =
            {
                    {
                            "\u006B", "\u006B\u0324\u002B\u0068", "\u006E", "\u0074\u031A", "", "\u027E", "\u006D", "\u0070\u031A", "", "\u0073", "\u0073\u0324", "\u014B\u002B\u0068", "\u0074\u031A\u002B\u0074\u0255\u02B0", "", "\u0074\u031A\u002B\u0074\u0255\u02B0", "\u006B\u031A\u002B\u0068", "\u0074\u031A\u002B\u0074\u0255\u02B0", "\u0070\u031A\u002B\u0068", "\u0068","\u006B\u002B\u0073","\u006E\u002B\u0074\u0255","\u006C\u002B\u0068","\u006C\u002B\u006B","\u006C\u002B\u006D","\u006C\u002B\u0070","\u006C\u002B\u0073","\u006C\u002B\u0074\u02B0","\u006C\u002B\u0070\u02B0","\u006C\u002B\u0068","\u0070\u031A\u002B\u0073"
                    },

                    {},
                    {},

            };

    //Constructor
    public Hangeul(String ci, String vi, String di) {
        this.ci = ci;
        this.vi = vi;
        this.di = di;
    }

    public String getCi() {
        return ci;
    }

    public String getVi() {
        return vi;
    }

    public String getDi() {
        return di;
    }

    public void trouverIPA(String di, String ci) {
        for(int i = 0; i < jamosFinaleUnicode.length; i++) {
            if (jamosFinale[i].equals(di)) {
                placeIPA[1] = i;
            }
        }

        for(int i = 0; i < jamosInitialeUnicode.length; i++) {
            if (jamosInitiale[i].equals(ci)) {
                placeIPA[0] = i;
            }
        }
    }

    public void trouverUnicodeCorrect() {
        this.unicodeCorrect = tableModification[placeIPA[0]][placeIPA[1]];
    }

    public void assigneUnicodeCorrectDI() {
        if (unicodeCorrect.length() != 0 && unicodeCorrect.contains("\u002b")) {
            String[] arr = unicodeCorrect.split("\\u002b");
            this.di = arr[0];
        }else if (unicodeCorrect.length() != 0 && !unicodeCorrect.contains("\u002b")) {
            this.di = unicodeCorrect;
        }
    }

    public void assigneUnicodeCorrectCI() {
        if (unicodeCorrect.length() != 0 && unicodeCorrect.contains("\u002b")) {
            String[] arr = unicodeCorrect.split("\\u002b");
            this.ci = arr[1];
        }
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "jamoInitiale='" + ci + '\'' +
                ", jamoVoyelle='" + vi + '\'' +
                ", jamoFinale='" + di + '\'' +
                '}';
    }
}
