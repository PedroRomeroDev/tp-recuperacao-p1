public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "ford";
        carro1.modelo = "ka";
        carro1.ano_fabricacao = 2022;
        carro1.relatorio();
    }
}

class Carro {
    public String marca;
    public String modelo;
    public int ano_fabricacao;

    public void relatorio() {
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno Fabricacao: " + this.ano_fabricacao);
    }
}