package com.careerit.cj.day22;

import java.util.List;

interface Game{
    void start();
    void play();
    void stop();
}
abstract class AbstractGame implements Game{
    public void start(){
        System.out.println(this.getClass().getSimpleName()+" is going start");
    }
    public void stop(){
        System.out.println(this.getClass().getSimpleName()+" is going stop");
    }
}
class Bike extends AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, please wear helmet");
    }
}

class Car extends  AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, please wear seat belt");
    }
}

class Ship extends AbstractGame implements Game{
    @Override
    public void play(){
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, please wear life jacket");
    }
}



public class InterfaceManager {

    public static void main(String[] args) {

        List<Game> games = List.of(new Bike(),new Car(),new Ship(),new Bike(),new Car(),new Ship(),new Car());

        for(Game game:games){
            game.start();
            game.play();
            game.stop();
            System.out.println("------------------------------------");
        }

    }
}
