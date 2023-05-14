package Instrument;

public class InstrumenrDemo {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum("Large");
        Tube tube = new Tube(22.1);

        Instrument[] instruments = {guitar, drum, tube};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
