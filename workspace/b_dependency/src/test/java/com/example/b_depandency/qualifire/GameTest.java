package com.example.b_depandency.qualifire;

import com.example.b_depandency.qualifier.Game;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GameTest {

    @Autowired
//    @Qualifier("starCraft")
    private Game game;

    @Test
    void test(){
        game.play();
    }
}
