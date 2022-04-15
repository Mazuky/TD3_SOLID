package Exo4;

import Exo1.Wind;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Instrument> instrument = new ArrayList<Instrument>();

    public void tune(Instrument i){
    i.play();
    }
    public void tuneAll(){
        for (Instrument i: instrument){
            tune(i);
        }
    }
    public void addInstrument(Instrument i){
    instrument.add(i);
    }
    public void tuneTenor(Soloist i){
        i.playLikeATenor();
    }
    public void tuneSoprano(Soloist i){
        i.playLikeASoprano();
    }
}
