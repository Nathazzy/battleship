package main.java.com.matritellabs.utama;

public class Submarine extends Battleships {

    public Submarine() {
        representation = "S3";
        shipLength = 3;
        placed = false;

    }

    @Override
    public String toString() {
        return "Submarine";
    }
}
