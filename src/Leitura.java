import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento:");
        int anoDelancamneto = leitura.nextInt();

        System.out.println("De 0 a 10, qual a nota você da para esse filme?");
        double nota = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelancamneto);
        System.out.println(nota);
    }
}
