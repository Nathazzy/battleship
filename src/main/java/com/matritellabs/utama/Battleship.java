package main.java.com.matritellabs.utama;

public class Battleship extends Battleships {

    public Battleship() {
        representation = "B4";
        shipLength = 4;
        placed = false;

    }

    @Override
    public String toString() {
        return "Battleship";
    }
}

