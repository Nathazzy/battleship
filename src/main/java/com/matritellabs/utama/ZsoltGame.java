package main.java.com.matritellabs.utama;

import main.java.com.matritellabs.utama.helper.*;

import java.io.IOException;
import java.io.InputStream;


public class ZsoltGame {

    public static void main(String[] args) {

        LineByLineReader toRead = new LineByLineReader();
        int[] temp = new int[2];



        Battleship boat1 = new Battleship(); //BattleSip 4
       /* Carrier boat2 = new Carrier(); //Carrier 5
        Cruiser boat3 = new Cruiser(); //Cruiser 3
        Destroyer boat4 = new Destroyer(); //Destroyer 2
        Submarine boat5 = new Submarine(); // Submarine 3*/


        Player player1 = new Player("kati");
        temp = player1.battleshipTable.coordinateInterpreter("G3");
        player1.battleshipTable.placeable(temp[0], temp[1], "up", boat1);
        player1.battleshipPlace(temp[0], temp[1], "up", boat1);
        player1.battleshipTable.printoutTable();

        /*player1.battleshipTable.placeable(0, 1, "down", boat2);
        player1.battleshipTable.printoutTable();

        player1.battleshipTable.placeable(0, 1, "left", boat3);
        player1.battleshipTable.printoutTable();

        player1.battleshipTable.placeable(0, 1, "right", boat4);
        player1.battleshipTable.printoutTable();*/




        /*System.out.println("Please type first player's name: ");
        String gamerNameFromKeyboard = toRead.readLineFromStdIn();
        Player player1 = new Player(gamerNameFromKeyboard);

        //Ships
        Battleship boat1 = new Battleship(); //BattleSip 4
        Carrier boat2 = new Carrier(); //Carrier 5
        Cruiser boat3 = new Cruiser(); //Cruiser 3
        Destroyer boat4 = new Destroyer(); //Destroyer 2
        Submarine boat5 = new Submarine(); // Submarine 3

        Battleship enemyboat1 = new Battleship(); //BattleSip 4
        Carrier enemyboat2 = new Carrier(); //Carrier 5
        Cruiser enemyboat3 = new Cruiser(); //Cruiser 3
        Destroyer enemyboat4 = new Destroyer(); //Destroyer 2
        Submarine enemyboat5 = new Submarine(); // Submarine 3

        while (!boat1.placed) {
            try {
                System.out.println("Please " + player1.nickname + " set your " + boat1.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " set your " + boat1.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat1)) {
                        player1.battleshipPlace(temp[0], temp[1], tempPlace, boat1);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
       while (!boat2.placed) {
            try {
                System.out.println("Please " + player1.nickname + " set your " + boat2.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " set your " + boat2.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat2)) {
                        player1.battleshipPlace(temp[0], temp[1], tempPlace, boat2);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat3.placed) {
            try {
                System.out.println("Please " + player1.nickname + " set your " + boat3.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " set your " + boat3.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat3)) {
                        player1.battleshipPlace(temp[0], temp[1], tempPlace, boat3);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat4.placed) {
            try {
                System.out.println("Please " + player1.nickname + " set your " + boat4.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " set your " + boat4.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat4)) {
                        player1.battleshipPlace(temp[0], temp[1], tempPlace, boat4);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }
        while (!boat5.placed) {
            try {
                System.out.println("Please " + player1.nickname + " set your " + boat5.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player1.nickname + " set your " + boat5.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player1.battleshipTable.placeable(temp[0], temp[1], tempPlace, boat5)) {
                        player1.battleshipPlace(temp[0], temp[1], tempPlace, boat5);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player1.battleshipTable.printoutTable();
        }

        //Setup player2
        System.out.println("Okay " + player1.nickname + " is ready, please type second player's name: ");
        String gamer2NameFromKeyboard = toRead.readLineFromStdIn();
        Player player2 = new Player(gamer2NameFromKeyboard);

        while (!enemyboat4.placed) {
            try {
                System.out.println("Please " + player2.nickname + " set your " + enemyboat4.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player2.nickname + " set your " + enemyboat4.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player2.battleshipTable.placeable(temp[0], temp[1], tempPlace, enemyboat4)) {
                        player2.battleshipPlace(temp[0], temp[1], tempPlace, enemyboat4);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                e.printStackTrace();
            }
            player2.battleshipTable.printoutTable();
        }
        while (!enemyboat2.placed) {
            try {
                System.out.println("Please " + player2.nickname + " set your " + enemyboat2.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player2.nickname + " set your " + enemyboat2.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player2.battleshipTable.placeable(temp[0], temp[1], tempPlace, enemyboat2)) {
                        player2.battleshipPlace(temp[0], temp[1], tempPlace, enemyboat2);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player2.battleshipTable.printoutTable();
        }
        while (!enemyboat3.placed) {
            try {
                System.out.println("Please " + player2.nickname + " set your " + enemyboat3.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player2.nickname + " set your " + enemyboat3.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player2.battleshipTable.placeable(temp[0], temp[1], tempPlace, enemyboat3)) {
                        player2.battleshipPlace(temp[0], temp[1], tempPlace, enemyboat3);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player2.battleshipTable.printoutTable();
        }
        while (!enemyboat4.placed) {
            try {
                System.out.println("Please " + player2.nickname + " set your " + enemyboat4.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player2.nickname + " set your " + enemyboat4.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player2.battleshipTable.placeable(temp[0], temp[1], tempPlace, enemyboat4)) {
                        player2.battleshipPlace(temp[0], temp[1], tempPlace, enemyboat4);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player2.battleshipTable.printoutTable();
        }
        while (!enemyboat5.placed) {
            try {
                System.out.println("Please " + player2.nickname + " set your " + enemyboat5.getClass().getSimpleName() + "'s coordinates: ");
                temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
                System.out.println("Please " + player2.nickname + " set your " + enemyboat5.getClass().getSimpleName() + "'s direction : ");
                String tempPlace = toRead.readLineFromStdIn();
                if (temp[0] != 70 && temp[1] != 70) {
                    if (player2.battleshipTable.placeable(temp[0], temp[1], tempPlace, enemyboat5)) {
                        player2.battleshipPlace(temp[0], temp[1], tempPlace, enemyboat5);
                    } else {
                        System.out.println("Here");
                    }
                } else {
                    System.out.println("Out of table, please try again!");
                }
            }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
                e.printStackTrace();
            }
            player2.battleshipTable.printoutTable();
        }

        //Start the game, play
        while (!player1.battleshipTable.checkIfGameEnded() || !player2.battleshipTable.checkIfGameEnded()) {
            System.out.println("Please " + player1.nickname + " shoot");
            temp = BattleshipTable.coordinateInterpreter(toRead.readLineFromStdIn());
            player1.shoot(temp[0], temp[1], player2);
            //Shot.play();
            player1.keepScoreTable.printoutTable();

            player1.battleshipTable.alreadySunkenShips();

        }*/
    }
}

