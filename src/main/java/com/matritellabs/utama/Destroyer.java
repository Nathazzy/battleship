package main.java.com.matritellabs.utama;

public class Destroyer extends Battleships {

    public Destroyer() {
        representation = "D2";
        shipLength = 2;
        placed = false;

    }

    @Override
    public String toString() {
        return "Destroyer";
    }
}
