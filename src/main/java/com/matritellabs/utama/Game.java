package main.java.com.matritellabs.utama;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import main.java.com.matritellabs.utama.helper.*;


public class Game {

    public static void main(String[] args) {

        LineByLineReader toRead = new LineByLineReader();
        int[] coordinatesArray = new int[2];
        // FIRST PLAYER NAME AND BATTLESHIP PLACE
        System.out.println("Please type first player's name: ");
        String gamerName = toRead.readLineFromStdIn();
        Player player1 = new Player(gamerName);
        Battleships cruiser1 = new Cruiser();
        Battleships carrier1 = new Carrier();
        Battleships battleship1 = new Battleship();
        Battleships submarine1 = new Submarine();
        Battleships destroyer1 = new Destroyer();

        while (!(cruiser1.placed && carrier1.placed && battleship1.placed && submarine1.placed && destroyer1.placed)) {
            try {
                System.out.println();
                player1.battleshipTable.printoutTable();
                System.out.println();

                if (!cruiser1.placed) {
                    System.out.println(player1.nickname + " place your Cruiser!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Cruiser a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player1.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, cruiser1)) {
                        player1.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, cruiser1);
                    } else {
                        System.out.println("You can't place your Cruiser there!");
                    }
                }

                System.out.println();
                player1.battleshipTable.printoutTable();
                System.out.println();

                if (!carrier1.placed) {
                    System.out.println(player1.nickname + " place your Carrier!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Carrier a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player1.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, carrier1)) {
                        player1.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, carrier1);
                    } else {
                        System.out.println("You can't place your Carrier there!");
                    }
                }
                System.out.println();
                player1.battleshipTable.printoutTable();
                System.out.println();

                if (!submarine1.placed) {
                    System.out.println(player1.nickname + " place your Submarine!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Submarine a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player1.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, submarine1)) {
                        player1.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, submarine1);
                    } else {
                        System.out.println("You can't place your Submarine there!");
                    }
                }
                System.out.println();
                player1.battleshipTable.printoutTable();
                System.out.println();

                if (!destroyer1.placed) {
                    System.out.println(player1.nickname + " place your Destroyer!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Destroyer a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player1.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, destroyer1)) {
                        player1.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, destroyer1);
                    } else {
                        System.out.println("You can't place your Destroyer there!");
                    }
                }

                System.out.println();
                player1.battleshipTable.printoutTable();
                System.out.println();

                if (!battleship1.placed) {
                    System.out.println(player1.nickname + " place your Battleship!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Battleship a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player1.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, battleship1)) {
                        player1.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, battleship1);
                    } else {
                        System.out.println("You can't place your Battleship there!");
                    }
                }

            } catch (NullPointerException | ArrayIndexOutOfBoundsException npex) {
                System.out.println("Wrong coordinates! Try again");
            }
        }
        System.out.println(player1.nickname + " successfully placed all ships!");

        for (int i = 0; i < 40; i++) {
            System.out.println();
        }

        // Second PLAYER NAME AND BATTLESHIP PLACE
        System.out.println("Please type second player's name: ");
        gamerName = toRead.readLineFromStdIn();
        Player player2 = new Player(gamerName);
        Battleships cruiser2 = new Cruiser();
        Battleships carrier2 = new Carrier();
        Battleships battleship2 = new Battleship();
        Battleships submarine2 = new Submarine();
        Battleships destroyer2 = new Destroyer();

        while (!(cruiser2.placed && carrier2.placed && battleship2.placed && submarine2.placed && destroyer2.placed)) {
            try {
                System.out.println();
                player2.battleshipTable.printoutTable();
                System.out.println();

                if (!cruiser2.placed) {
                    System.out.println(player2.nickname + " place your Cruiser!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Cruiser a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player2.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, cruiser2)) {
                        player2.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, cruiser2);
                    } else {
                        System.out.println("You can't place your Cruiser there!");
                    }
                }

                System.out.println();
                player2.battleshipTable.printoutTable();
                System.out.println();

                if (!carrier2.placed) {
                    System.out.println(player2.nickname + " place your Carrier!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Carrier a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player2.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, carrier2)) {
                        player2.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, carrier2);
                    } else {
                        System.out.println("You can't place your Carrier there!");
                    }
                }
                System.out.println();
                player2.battleshipTable.printoutTable();
                System.out.println();

                if (!submarine2.placed) {
                    System.out.println(player2.nickname + " place your Submarine!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Submarine a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player2.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, submarine2)) {
                        player2.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, submarine2);
                    } else {
                        System.out.println("You can't place your Submarine there!");
                    }
                }
                System.out.println();
                player2.battleshipTable.printoutTable();
                System.out.println();

                if (!destroyer2.placed) {
                    System.out.println(player2.nickname + " place your Destroyer!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Destroyer a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player2.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, destroyer2)) {
                        player2.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, destroyer2);
                    } else {
                        System.out.println("You can't place your Destroyer there!");
                    }
                }

                System.out.println();
                player2.battleshipTable.printoutTable();
                System.out.println();

                if (!battleship2.placed) {
                    System.out.println(player2.nickname + " place your Battleship!");
                    System.out.println("You can type columns by A-J, rows with 1-10");
                    System.out.println("Example: \"F5\"");
                    String coordinatesString = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(coordinatesString);
                    System.out.println("Give your Battleship a direction! \"up\" \"down\" \"left\" \"right\"");
                    String directionString = toRead.readLineFromStdIn();
                    if (player2.battleshipTable.placeable(coordinatesArray[0], coordinatesArray[1], directionString, battleship2)) {
                        player2.battleshipPlace(coordinatesArray[0], coordinatesArray[1], directionString, battleship2);
                    } else {
                        System.out.println("You can't place your Battleship there!");
                    }
                }

            } catch (NullPointerException | ArrayIndexOutOfBoundsException npex) {
                System.out.println("Wrong coordinates! Try again");
            }
        }
        System.out.println(player2.nickname + " successfully placed all ships!");

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        System.out.println("LET'S START THE GAME");

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        boolean gameEnded = false;
        String toShoot;
        while (!gameEnded) {
            System.out.println(player1.nickname + "'S TURN!");
            System.out.println("WRITE SOMETHING TO BEGIN!");
            toRead.readLineFromStdIn();
            do {
                player1.keepScoreTable.printoutTable();
                player1.battleshipTable.printoutTable();
                player2.battleshipTable.alreadySunkenShips();
                System.out.println();
                System.out.println(player1.nickname + " WRITE A COORDINATE TO SHOOT!");
                System.out.println("DON'T SHOOT TO THE SAME COORDINATE!");
                toShoot = toRead.readLineFromStdIn();
                coordinatesArray = Table.coordinateInterpreter(toShoot);
            } while (!player1.shoot(coordinatesArray[0], coordinatesArray[1], player2));
            gameEnded = player2.battleshipTable.checkIfGameEnded();
            if (!gameEnded) {
                player2.battleshipTable.alreadySunkenShips();
                System.out.println(player1.nickname + " WRITE SOMETHING TO END YOUR TURN!");
                toRead.readLineFromStdIn();
                for (int i = 0; i < 40; i++) {
                    System.out.println();
                }
            }

            if (!gameEnded) {
                System.out.println(player2.nickname + "'S TURN!");
                System.out.println("WRITE SOMETHING TO BEGIN!");
                toRead.readLineFromStdIn();
                do {
                    player2.keepScoreTable.printoutTable();
                    player2.battleshipTable.printoutTable();
                    player1.battleshipTable.alreadySunkenShips();
                    System.out.println();
                    System.out.println(player2.nickname + " WRITE A COORDINATE TO SHOOT!");
                    System.out.println("DON'T SHOOT TO THE SAME COORDINATE!");
                    toShoot = toRead.readLineFromStdIn();
                    coordinatesArray = Table.coordinateInterpreter(toShoot);
                } while (!player2.shoot(coordinatesArray[0], coordinatesArray[1], player1));
                gameEnded = player1.battleshipTable.checkIfGameEnded();
                if (gameEnded) {
                    System.out.println(player2.nickname + " WON!!!");
                    System.out.println("CONGRATULATIONS!!!");
                } else {
                    player1.battleshipTable.alreadySunkenShips();
                    System.out.println(player2.nickname + " WRITE SOMETHING TO END YOUR TURN!");
                    toRead.readLineFromStdIn();
                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }
                }
            } else {
                System.out.println(player1.nickname + " WON!!!");
                System.out.println("CONGRATULATIONS!!!");
            }
        }
    }
}

