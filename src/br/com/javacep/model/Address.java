package br.com.javacep.model;

public record Address(String cep, String logradouro,
                      String bairro, String localidade,
                      String uf) {
}
