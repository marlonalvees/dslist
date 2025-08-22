package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
// Repository é uma Interface responsavel por fazer consultas ao BD (salvar, atualizar, deletar etc)
public interface GameRepository extends JpaRepository<Game, Long> {

}
