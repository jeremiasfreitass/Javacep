package br.com.javacep.treatment;

import java.util.regex.Pattern;

public class TreatCep {
    public static String formatCep(String cep){
        return cep = cep.replaceAll("[^0-9]", "");
    }
    public static boolean validateCep(String cep){
        String formatCep = formatCep(cep);
        return Pattern.matches("\\d{8}", formatCep);
    }
}
