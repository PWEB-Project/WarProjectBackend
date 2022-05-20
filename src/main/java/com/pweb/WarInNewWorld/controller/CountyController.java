package com.pweb.WarInNewWorld.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pweb.WarInNewWorld.dto.CountyDTO;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/county")
public class CountyController {

    @GetMapping(path = "/getCounties/{iso}")
    List<CountyDTO> countyViews(@PathVariable String iso) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.countrystatecity.in/v1/countries/" + iso + "/states"))
                .setHeader("X-CSCAPI-KEY", "c2pOZlBOT0t2cmFKaTVDczBaVk10VEkxSFJZM01yQ3pySlhkUEZWOA==")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        try {
            JSONArray responseJSON = new JSONArray(response.body());

            List<CountyDTO> countyDTOS = new ArrayList<>();
            for (int i = 0; i < responseJSON.length(); i++){
                countyDTOS.add(new ObjectMapper().readValue(responseJSON.get(i).toString(), CountyDTO.class));
            }

            return countyDTOS;
        }catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
