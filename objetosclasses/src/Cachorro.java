public class Cachorro {
    // Atributos do classe cachorro
    String raca;
    String nome;
    int idade;
    String cor;
    Boolean rabo;
    private int estamina;
    Coleira coleira;

    // Método construtor
    public Cachorro(String raca, String nome, int idade, String cor) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.rabo = true; // O cachorro nasce com rabo :)
        this.estamina = 100;
    }

    // Métodos da classe cachorro

    void latir() {
        if (this.estamina >= 5) {
            System.out.println("Au au au au au!");
            this.estamina -= 5;
        } else {
            System.out.println("O cachorro está cansado, não pode latir");
        }
    }

    void correr() {
        if (this.estamina >= 50) {
            System.out.println("Correndo ...");
            this.estamina -= 50;
        } else {
            System.out.println("O cachorro está cansado!");
        }
    }

    void comer() {
        System.out.println("Comendo...");
        this.estamina += 5;
    }

    void dormir() {
        System.out.println("Dormindo zzzz...");
        this.estamina += 50;
    }

    public void isCansado() {
        if (this.estamina < 50) {
            System.out.println("Sim, o cachorro está cansado!");
        } else {
            System.out.println("Não, o cachorro não está cansado!");
        }
    }

    public void infoCachorro() {
        System.out.println("Raca: " + this.raca + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nCor: " + this.cor);
    }

    // Métodos getters e setters

    public void setRabo(Boolean rabo) {
        this.rabo = rabo;
    }


    public Boolean getRabo() {
        return this.rabo;
    }
}
