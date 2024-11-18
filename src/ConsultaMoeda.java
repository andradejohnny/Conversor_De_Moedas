import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public Moeda buscaMoeda(String moedaDeConversao, String moedaLocal, String valor) throws MoedaNaoEncontradaException {
        // Cria uma URI para acessar a API ExchangeRate com a sigla fornecida.
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/4e12e16a750bda0b44ad45ca/pair/" + moedaLocal + "/" + moedaDeConversao + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // Verifica se o status da resposta é OK (200).
            if (response.statusCode() != 200) {
                throw new MoedaNaoEncontradaException("Falha na comunicação com a API ou moeda inválida.");
            }

            // Converte o JSON da resposta em um objeto do tipo Moeda.
            Gson gson = new Gson();
            Moeda moeda = gson.fromJson(response.body(), Moeda.class);

            // Verifica se o campo "conversion_result" está presente e válido.
            if (moeda.conversion_result() == 0) {
                throw new MoedaNaoEncontradaException("Moeda de origem ou destino inválida.");
            }

            return moeda;
        } catch (Exception e) {
            throw new MoedaNaoEncontradaException("Erro ao realizar a conversão: " + e.getMessage());
        }
    }
}