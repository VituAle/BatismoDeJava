package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {

    TipoDeConta TipoDeConta;

    public ContaPoupanca(String nome, double saldo, TipoDeConta tipoDeConta) {
        super(nome, saldo);
        this.TipoDeConta = TipoDeConta;
    }

    public ContaPoupanca() {

    }


    @Override
    public void Depositar(double valor) {
        saldo += valor;
        System.out.println("O depósito de R$" + valor + " foi realizado com sucesso!");
        System.out.println("Saldo atualizado: R$" + saldo);


    }


    @Override
    public void Depositar(double valor, double transferencia) {
        saldo -= transferencia;
        System.out.println("Você transferiu o valor de: R$" + transferencia + ", e agora seu saldo atualizado é: R$" + saldo);
    }

    @Override
    public void ConsultaSaldo() {
        System.out.println("Olá, " + nome + " Bem vindo a Conta Poupança do ICC, Seu saldo é: R$" + saldo);
    }
}
