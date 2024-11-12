package com.douglasmamede.dslist.repositories;

import com.douglasmamede.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
