package Exo4;

public class Flute extends Woodwind implements Soprano{
    @Override
    public void play() {
        System.out.println("Flute plays like an Instrument");

    }

    @Override
    public void playLikeASoprano() {
        System.out.println("Flute plays like a Soprano");
    }

}