import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        String nomeCliente = "Giovana Parreira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        String dadosCliente = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """ .formatted(nomeCliente, tipoConta, saldo);
        System.out.println(dadosCliente);


        while (opcao != 4) {
            String menuDeOpcoes = """
                    
                    ** Opções de ação **
                    1 - Verificar saldo
                    2 - Enviar um valor
                    3 - Receber um valor
                    4 - Encerrar
                    """;
            System.out.println(menuDeOpcoes);
            System.out.println("Selecione o que deseja fazer:");
            opcao = conta.nextInt();

            if (opcao == 1) {
                System.out.printf("O saldo atual da conta é de: R$%.2f", saldo);
                continue;
            }
            if (opcao == 2) {
                System.out.println("Que valor você gostaria de enviar?");
                double pix = conta.nextDouble();
                if (saldo < pix) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= pix;
                }
                continue;
            }
            if (opcao == 3) {
                System.out.println("Que valor você recebeu?");
                double pixRecebido = conta.nextDouble();
                saldo += pixRecebido;
                continue;
            }
        }
    }
}
