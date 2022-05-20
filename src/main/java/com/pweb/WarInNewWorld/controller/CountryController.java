package com.pweb.WarInNewWorld.controller;

import com.pweb.WarInNewWorld.projection.CountryView;
import com.pweb.WarInNewWorld.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping(path="/country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @PostMapping(path = "/getCountries")
    List<CountryView> countryViews() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.countrystatecity.in/v1/countries"))
//                .setHeader("X-CSCAPI-KEY", "API_KEY")
//                .GET()
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());
//        JSONObject responseJSON = new JSONObject(response.body());
//        System.out.println(responseJSON.get("resp"));
//        PostsResponse posts = new ObjectMapper().readValue(responseJSON.get("resp").toString(), PostsResponse.class);
//
//        System.out.println(posts);
        return null;
    }
}
