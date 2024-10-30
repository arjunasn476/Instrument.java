public class Piano extends Instrument {
    String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public Piano(String name, double price, String pianoType) {
        super(name, price);
        this.pianoType = pianoType;
    }

    @Override
    public void print() {
        System.out.println("Piano: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + pianoType);
    }
}
