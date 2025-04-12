public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir por tananam!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague a locação para assistir");
        }
    }
}
