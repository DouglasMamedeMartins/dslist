package com.douglasmamede.dslist.services;

import com.douglasmamede.dslist.dto.GameListDTO;
import com.douglasmamede.dslist.entities.GameList;
import com.douglasmamede.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }
}