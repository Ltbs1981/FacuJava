import java.util.Scanner;

public class Navio extends Transporte {
    private int numeroTripulantes;
    private String dataLancamento;

    public Navio() {
        super();
    }

    public Navio(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, int numeroTripulantes, String dataLancamento) {
        super(prefixo, capacidadeTanque, numeroPassageiros, preco);
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double passageirosPorTripulantes() {
        return (double) numeroPassageiros / numeroTripulantes;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Tripulantes: " + numeroTripulantes);
        System.out.println("Data de Lançamento: " + dataLancamento);
    }
}
