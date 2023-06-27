package br.com.javacep.main;

import br.com.javacep.treatment.TreatCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class SystemMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String cep = "";

        System.out.println("Bem vindo ao Javacep");
        System.out.println("Digite seu CEP:");
        cep = scanner.nextLine();

        if (!TreatCep.validateCep(cep)){
            System.out.println("CEP inválido! É necessário ter apenas 8 dígitos.");
            return;
        }

        String address = "https://viacep.com.br/ws/"+ cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
    }
}
