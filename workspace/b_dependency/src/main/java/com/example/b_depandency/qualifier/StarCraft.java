package com.example.b_depandency.qualifier;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j // lombok안에 있는 코드
public class StarCraft implements Game {

    @Override
    public void play() {
        log.info("Playing StarCraft");
    }
}
