package main.java.com.matritellabs.utama;

public class Destroyer extends Battleships {
    public Destroyer(int shipLength, boolean placed) {
        super(shipLength, placed);
    }

    @Override
    public String toString() {
        return "Destroyer";
    }
}
