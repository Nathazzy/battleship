package main.java.com.matritellabs.utama;

public class Carrier extends Battleships {

    public Carrier() {
        representation = "C5";
        shipLength = 5;
        placed = false;

    }

    @Override
    public String toString() {
        return "Carrier";
    }
}
