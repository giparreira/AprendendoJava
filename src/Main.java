public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        //System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double nota = 8.1;

        double media = (9.8 + 6.3 + 7.5) / 3;
        //System.out.println(media);
        String sinopse = """
                Filme de aventura com galã dos anos 80
                Sensacional!
                Ano de lançamento:
                %d
                Nota:
                %.1f 
                """.formatted(ano, media);
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}