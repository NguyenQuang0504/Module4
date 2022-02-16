package model;

public class Convert {
    private String eng;
    private String vie;

    public Convert(String eng, String vie) {
        this.eng = eng;
        this.vie = vie;
    }

    public Convert() {
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }
}
