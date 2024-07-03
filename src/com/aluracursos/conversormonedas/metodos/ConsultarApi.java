package com.aluracursos.conversormonedas.metodos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultarApi {

        public double[] obtenerTasas() {
            //creacion de URL
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/061d20bf6c37e18058d6186c/latest/USD");
            // http request //
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            // http response //
            HttpResponse<String> response;
            {
                try {
                    response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Obtener la respuesta de la API
            String jsonResponse = response.body();

            // Procesar la respuesta JSON
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(jsonResponse).getAsJsonObject();

            // Acceder a los valores de las tasas de cambio
            double arsRate = jsonObject.getAsJsonObject("conversion_rates").get("ARS").getAsDouble();
            double brlRate = jsonObject.getAsJsonObject("conversion_rates").get("BRL").getAsDouble();
            double copRate = jsonObject.getAsJsonObject("conversion_rates").get("COP").getAsDouble();

            // Retornar las tasas de cambio en un arreglo
            return new double[] { arsRate, brlRate, copRate };
        }
    }
