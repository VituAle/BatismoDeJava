package NivelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements Sharingan, Anbu, HokageAtivo{

    public void BoasVindas(){
        System.out.println(nome + ", Eu sou um Hatake");
    }

    public void SharinganAtivado(){
        System.out.println( nome + " : Ativou o Sharingan");

    }

    @Override
    public void NinjaDeElite() {
        System.out.println(nome + ", Eu sou um ninja de Elite da ANBU");
    }

    @Override
    public void SouUmHokage() {
        System.out.println(nome + ", sou o sexto Hokage.");
    }
}
