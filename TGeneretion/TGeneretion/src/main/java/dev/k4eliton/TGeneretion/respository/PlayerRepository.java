package dev.k4eliton.TGeneretion.respository;

import dev.k4eliton.TGeneretion.model.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository//converte excecoes especificas em excecoes Spring
public interface PlayerRepository extends JpaRepository<PlayerModel, Long> {
}
