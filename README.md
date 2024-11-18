
# Conversor de Moedas

Este é um programa simples em Java que permite realizar conversões entre diferentes moedas. Ele usa a API [ExchangeRate-API](https://www.exchangerate-api.com/) para buscar as taxas de câmbio em tempo real. O usuário pode escolher entre várias opções de conversão ou inserir manualmente as moedas desejadas.

## 🚀 **Funcionalidades**

- Conversão entre Dólar (USD) e Real Brasileiro (BRL)
- Conversão entre Real Brasileiro (BRL) e Peso Argentino (ARS)
- Conversão entre Dólar (USD) e Peso Argentino (ARS)
- Opção para inserir as moedas manualmente (suportando outras moedas como EUR, GBP, JPY, etc.)
- Resultado da conversão exibido na tela

## 🛠️ **Tecnologias Utilizadas**

- **Java 17** ou superior
- Biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON.
- API HTTP do Java para requisições REST.
- Scanner para entrada de dados do usuário.

---

## ⚙️ **Como Executar**

1. Clone este repositório:

   ```bash
   git clone https://github.com/andradejohnny/Conversor_De_Moedas.git
   ```

2. Compile e execute o programa:

   ```bash
   javac Main.java
   java Main
   ```

3. O programa irá exibir um menu de opções. Escolha o número da opção desejada para realizar a conversão ou digite "sair" para encerrar o programa.

## 📂 **Estrutura do Projeto**

O projeto é composto pelas seguintes classes:

- **Main.java**: Classe principal onde o menu de opções é exibido e as conversões são realizadas.
- **ConsultaMoeda.java**: Classe responsável por interagir com a API ExchangeRate-API para buscar a taxa de câmbio e realizar a conversão.
- **Moeda.java**: Representa o objeto Moeda, contendo os dados de conversão.
- **MoedaNaoEncontradaException.java**: Exceção personalizada para lidar com erros relacionados à conversão de moedas.

## Como Funciona

1. O programa inicia com um menu de opções onde o usuário escolhe o tipo de conversão.
2. Ao escolher uma opção, o programa solicita o valor que será convertido e, com base nas moedas selecionadas, consulta a API ExchangeRate.
3. O resultado da conversão é exibido na tela.
4. O usuário pode continuar realizando novas conversões ou sair do programa.

## Exemplo de Execução

```plaintext
Bem-vindo ao conversor de moedas!
Escolha uma das opções abaixo:
1 - Dólar para Real (USD -> BRL)
2 - Real para Dólar (BRL -> USD)
3 - Real para Peso Argentino (BRL -> ARS)
4 - Peso Argentino para Real (ARS -> BRL)
5 - Dólar para Peso Argentino (USD -> ARS)
6 - Peso Argentino para Dólar (ARS -> USD)
7 - Inserir moedas manualmente
Digite 'sair' para encerrar o programa.

Digite o número da opção desejada: 1
Digite o valor que deseja converter: 100
Resultado da conversão:
De USD para BRL: 520,50
```

## 📋 **Dependências**

1. Ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Configurar uma IDE como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/).
3. Adicionar a biblioteca Gson ao projeto.
   - **Maven**: Adicione a dependência abaixo ao seu `pom.xml`:
     ```xml
     <dependency>
         <groupId>com.google.code.gson</groupId>
         <artifactId>gson</artifactId>
         <version>2.8.9</version>
     </dependency>
     ```
   - **Sem Maven**: Baixe o JAR do [site oficial](https://github.com/google/gson) e inclua no projeto.

---

## Contribuições

Contribuições são bem-vindas! Caso queira melhorar o projeto, basta criar um **fork** deste repositório, realizar as mudanças e enviar um **pull request**.

**Desenvolvido com 💻 e ☕ por [ Johnny Andrade - https://github.com/andradejohnny ].**