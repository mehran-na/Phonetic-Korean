package Coreen;

public class IPA {
    String ipaInitiale;
    String ipaVoyelle;
    String ipaFinale;

    public IPA(String ipaInitiale, String ipaVoyelle, String ipaFinale) {
        this.ipaInitiale = ipaInitiale;
        this.ipaVoyelle = ipaVoyelle;
        this.ipaFinale = ipaFinale;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "ipaInitiale='" + ipaInitiale + '\'' +
                ", ipaVoyelle='" + ipaVoyelle + '\'' +
                ", ipaFinale='" + ipaFinale + '\'' +
                '}';
    }
}
