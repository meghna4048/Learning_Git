package com.example.springboot_first_app;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Go down in hole");
    }

    public void left(){
        System.out.println("De-accelerate");
    }

    public void right(){
        System.out.println("Accelerate");
    }
}
