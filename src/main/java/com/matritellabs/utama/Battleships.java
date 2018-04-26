package main.java.com.matritellabs.utama;

public abstract class Battleships {
    public int shipLength;
    public boolean placed;

    public Battleships(int shipLength, boolean placed) {
        this.shipLength = shipLength;
        this.placed = placed;
    }
}
