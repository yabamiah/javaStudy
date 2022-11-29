import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a1;
        System.out.println("Digite o nome do animal: ");
        a1 = sc.next();
        sc.close();

        System.out.println("Para criar o seu cachorro, digite os seguintes dados:");

        Cachorro dog1 = new Cachorro ("Pitbull", a1, 2, "Preto");
        Cachorro dog2 = new Cachorro("Poodle", "Bolinha", 1, "Branco");
        Cachorro dog3 = new Cachorro("Pug", "Pug", 3, "Marrom");
        Cachorro dog4 = new Cachorro("Pastor Alemão", "Tony", 4, "Preto");
        Cachorro dog5 = new Cachorro("Pintcher", "Orelhão", 5, "Marrom");

        Cachorro[] cachorros = {dog1, dog2, dog3, dog4, dog5};

        for (Cachorro i : cachorros) {
            System.out.println("Nome: " + i.nome + "\n");
            // Mostrar as infos de todos os cachorros
            // i.infoCachorro();
        }

        dog1.infoCachorro();
        //dog2.infoCachorro();

        dog1.latir();
        dog1.correr();
        dog2.correr();

        dog1.setRabo(true);
        dog1.getRabo();

        System.out.println("O dog1 tem rabo? " + dog1.rabo);
        dog1.isCansado();
        dog1.dormir();
        dog1.isCansado();
    }
}
