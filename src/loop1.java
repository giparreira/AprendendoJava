import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner loop = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota para o filme ou -1 para encerrar");
            nota = loop.nextInt();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avalição: " + mediaAvaliacao/totalDeNotas);
    }
}
