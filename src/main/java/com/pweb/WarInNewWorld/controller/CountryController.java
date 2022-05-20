package com.pweb.WarInNewWorld.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pweb.WarInNewWorld.dto.CountryDTO;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/country")
public class CountryController {

    @GetMapping(path = "/getCountries")
    List<CountryDTO> countryViews() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.countrystatecity.in/v1/countries"))
                .setHeader("X-CSCAPI-KEY", "c2pOZlBOT0t2cmFKaTVDczBaVk10VEkxSFJZM01yQ3pySlhkUEZWOA==")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        try {
            JSONArray responseJSON = new JSONArray(response.body());

            List<CountryDTO> countryDTOS = new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++){
                countryDTOS.add(new ObjectMapper().readValue(responseJSON.get(i).toString(), CountryDTO.class));
            }

            return countryDTOS;
        }catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
