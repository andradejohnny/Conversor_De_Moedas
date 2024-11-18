import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda(); // Instancia a classe que será usada para buscar a moeda.
        String escolha = "";

        System.out.println("Bem-vindo ao conversor de moedas!");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Dólar para Real (USD -> BRL)");
        System.out.println("2 - Real para Dólar (BRL -> USD)");
        System.out.println("3 - Real para Peso Argentino (BRL -> ARS)");
        System.out.println("4 - Peso Argentino para Real (ARS -> BRL)");
        System.out.println("5 - Dolar para Peso Argentino (USD -> ARS)");
        System.out.println("6 - Peso Argentino para Dolar (ARS -> USD)");
        System.out.println("7 - Inserir moedas manualmente");
        System.out.println("Digite 'sair' para encerrar o programa.");

        while (!escolha.equalsIgnoreCase("sair")) {
            System.out.print("\nDigite o número da opção desejada: ");
            escolha = leitura.nextLine().toLowerCase();

            if (escolha.equals("sair")) {
                System.out.println("Encerrando o programa. Obrigado por usar o conversor de moedas!");
                break;
            }

            String moedaDeConversao = "";
            String moedaLocal = "";

            switch (escolha) {
                case "1":
                    moedaLocal = "USD";
                    moedaDeConversao = "BRL";
                    break;
                case "2":
                    moedaLocal = "BRL";
                    moedaDeConversao = "USD";
                    break;
                case "3":
                    moedaLocal = "BRL";
                    moedaDeConversao = "ARS";
                    break;
                case "4":
                    moedaLocal = "ARS";
                    moedaDeConversao = "BRL";
                    break;
                case "5":
                    moedaLocal = "USD";
                    moedaDeConversao = "ARS";
                    break;
                case "6":
                    moedaLocal = "ARS";
                    moedaDeConversao = "USD";
                    break;
                case "7":
                    System.out.println("\nLista de Moedas Comuns:");
                    System.out.println("USD - Dólar Americano");
                    System.out.println("BRL - Real Brasileiro");
                    System.out.println("ARS - Peso Argentino");
                    System.out.println("EUR - Euro");
                    System.out.println("GBP - Libra Esterlina");
                    System.out.println("JPY - Iene Japonês");

                    System.out.print("\nDigite a sigla da moeda de origem (ex: BRL): ");
                    moedaLocal = leitura.nextLine().toUpperCase();

                    System.out.print("Digite a sigla da moeda de destino (ex: USD): ");
                    moedaDeConversao = leitura.nextLine().toUpperCase();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    continue; // Retorna ao início do loop
            }

            System.out.print("Digite o valor que deseja converter: ");
            String valor = leitura.nextLine();

            try {
                // Chamada à API para realizar a conversão
                Moeda resultado = consultaMoeda.buscaMoeda(moedaDeConversao, moedaLocal, valor);

                System.out.println("\nResultado da conversão:");
                System.out.println("De " + moedaLocal + " para " + moedaDeConversao + ": " + resultado.conversion_result());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        leitura.close();
    }
}
