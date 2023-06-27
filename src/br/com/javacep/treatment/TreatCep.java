package br.com.javacep.treatment;

import java.util.Scanner;

public class TreatCep {
    public static String formatCep(String cep){
        Scanner scanner = new Scanner(System.in);

        cep = cep.replaceAll("[^0-9]", "");

        while(cep.length() > 8){
            System.out.println("CEP inválido! Deve conter apenas 8 dígitos!");
            System.out.println("Digite seu CEP novamente:");
            cep = scanner.nextLine();
            cep = cep.replaceAll("[^0-9]", "");
        }
        if (cep.length() == 8){
            String newCep = cep;
            return newCep;
        }
        return "";
    }
}
