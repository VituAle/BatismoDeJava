package NivelIntermediario.Desafio5;

public abstract class ContaBancaria  implements Conta {

    String nome;
    double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    @Override
    public void ConsultaSaldo() {
        System.out.println(" Olá, " + nome + "! Bem vindo ao banco do ICC. Seu saldo é: R$" + saldo );
    }

    @Override
    public void Depositar(double valor) {
        System.out.println("Olá, " + nome + "Qual valor deseja depósitar? ");
    }
}
