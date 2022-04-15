package Exo1;

public class Music {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Percussion percussion = new Percussion();
        Woodwind woodwind = new Woodwind();
        Brass brass = new Brass();
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
