import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");
        int tamanho = scanner.nextInt();

        //TODO: Verificar se o tamanho está entre 6 e 20

        Jogo jogo = new Jogo(tamanho);

        while (!jogo.estahCheio()){
            System.out.println("Informe um número:");
            int numero = scanner.nextInt();

            if(jogo.adicionarNumero(numero)) System.out.println("Adicionado");
            else System.out.println("Escolha outro número");
        }

        //TODO: Apresentar o jogo ordenado -- usar classe arrays
        System.out.println("Números: "+ Arrays.toString(jogo.getNumeros()));

    }
}