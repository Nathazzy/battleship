package main.java.com.matritellabs.utama;
import main.java.com.matritellabs.utama.helper.*;


public class Game {

    public static void main (String[] args) {


        ScoreTable myScore = new ScoreTable();
        BattleshipTable toPlay = new BattleshipTable();

        LineByLineReader toRead = new LineByLineReader();
        String coorToRead = toRead.readLineFromStdIn();
        String direction = toRead.readLineFromStdIn();
        String gamerNameFromKeyboard = toRead.readLineFromStdIn();

        System.out.println("Please type first player's name: ");

        //Setup player
        Player player1 = new Player(gamerNameFromKeyboard);

        //Place ships
        boolean allplaced = false;
        while (!allplaced) {
            Battleships notplaced = player1.notplacedyet();
            System.out.println("Write your " + notplaced + "'s coordinate and direction");
            player1.battleshipPlace(coorToRead, direction, shipToPlace);
            allplaced = player1.checkIfAllPlaced();
        }
    }
}
//BattleshipTable.placable
