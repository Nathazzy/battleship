package main.java.com.matritellabs.utama;

public class Carrier extends Battleships {
    public Carrier(int shipLength, boolean placed) {
        super(shipLength, placed);
    }

    @Override
    public String toString() {
        return "Carrier";
    }
}
