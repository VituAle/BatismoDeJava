package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto","narutinho@hotmail.com",99999999);
        System.out.println(cadastro);

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke","sasuke@hotmail.com",0000000000);
        System.out.println(cadastroRecord);

    }
}
