import java.util.Scanner;

public class Aviao extends Transporte {
    private String dataRevisao;

    public Aviao() {
        super();
    }

    public Aviao(String prefixo, int capacidadeTanque, int numeroPassageiros, double preco, String dataRevisao) {
        super(prefixo, capacidadeTanque, numeroPassageiros, preco);
        this.dataRevisao = dataRevisao;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Data de Revisão: " + dataRevisao);
    }
}
