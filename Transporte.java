import java.util.Scanner;

public class Transporte {
    protected String prefixo;
    protected int capacidadeTanque;
    protected int numeroPassageiros;
    protected double preco;

    public Transporte() {
        // Construtor vazio
    }

    public Transporte(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco) {
        this.prefixo = prefixo;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("Prefixo: " + prefixo);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque);
        System.out.println("Número de Passageiros: " + numeroPassageiros);
        System.out.println("Preço: " + preco);
    }

    public void entrada(Scanner scanner) {
        System.out.print("Prefixo: ");
        prefixo = scanner.next();
        System.out.print("Capacidade do Tanque: ");
        capacidadeTanque = scanner.nextInt();
        System.out.print("Número de Passageiros: ");
        numeroPassageiros = scanner.nextInt();
        System.out.print("Preço: ");
        preco = scanner.nextDouble();
    }

    public void reajustarPreco(double percentual) {
        preco += preco * percentual / 100;
    }

    // Getters e Setters
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
