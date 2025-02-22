package com.example.springboot_first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springboot_first_app.GameRunner;
import com.example.springboot_first_app.MarioGame;
import com.example.springboot_first_app.SuperContra;

public class BasicGaming {
    public static void main(String[] args){
        var game = new MarioGame();
        var pacManGame = new PacMan();
//        var game = new SuperContra();
        var gameRunner = new GameRunner(game);
        System.out.println("Created feature branch, to learn creating the pull request");
        gameRunner.run();
    }
}
