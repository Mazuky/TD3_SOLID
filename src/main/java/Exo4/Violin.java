package Exo4;

public class Violin extends Stringed implements Soprano{
    @Override
    public void play() {
        System.out.println("Violin plays like an Instrument");

    }

    @Override
    public void playLikeASoprano() {
        System.out.println("Violin plays like a Soprano");
    }
}