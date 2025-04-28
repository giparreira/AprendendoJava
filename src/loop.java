import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;



        for (int i = 0; i < 3; i++) {
            System.out.println("De 0 a 10, qual a nota você da para esse filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += + nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao/3);


        /*System.out.println("Digite seu filme favotiro:");
        String filme = leitura.nextLine();

        System.out.println("Digite a data de lançamento do filme:");
        int dataDeLancamento = leitura.nextInt();
        double conver = dataDeLancamento;

        System.out.println("De uma nota de 0 a 10 para o filme");
        int nota = leitura.nextInt();
        double conver1 = nota;

        System.out.printf("Seu filme favorito é %s, ele foi lançado em %d, e você deu nota %d", filme, dataDeLancamento, nota);*/

    }
}
