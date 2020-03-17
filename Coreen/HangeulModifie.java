package Coreen;

public class HangeulModifie {
    private String ci;
    private String di;

    private String unicodeCorrect;


    private int[] placeIPA = new int[2];


    private static String[] jamosFinale =
            {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ",
                    "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ", "ㄳ",
                    "ㄵ", "ㄶ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅄ"};

    private static String[] jamosInitiale =
            {"ㅇ", "ㅎ", "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅈ"};

    private static String[][] tableModification =
            {
                    {},
                    {},
                    {},

            };

    public HangeulModifie(String ci, String di) {
        this.ci = ci;
        this.di = di;
    }

    public void trouverIPA(){
        for (int i = 0; i < jamosInitiale.length; i++){
            if(jamosInitiale[i].equals(ci)){
                placeIPA[0] = i;
            }
        }

        for (int i = 0; i < jamosFinale.length; i++){
            if(jamosFinale[i].equals(di)){
                placeIPA[1] = i;
            }
        }
    }

    //method for find unicodeCoreect
    //method for split unicodeCorrect and assign ci va di


    @Override
    public String toString() {
        return getClass().getName() +
                ", di='" + di + '\'' +
                "ci='" + ci + '\'' +
                '}';
    }
}
