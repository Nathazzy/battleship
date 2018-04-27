package main.java.com.matritellabs.utama;
import main.java.com.matritellabs.utama.helper.*;


public class Game {

    public static void main (String[] args) {


        ScoreTable myScoreTable = new ScoreTable();
        BattleshipTable toPlayTable = new BattleshipTable();

        LineByLineReader toRead = new LineByLineReader();
        String coorToRead = toRead.readLineFromStdIn();
        String direction = toRead.readLineFromStdIn();
        String gamerNameFromKeyboard = toRead.readLineFromStdIn();
        int[] temp = new int[2];

        System.out.println("Please type first player's name: ");

        //Setup player1
        Player player1 = new Player(gamerNameFromKeyboard);

        //Place ships player1
        boolean allplaced = false;
        while (!allplaced) {
            System.out.println("Please" + player1 + " place your Battleship coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player1 + " place your Battleship direction : ");
            player1.battleshipPlace(temp[0], temp[1], direction, new Battleship());


            System.out.println("Please" + player1 + " place your Carrier coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player1 + " place your Carrier direction : ");
            player1.battleshipPlace(temp[0], temp[1], direction, new Carrier());

            System.out.println("Please" + player1 + " place your Cruiser coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player1 + " place your Cruiser direction : ");
            player1.battleshipPlace(temp[0], temp[1], direction, new Cruiser());

            System.out.println("Please" + player1 + " place your Destroyer coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player1 + " place your Destroyer direction : ");
            player1.battleshipPlace(temp[0], temp[1], direction, new Destroyer());

            System.out.println("Please" + player1 + " place your Submarine coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player1 + " place your Submarine direction : ");
            player1.battleshipPlace(temp[0], temp[1], direction, new Submarine());

            allplaced = true;
        }

        //Setup player2
        System.out.println("Please type first player's name: ");
        Player player2 = new Player(gamerNameFromKeyboard);

        //Place ships player2
        while (!allplaced) {
            System.out.println("Please" + player2 + " place your Battleship coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player2 + " place your Battleship direction : ");
            player2.battleshipPlace(temp[0], temp[1], direction, new Battleship());
            //player1.keepScoreTable

            System.out.println("Please" + player2 + " place your Carrier coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player2 + " place your Carrier direction : ");
            player2.battleshipPlace(temp[0], temp[1], direction, new Carrier());

            System.out.println("Please" + player2 + " place your Cruiser coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player2 + " place your Cruiser direction : ");
            player2.battleshipPlace(temp[0], temp[1], direction, new Cruiser());

            System.out.println("Please" + player2 + " place your Destroyer coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player2 + " place your Destroyer direction : ");
            player2.battleshipPlace(temp[0], temp[1], direction, new Destroyer());

            System.out.println("Please" + player2 + " place your Submarine coordinates: ");
            temp = Table.coordinateInterpreter(coorToRead);
            System.out.println("Please" + player2 + " place your Submarine direction : ");
            player2.battleshipPlace(temp[0], temp[1], direction, new Submarine());

            allplaced = true;
        }

        //Show tables

        //Start the game, play
        System.out.print("Let's start a game!");

        System.out.println("Please " + player1 + " shoot: ");

        Table.coordinateInterpreter(coorToRead);


    }

}
//BattleshipTable.placable
