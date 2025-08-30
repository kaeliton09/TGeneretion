package dev.k4eliton.TGeneretion.service;

import dev.k4eliton.TGeneretion.model.PlayerModel;
import dev.k4eliton.TGeneretion.respository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PlayerService {
    //injecao de dependencia
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    //Listar todos players
    public List<PlayerModel> getAll(){
        return playerRepository.findAll();
    }

    //gerar times
   public List<PlayerModel> getTeam(){
        List<PlayerModel> team = new ArrayList<>();
        List<PlayerModel> players = new ArrayList<>(getAll());
        PlayerModel newPlayerRandom;
        Random random = new Random();
        for(int i = 0; i < 5; i++){//for para adicionar os 5 jogadors
            //colocando jogador aleatorio
            newPlayerRandom = players.get(random.nextInt(players.size()));
            final PlayerModel atual = newPlayerRandom;
            //verificacao se ja contem
            if(team.stream().anyMatch(p -> p.getName().equals(atual.getName()))){
                i--;//para repitir o loop
            }else{//so adiciona senao tem igual
                team.add(newPlayerRandom);
            }
        }
        return team;
    }

    //Criar novo player
    public PlayerModel save(PlayerModel player){
        return playerRepository.save(player);
    }

    //Deletar player
    public void delete(long id){
        playerRepository.deleteById(id);
    }

}
