public class Coleira {
    String cor;
    String material;
    double preco;
    String tamanho;
    int tempDeVida;

    public int TipoDeMaterial(String material) {
        if (this.material == "Tecido") {
            return 50;
        } else if (this.material == "Aço") {
            return 100;
        }
        return 0;
    }

    public Coleira(String cor, String material, String tamanho) {
        this.cor = cor;
        this.material = material;
        this.tamanho = tamanho;
        this.tempDeVida = TipoDeMaterial(material);
    }
}
