import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Guitar\n2. Piano");
        System.out.println();
        int pilihan = scanner.nextInt(); // Changed 's' to 'scanner'
        scanner.nextLine(); // Consume the newline character

        switch (pilihan) {
            case 1: // Piano
                System.out.println("Piano");
                System.out.print("Brand: ");
                String name = scanner.nextLine();
                System.out.print("Piano Type: ");
                String pianoType = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                Piano a = new Piano(name, price, pianoType);
                a.print();
                break;

            case 2: // Guitar
                System.out.println("Guitar");
                System.out.print("Brand: ");
                name = scanner.nextLine();
                System.out.print("Electric Guitar (true) / Acoustic Guitar (false): ");
                boolean isElectric = scanner.nextBoolean();
                System.out.print("Guitar String Count: ");
                int numStrings = scanner.nextInt();
                System.out.print("Price: ");
                price = scanner.nextDouble();
                Guitar b = new Guitar(name, price, numStrings, isElectric);
                b.print();
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        scanner.close(); // Close the scanner
    }
}

// Sample Piano class
class Piano {
    private String brand;
    private double price;
    private String type;

    public Piano(String brand, double price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public void print() {
        System.out.println("Piano Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }
}

// Sample Guitar class
class Guitar {
    private String brand;
    private double price;
    private int numStrings;
    private boolean isElectric;

    public Guitar(String brand, double price, int numStrings, boolean isElectric) {
        this.brand = brand;
        this.price = price;
        this.numStrings = numStrings;
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("Guitar Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Number of Strings: " + numStrings);
        System.out.println("Electric: " + isElectric);
        System.out.println("Price: $" + price);
    }
}
