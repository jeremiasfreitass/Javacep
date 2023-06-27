package br.com.javacep.main;

import br.com.javacep.function.GeneratingFiles;
import br.com.javacep.function.SearchCep;
import br.com.javacep.model.Address;
import br.com.javacep.treatment.TreatCep;
import java.io.IOException;
import java.util.Scanner;

public class SystemMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String cep = "";
        SearchCep searchCep = new SearchCep();

        System.out.println("Bem vindo ao Javacep");
        System.out.println("Digite seu CEP:");
        cep = scanner.nextLine();

        String newCep = TreatCep.formatCep(cep);
        Address address = searchCep.searchAddress(newCep);
        GeneratingFiles generatingFiles = new GeneratingFiles();
        generatingFiles.saveJson(address);

    }
}
