package com.careerit.cj.day22;

import java.util.Scanner;

interface MusicInstrument{
      String brandName = "Yamaha"; // public static final String brandName = "Yamaha";
      void sound();  // public abstract void sound();
}

class Piano implements MusicInstrument{

    @Override
    public void sound() {
        System.out.println("Piano sound");
    }
}

class Guitar implements MusicInstrument{

    @Override
    public void sound() {
        System.out.println("Guitar sound");
    }
}

class Flute implements MusicInstrument{

    @Override
    public void sound() {
        System.out.println("Flute sound");
    }
}

class Violin implements MusicInstrument{

    @Override
    public void sound() {
        System.out.println("Violin sound");
    }
}

public class MusicInstrumentManager {

    public static void main(String[] args) {

        MusicInstrument ref = getMusicInstrument();
        ref.sound();
    }

    private static MusicInstrument getMusicInstrument() {
        System.out.println("1.Piano 2.Guitar 3.Flute 4.Violin");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        MusicInstrument instrumentObj = switch (ch) {
            case 1 -> new Piano();
            case 2 -> new Guitar();
            case 3 -> new Flute();
            case 4 -> new Violin();
            default -> throw new IllegalArgumentException("Unexpected value: " + ch);
        };
        return instrumentObj;
    }
}
