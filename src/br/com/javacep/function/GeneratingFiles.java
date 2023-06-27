package br.com.javacep.function;

import br.com.javacep.model.Address;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneratingFiles {

    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter writer = new FileWriter(address.cep() + ".json");
        writer.write(gson.toJson(address));
        writer.close();
    }
}
