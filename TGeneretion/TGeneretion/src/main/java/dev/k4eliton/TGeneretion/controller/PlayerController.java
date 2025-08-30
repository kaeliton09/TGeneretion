package dev.k4eliton.TGeneretion.controller;


import dev.k4eliton.TGeneretion.model.PlayerModel;
import dev.k4eliton.TGeneretion.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController//controle Rest
@RequestMapping("/players")//url base para endpoints
public class PlayerController {

    //injecao de dependecia
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    //POST
    @PostMapping
    public PlayerModel addPlayer(@RequestBody PlayerModel player){
        return playerService.save(player);
    }

    //GET
    @GetMapping("/all")
    public List<PlayerModel> getAll(){
        return playerService.getAll();
    }

    @GetMapping("/team")
    public List<PlayerModel> getTeam(){
        return playerService.getTeam();
    }
}
