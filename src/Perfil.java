public class Perfil {
    public static void main(String[] args) {
        String nome = "Giovana";
        int n1 = 10;
        int n2 = 5;
        int soma = n1 + n2;
        int subtracao = 10 -5;
        System.out.println(String.format("Olá %s", nome));
        /*System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(10+10);*/
        int valor =  10;
        valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor
        double celsius = 35;
        double conversao = (celsius * 1.8) + 32;
        System.out.println(conversao);
        int fahrenheit = (int)(conversao);
        System.out.printf("%d°F", fahrenheit);

        double media1 = 8.9;
        double media2 = 6.2;
        double mediaFinal = (media1 + media2) /2;
        System.out.println(String.format("A media final é de %.1f", mediaFinal));

        double conver1 = 4.44;
        int conver = (int) (conver1);
        System.out.println(conver);

        /*char inicial = 'G';
        String nomeComInicial = "Giovana";
        System.out.print(String.format("O nome %s começa com a letra %s", nomeComInicial, inicial));

        double precoProduto = 3.50;
        int quantidade = 10;
        double total = precoProduto * quantidade;
        System.out.printf("O valor da venda de todos os produtos sera: %.2f", total);

        double valorEmDolares = 1423.32;
        double valorReal = 4.94;
        double conversaoDolares = valorEmDolares * valorReal;
        System.out.printf("O valor do produto em reais é de %.2f", conversaoDolares);*/

        int precoOriginal = 1400;
        int porcentagemDesconto = 10;
        int desconto = (precoOriginal * porcentagemDesconto) /100;
        int precoFinal = precoOriginal - desconto;
        System.out.printf("O preço original seria R$%d, porém com %d de desconto o produto sairá por R$%d", precoOriginal, porcentagemDesconto, precoFinal);
    }
}