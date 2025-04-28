import java.util.Random;
import java.util.Scanner;

/* Se der adiciona um numero maior ou menor depois :) */
public class Desafio {
    public static void main(String[] args) {
        Scanner desafio = new Scanner(System.in);
        int tentativas = 1;

        int numero = new Random().nextInt(100);
        System.out.println(numero);
        System.out.println("Adivinhe o número secreto, entre 0 e 100. Você tem 5 tentativas.");
        int chute = desafio.nextInt();

        while (chute != numero && tentativas < 5) {
            System.out.println("Tente adivinhar novamente: ");
            chute = desafio.nextInt();
            tentativas++;

            if (chute == numero) {
                System.out.printf("Você acertou o número secreto %d com %d tentativas", numero, tentativas);
                break;
            }
            else {
                System.out.println("Você perdeu");
            }

        }

    }
}
