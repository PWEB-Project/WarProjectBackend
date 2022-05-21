package com.pweb.WarInNewWorld.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pweb.WarInNewWorld.dto.CityDTO;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(path="/city")
public class CityController {

    @GetMapping(path = "/getCities/{cIso}/{sIso}")
    List<CityDTO> cityViews(@PathVariable String cIso, @PathVariable String sIso) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.countrystatecity.in/v1/countries/" + cIso + "/states/" + sIso + "/cities"))
                .setHeader("X-CSCAPI-KEY", "c2pOZlBOT0t2cmFKaTVDczBaVk10VEkxSFJZM01yQ3pySlhkUEZWOA==")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        try {
            JSONArray responseJSON = new JSONArray(response.body());

            List<CityDTO> cityDTOS = new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++){
                cityDTOS.add(new ObjectMapper().readValue(responseJSON.get(i).toString(), CityDTO.class));
            }

            return cityDTOS;
        }catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
