package main.java.com.matritellabs.utama;

import main.java.com.matritellabs.utama.helper.*;


public class Game {

    public static void main(String[] args) {

        LineByLineReader toRead = new LineByLineReader();
        int[] temp = new int[2];

        System.out.println("Please type first player's name: ");
        String gamerNameFromKeyboard = toRead.readLineFromStdIn();
        Player player1 = new Player(gamerNameFromKeyboard);


        //Place ships player1
        Battleship boat1 = new Battleship();

        while (!boat1.placed) {
            try {
                System.out.println("Please " + player1.nickname + " place your " + boat1.getClass().getSimpleName() + " coordinates: ");
                temp = Table.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " place your Battleship direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat1)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat1);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Ooops");
            }
        }
            player1.battleshipTable.printoutTable();




            //Setup player2
            System.out.println("Please type first player's name: ");
            Player player2 = new Player(gamerNameFromKeyboard);


            // Place ships player2


            //Show tables

            //Start the game, play
            System.out.print("Let's start a game!");

            System.out.println("Please " + player1 + " shoot: ");

            Table.coordinateInterpreter(toRead.readLineFromStdIn());


        }
    }

//BattleshipTable.placable
