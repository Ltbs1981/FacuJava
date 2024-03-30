import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando vetor de transportes
        Transporte[] transportes = new Transporte[20]; // 10 aviões e 10 navios

        // Preenchendo vetor com objetos Aviao
        for (int i = 0; i < 10; i++) {
            Aviao aviao = new Aviao();
            aviao.entrada(scanner);
            transportes[i] = aviao;
        }

        // Preenchendo vetor com objetos Navio
        for (int i = 10; i < 20; i++) {
            Navio navio = new Navio();
            navio.entrada(scanner);
            transportes[i] = navio;
        }

        // Imprimindo os dados dos transportes
        for (Transporte transporte : transportes) {
            transporte.imprimir();
            System.out.println();
        }

        scanner.close();
    }
}
