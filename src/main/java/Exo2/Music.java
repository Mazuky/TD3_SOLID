package Exo2;

import Exo1.Brass;
import Exo1.Percussion;
import Exo1.Wind;
import Exo1.Woodwind;

public class Music {
    public static void main(String[] args) {
        Exo1.Wind wind = new Wind();
        Exo1.Percussion percussion = new Percussion();
        Exo1.Woodwind woodwind = new Woodwind();
        Exo1.Brass brass = new Brass();
        Orchestra orchestra = new Orchestra();
        orchestra.addWind(wind);
        orchestra.addWind(woodwind);
        orchestra.addWind(brass);
        orchestra.addPercussion(percussion);
        /*orchestra.tuneWind(wind);
        orchestra.tunePercussion(percussion);
        orchestra.tuneWind(brass);
        orchestra.tuneWind(woodwind);*/
        orchestra.tuneAll();
    }

}
