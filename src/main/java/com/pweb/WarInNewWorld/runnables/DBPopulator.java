package com.pweb.WarInNewWorld.runnables;

import com.pweb.WarInNewWorld.model.Bunker;
import com.pweb.WarInNewWorld.service.BunkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBPopulator implements CommandLineRunner {
    @Autowired
    BunkerService bunkerService;

    @Override
    public void run(String... args) throws Exception {
        Bunker bunker = new Bunker();
        bunkerService.addBunker(bunker);
    }
}
