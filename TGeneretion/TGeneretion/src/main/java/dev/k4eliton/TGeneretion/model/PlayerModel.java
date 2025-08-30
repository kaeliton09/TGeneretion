package dev.k4eliton.TGeneretion.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//mapeando classe para tabela
@Table(name = "player")//definir nome da tabela para player
@Data//lombok para gerar getters/setters
@AllArgsConstructor//lombok para construtor com todos argumentos
@NoArgsConstructor
public class PlayerModel {
    @Id//marcando primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//definindo regra para auto incremento na primary key
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "PlayerModel{" +
                "name='" + name + '\'' +
                '}';
    }


}
