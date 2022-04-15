package Exo2;

public class Music {
    public static void main(String[] args) {
        Percussion percussion = new Percussion();
        Woodwind woodwind = new Woodwind();
        Brass brass = new Brass();
        Wind wind = new Wind();
        Orchestra orchestra = new Orchestra();

        orchestra.addInstrument(woodwind);
        orchestra.addInstrument(brass);
        orchestra.addInstrument(percussion);
        orchestra.addInstrument(wind);
        orchestra.addInstrument(new Stringed());
        orchestra.tuneAll();

    }
}
