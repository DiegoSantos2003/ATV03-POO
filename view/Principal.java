package view;

import model.Animal;
import model.Peixe;
import model.Mamifero;

public class Principal {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.alteraNome("Camelo");
        camelo.alteraComprimento(150);
        camelo.alteraCor("Amarelo");
        camelo.alteraVelocidade(2.0f);
        camelo.dados();
        System.out.println("_______________________________");

        Peixe tubarao = new Peixe();
        tubarao.alteraNome("Tubarão");
        tubarao.alteraComprimento(300);
        tubarao.alteraVelocidade(1.5f);
        tubarao.alteraCaracteristica("Barbatanas e cauda");
        tubarao.dados();
        System.out.println("__________________________");

        Mamifero urso = new Mamifero();
        urso.alteraNome("Urso-do-canadá");
        urso.alteraComprimento(180);
        urso.alteraCor("Vermelho");
        urso.alteraVelocidade(0.5f);
        urso.alteraAlimento("Mel");
        urso.dados();
        System.out.println("_________________________________________________");
    }
}
