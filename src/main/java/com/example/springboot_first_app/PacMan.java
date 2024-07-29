package com.example.springboot_first_app;

public class PacMan implements GamingConsole{
    public void up(){
        System.out.println("Eat up");
    }

    public void down(){
        System.out.println("Eat down");
    }

    public void right(){
        System.out.println("Eat forward");
    }

    public void left(){
        System.out.println("Eat backward");
    }
}
