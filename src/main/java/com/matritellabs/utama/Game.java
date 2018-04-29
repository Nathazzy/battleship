package main.java.com.matritellabs.utama;

import main.java.com.matritellabs.utama.helper.*;

import java.io.IOException;
import java.io.InputStream;


public class Game {

    public static void main(String[] args) {

        LineByLineReader toRead = new LineByLineReader();
        int[] temp = new int[2];

        System.out.println("Please type first player's name: ");
        String gamerNameFromKeyboard = toRead.readLineFromStdIn();
        Player player1 = new Player(gamerNameFromKeyboard);

        //Place ships player1
        Battleship boat1 = new Battleship(); //BattleSip 4
        Carrier boat2 = new Carrier(); //Carrier 5
        Cruiser boat3 = new Cruiser(); //Cruiser 3
        Destroyer boat4 = new Destroyer(); //Destroyer 2
        Submarine boat5 = new Submarine(); // Submarine 3

        while (!boat1.placed) {
            try {
                System.out.println("Please " + player1.nickname + " give your " + boat1.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " give your " + boat1.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat1)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat1);
                } else {
                    System.out.println("Here");
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat2.placed) {
            try {
                System.out.println("Please " + player1.nickname + " give your " + boat2.getClass().getSimpleName() + " coordinates: ");
                //if (Table.coordinateInterpreter())
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());

                System.out.println("Please " + player1.nickname + " give your " + boat2.getClass().getSimpleName() + " direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat2)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat2);
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat3.placed) {
            try {
                System.out.println("Please " + player1.nickname + " give your " + boat3.getClass().getSimpleName() + " coordinates: ");
                //if (Table.coordinateInterpreter())
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());

                System.out.println("Please " + player1.nickname + " give your " + boat3.getClass().getSimpleName() + " direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat3)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat3);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Direction is not allowed!");
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat4.placed) {
            try {
                System.out.println("Please " + player1.nickname + " give your " + boat4.getClass().getSimpleName() + " coordinates: ");
                //if (Table.coordinateInterpreter())
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());

                System.out.println("Please " + player1.nickname + " give your " + boat4.getClass().getSimpleName() + " direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat4)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat4);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Direction is not allowed!");
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat5.placed) {
            try {
                System.out.println("Please " + player1.nickname + " give your " + boat5.getClass().getSimpleName() + " coordinates: ");
                //if (Table.coordinateInterpreter())
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());

                System.out.println("Please " + player1.nickname + " give your " + boat5.getClass().getSimpleName() + " direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat5)) {
                    player1.battleshipPlace(temp[0], temp[1], tempPlace, boat5);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Direction is not allowed!");
            }
            player1.battleshipTable.printoutTable();
        }

            //Setup player2
            System.out.println("Please type second player's name: ");
            Player player2 = new Player(gamerNameFromKeyboard);


            // Place ships player2


            //Show tables

            //Start the game, play



        }
    }

