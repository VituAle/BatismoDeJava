package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki ";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da Folha ";
        Naruto.ModoSabioAtivado();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Vila da Folha";
        Sasuke.SharinganAtivado();


        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno ";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeira da Folha ";
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga ";
        Hinata.idade = 15;
        Hinata.aldeia = "Aldeira da Folha ";
        Hinata.Biakugan();




    }
}