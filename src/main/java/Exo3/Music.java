package Exo3;

public class Music {
    public static void main(String[] args) {
        Percussion percussion = new Percussion();
        //Woodwind woodwind = new Woodwind();
        //Brass brass = new Brass();
        //Wind wind = new Wind();
        Violin violin = new Violin();
        Flute flute = new Flute();
        Trombone trombone = new Trombone();
        Guitar guitar = new Guitar();
        Orchestra orchestra = new Orchestra();

        orchestra.addInstrument(percussion);
        orchestra.addInstrument(trombone);
        orchestra.addInstrument(guitar);
        orchestra.addInstrument(violin);
        orchestra.addInstrument(flute);
        orchestra.tuneTenor(trombone);
        orchestra.tuneSoprano(violin);
        orchestra.tuneSoprano(flute);
        orchestra.tuneTenor(guitar);
        orchestra.tuneSoprano(guitar);
        orchestra.tuneAll();

    }
}
