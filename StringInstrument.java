public class StringInstrument extends Instrument {
    static int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public StringInstrument(String name, double price, int numStrings) {
        super(name, price);
        this.numStrings = numStrings;
    }
    
    @Override
    public void print() {
        System.out.println("String Instrument: " + name);
        System.out.println("Price: " + price);
        System.out.println("Number of Strings: " + numStrings);
    }
}
