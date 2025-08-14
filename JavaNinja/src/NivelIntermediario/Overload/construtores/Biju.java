package NivelIntermediario.Overload.construtores;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);


    private String NomeBiju;
    private String Jinchuriki;
    private int NumeroDeCaldas;

    Biju() {
    }

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        NomeBiju = nomeBiju;
        Jinchuriki = jinchuriki;
        NumeroDeCaldas = numeroDeCaldas;
    }

    public String getNomeBiju() {
        return NomeBiju;
    }

    public void setNomeBiju(String nomeBiju) {
        NomeBiju = nomeBiju;
    }

    public String getJinchuriki() {
        return Jinchuriki;
    }

    public void setJinchuriki(String jinchuriki) {
        Jinchuriki = jinchuriki;
    }

    public int getNumeroDeCaldas() {
        return NumeroDeCaldas;
    }

    public void setNumeroDeCaldas(int numeroDeCaldas) {
        NumeroDeCaldas = numeroDeCaldas;
    }
}
