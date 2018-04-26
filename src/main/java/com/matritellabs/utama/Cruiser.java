package main.java.com.matritellabs.utama;

public class Cruiser extends Battleships {
    public Cruiser(int shipLength, boolean placed) {
        super(shipLength, placed);
    }

    @Override
    public String toString() {
        return "Cruiser";
    }
}
