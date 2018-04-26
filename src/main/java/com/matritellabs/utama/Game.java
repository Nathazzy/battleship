package main.java.com.matritellabs.utama;
import main.java.com.matritellabs.utama.helper.*;


public class Game {

    public static void main (String[] args) {

        Table gameBoard = new Table();
        Battleships shipToPlace = new Battleships();

        LineByLineReader toRead = new LineByLineReader();
        String coorToRead = toRead.readLineFromStdIn();
        String direction = toRead.readLineFromStdIn();
        String gamer1 = toRead.readLineFromStdIn();

        System.out.println("Please type first player's name: ");

        Player player1 = new Player(gamer1, gameBoard);

        boolean allplaced = false;
        while (!allplaced) {
            Battleships notplaced = player1.notplacedyet();
            System.out.println("Write your " + notplaced + "'s coordinate and direction");
            player1.battleshipPlace(coorToRead, direction, shipToPlace);
            allplaced = player1.checkIfAllPlaced();
        }
    }
}
