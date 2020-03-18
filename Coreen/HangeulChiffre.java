package Coreen;

public class HangeulChiffre {
    private int ci;
    private int vi;
    private int di;

    public HangeulChiffre(int ci, int vi, int di) {
        this.ci = ci;
        this.vi = vi;
        this.di = di;
    }

    public int getCi() {
        return ci;
    }

    public int getVi() {
        return vi;
    }

    public int getDi() {
        return di;
    }



    @Override
    public String toString() {
        return  getClass().getName()+
                "{" +
                "ci=" + ci +
                ", vi=" + vi +
                ", di=" + di +
                '}';
    }
}
