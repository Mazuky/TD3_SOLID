package Exo1;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Wind> wind = new ArrayList<Wind>();
    private ArrayList<Percussion> percussion = new ArrayList<Percussion>();


    public void tuneWind(Wind w){
        w.play();

    }
    public void tunePercussion(Percussion p){
        p.play();

    }
    public void tuneAll(){
        for (Wind w: wind){
            tuneWind(w);
        }
        for (Percussion p: percussion){
            tunePercussion(p);
        }

    }
    public void addWind(Wind w){
        wind.add(w);

    }
    public void addPercussion(Percussion p){
        percussion.add(p);

    }
}
