package NivelIntermediario.Enums;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Moderado",3),
    B("Confortavel",3),
    A("Dificil",4),
    S("Altissimo", 12);



    private String Descrição;
    private int Dificuldade;

    RankDeMissoes(String Descrição, int Dificuldade) {
        this.Descrição = Descrição;
        this.Dificuldade = Dificuldade;

    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }

    public int getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        Dificuldade = dificuldade;
    }
}
