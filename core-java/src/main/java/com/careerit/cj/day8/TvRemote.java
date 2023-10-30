package com.careerit.cj.day8;

public class TvRemote {

    private boolean state;
    private int volume;
    private int channel;
    private int tempVolume;

    public TvRemote() {
        this.state = false;
        this.volume = 0;
        this.channel = 0;
    }

    public void on() {
        state = true;
        this.volume = 10;
        this.channel = 100;
        System.out.println("TV is switched on");
    }

    public void off() {
        state = false;
        this.volume = 0;
        this.channel = 0;
        System.out.println("TV is switched off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume is increased to :" + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume is decreased to :" + volume);
    }

    public void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel is changed to :" + channel);
    }

    public void mute() {
        tempVolume = volume;
        volume = 0;
        System.out.println("Volume is muted");
    }

    public void unMute() {
        volume = tempVolume;
        System.out.println("Volume is unmuted");
    }

    public void showInfo() {
        System.out.println("State :" + state);
        System.out.println("Volume :" + volume);
        System.out.println("Channel :" + channel);
    }

    public static void main(String[] args) {

        TvRemote tvRemote = new TvRemote();
        tvRemote.on();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.mute();
        tvRemote.showInfo();
        tvRemote.unMute();
        tvRemote.showInfo();
    }
}
