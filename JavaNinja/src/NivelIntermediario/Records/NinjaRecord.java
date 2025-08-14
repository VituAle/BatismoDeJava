package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos os atributos são FINAL por padrão.
    // Records não tem setter

    //Records é bom para classe constante, assim como enums.
}
