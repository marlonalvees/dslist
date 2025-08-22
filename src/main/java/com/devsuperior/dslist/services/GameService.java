package com.devsuperior.dslist.services;
import java.util.List;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired // Ele é uma anotação do Spring que serve para injeção de dependência.
    private GameRepository gameRepository;

    // Retorna lista de games
    public List<GameMinDTO> findAll(){
      List<Game> result =  gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }


}
