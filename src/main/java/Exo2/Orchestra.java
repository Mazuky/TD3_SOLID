package Exo2;

import Exo1.Percussion;
import Exo1.Wind;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Exo1.Wind> wind = new ArrayList<Exo1.Wind>();
    private ArrayList<Exo1.Percussion> percussion = new ArrayList<Exo1.Percussion>();


    public void tuneWind(Exo1.Wind w){
        w.play();

    }
    public void tunePercussion(Exo1.Percussion p){
        p.play();

    }
    public void tuneAll(){
        for (Exo1.Wind w: wind){
            tuneWind(w);
        }
        for (Exo1.Percussion p: percussion){
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
