package NivelIntermediario.Desafio5;

public class BancoDaAldeia {
    public static void main(String[] args) {

        System.out.println("---------- Conta Corrente ----------");
        ContaCorrente ContaCorrente = new ContaCorrente("Yidu", 2000, TipoDeConta.CORRENTE);
        ContaCorrente.ConsultaSaldo();
        ContaCorrente.Depositar(5000);
        ContaCorrente.Depositar(400,50);

        System.out.println("---------- Conta Poupança ----------");
        ContaPoupanca ContaPoupanca = new ContaPoupanca("Cabeça", 3000, TipoDeConta.POUPANCA);
        ContaPoupanca.ConsultaSaldo();
        ContaPoupanca.Depositar(100);
        ContaPoupanca.Depositar(500,200);

    }
}
