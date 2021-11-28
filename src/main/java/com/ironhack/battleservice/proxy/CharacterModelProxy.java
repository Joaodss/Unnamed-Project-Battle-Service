package com.ironhack.battleservice.proxy;

import com.ironhack.battleservice.dto.CharacterDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "character-model-service", path = "/api/v1/characters")
public interface CharacterModelProxy {

    @PutMapping("/update")
    CharacterDTO updateCharacter(@RequestBody CharacterDTO updateCharacterDTO);

}