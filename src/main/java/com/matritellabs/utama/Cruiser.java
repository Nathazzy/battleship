package main.java.com.matritellabs.utama;

public class Cruiser extends Battleships {

    public Cruiser() {
        representation = "C3";
        shipLength = 3;
        placed = false;

    }

    @Override
    public String toString() {
        return "Cruiser";
    }
}
