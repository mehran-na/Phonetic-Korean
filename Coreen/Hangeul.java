package Coreen;

public class Hangeul {
    private String ci;
    private String vi;
    private String di;

    private String unicodeCorrect = "";

    private static String ciProchainObject = "";
    private static int objectNumber = -1;


    private static int[] placeIPA = new int[2];


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
                            "\u006B", "\u006B\u0324\u002B\u0068", "\u006E", "\u0074\u031A", "", "\u027E", "\u006D", "\u0070\u031A", "", "\u0073", "\u0073\u0324", "\u014B\u002B\u0068", "\u0074\u031A\u002B\u0074\u0255\u02B0", "", "\u0074\u031A\u002B\u0074\u0255\u02B0", "\u006B\u031A\u002B\u0068", "\u0074\u031A\u002B\u0074\u0255\u02B0", "\u0070\u031A\u002B\u0068", "\u0068", "\u006B\u002B\u0073", "\u006E\u002B\u0074\u0255", "\u006C\u002B\u0068", "\u006C\u002B\u006B", "\u006C\u002B\u006D", "\u006C\u002B\u0070", "\u006C\u002B\u0073", "\u006C\u002B\u0074\u02B0", "\u006C\u002B\u0070\u02B0", "\u006C\u002B\u0068", "\u0070\u031A\u002B\u0073"
                    },

                    {
                            "\u006B\u031A", "\u006B\u0324\u002B\u0068", "\u006E\u002B\u0068", "\u0074\u031A", "", "\u027E", "\u006D\u002B\u0068", "\u0070\u031A", "",
                            "\u0074\u031A", "", "\u014B\u002B\u0068", "\u0074\u031A\u002B\u0074\u0255\u02B0", "", "\u0074\u031A\u002B\u0074\u0255\u02B0", "\u006B\u031A", "\u0074\u031A", "\u0070\u031A", "",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "\u006B\u031A\u002B\u006B\u031A", "", "\u006E\u002B\u006B", "\u0074\u031A\u002B\u006B", "", "\u006C\u002B\u006B", "\u006D\u002B\u006B", "\u0070\u002B\u006B", "",
                            "\u0074\u031A\u002B\u006B", "", "\u014B\u002B\u006B", "\u0074\u031A\u002B\u006B", "", "\u0074\u031A\u002B\u006B", "", "\u0074\u031A\u002B\u006B", "\u0070\u031A\u002B\u006B", "\u0068\u002B\u006B\u031A",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "\u014B", "", "\u006E\u002B\u006E", "", "", "\u006c\u002B\u006c", "\u006D\u002B\u006E", "\u006D\u002B\u006E", "",
                            "\u0074\u031A\u002B\u006E", "\u006E\u002B\u0074\u031A", "\u014B\u002B\u006E", "\u0074\u031A\u002B\u006E", "", "\u0074\u031A\u002B\u006E", "", "\u0074\u031A\u002B\u006E", "\u0070\u031A\u002B\u006E", "\u0068\u002B\u006E",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "\u006B\u031A\u002B\u0074", "", "\u006E\u002B\u0074", "\u0074\u031A\u002B\u0074\u031A", "", "\u006C\u002B\u0074", "\u006D\u002B\u0074", "\u0070\u031A\u002B\u0074", "",
                            "\u0074\u031A\u002B\u0074\u031A", "\u0074\u031A\u002B\u0074\u031A", "\u014B\u002B\u0074", "\u0074\u031A\u002B\u0074\u031A", "", "\u0074\u031A\u002B\u0074\u031A", "\u006B\u031A\u002B\u0074", "\u0074\u031A\u002B\u0074\u031A", "\u0070\u031A\u002B\u0074", "\u0068\u002B\u0074\u031A",
                            "\u006B\u002B\u0074\u031A", "\u006E\u0074\u0255\u002B\u0074", "\u006E\u002B\u0074\u031A", "\u006B\u002B\u0074", "\u006D\u002B\u0074", "\u0070\u002B\u0074", "\u006C\u002B\u0074\u031A", "\u006C\u002B\u0074\u02B0", "\u0070\u02B0\u002B\u0074", "\u006C\u002B\u0074\u031A", "\u0070\u031A\u002B\u0074\u031A"
                    },

                    {
                            "\u006B\u002B\u006E", "", "\u006C\u002B\u006C", "", "", "\u006C\u002B\u006C", "\u006D\u002B\u006E", "\u006D\u002B\u006E", "",
                            "", "", "\u006E", "", "", "", "", "", "", "\u027E",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "\u006B\u002B\u006D", "", "\u006E\u002B\u006D", "\u0074\u031A\u002B\u006D", "", "\u006C\u002B\u006D", "\u006D\u002B\u006D", "\u006D\u002B\u006D", "",
                            "\u0074\u031A\u002B\u006D", "", "\u014B\u002B\u006D", "\u0074\u031A\u002B\u006D", "", "\u0074\u031A\u002B\u006D", "\u006B\u031A\u002B\u0074", "\u0074\u031A\u002B\u006D", "\u0070\u031A\u002B\u006D", "\u0068\u002B\u006D",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "\u006B\u002B\u0070", "", "", "", "", "", "", "\u0070\u031A\u002B\u0070\u031A", "",
                            "\u0074\u031A\u002B\u0070", "", "", "", "", "", "", "", "", "",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "", "", "", "", "", "", "", "", "",
                            "", "\u0073\u0324\u002B\u0073", "", "", "\u0074\u031A\u002B\u0074\u0255\u02B0", "", "", "", "", "",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },

                    {
                            "", "", "", "", "", "", "", "", "",
                            "", "\u0074\u031A\u002B\u0074\u0255\u02B0", "", "", "", "", "", "", "", "",
                            "", "", "", "", "", "", "", "", "", "", ""
                    },


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

    //asli
    /*public void trouverIPA(int di, int ci) {
        String jamos_ci = ConsonneInitiale.trouverJamos(ci);
        String jamos_di = ConsonneFinale.trouverJamos(di);

        for(int i = 0; i < jamosFinaleUnicode.length; i++) {
            if (jamosFinale[i].equals(jamos_di)) {
                placeIPA[1] = i;
            }
        }

        for(int i = 0; i < jamosInitialeUnicode.length; i++) {
            if (jamosInitiale[i].equals(jamos_ci)) {
                placeIPA[0] = i;
            }
        }
    }*/

    public static void trouverIPA(int di, int ci) {
        String jamos_ci = ConsonneInitiale.trouverJamos(ci);
        String jamos_di = ConsonneFinale.trouverJamos(di);

        for(int i = 0; i < jamosFinaleUnicode.length; i++) {
            if (jamosFinale[i].equals(jamos_di)) {
                placeIPA[1] = i;
            }
        }

        for(int i = 0; i < jamosInitialeUnicode.length; i++) {
            if (jamosInitiale[i].equals(jamos_ci)) {
                placeIPA[0] = i;
            }
        }
    }

    public void trouverUnicodeCorrect() {
        this.unicodeCorrect = tableModification[placeIPA[0]][placeIPA[1]];
    }

    public void assigneUnicodeCorrect() {
        if (unicodeCorrect.length() != 0) {
            if (unicodeCorrect.contains("\u002b")) {
                String[] arr = unicodeCorrect.split("\\u002b");
                this.di = arr[0];
                ciProchainObject = arr[1];
            }else{
                this.di = unicodeCorrect;
                ciProchainObject = "";
            }
        }
    }

    public static void setObjectNumber() {
        Hangeul.objectNumber++;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public void setDi(String di) {
        this.di = di;
    }

    public static String getCiProchainObject() {
        return ciProchainObject;
    }

    public static void setCiProchainObject(String ciProchainObject) {
        Hangeul.ciProchainObject = ciProchainObject;
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
