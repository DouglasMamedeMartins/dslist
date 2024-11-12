package com.douglasmamede.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasmamede.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
