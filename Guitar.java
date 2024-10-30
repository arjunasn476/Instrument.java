public class Guitar extends StringInstrument {
    boolean isElectric;
    int numStrings;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public Guitar(String name, double price, int numStrings, boolean isElectric) {
        super(name, price, numStrings);
        this.isElectric = isElectric;
        this.numStrings = numStrings; 
    }

    @Override
    public void print() {
        String type = isElectric ? "Electric" : "Acoustic";
        System.out.println("Guitar: " + name);
        System.out.println("Price: " + price);
        System.out.println("Strings: " + numStrings);
        System.out.println("Type: " + type);
    }
}
