package main.java.com.matritellabs.utama;

public class Submarine extends Battleships {
    public Submarine(int shipLength, boolean placed) {
        super(shipLength, placed);
    }

    @Override
    public String toString() {
        return "Submarine";
    }
}
