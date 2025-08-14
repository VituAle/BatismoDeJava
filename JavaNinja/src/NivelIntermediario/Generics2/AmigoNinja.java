package NivelIntermediario.Generics2;

public class AmigoNinja {
    private String nomeDoAnimal;

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public AmigoNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Esse é meu amigo Ninja: " + nomeDoAnimal;
    }
}
