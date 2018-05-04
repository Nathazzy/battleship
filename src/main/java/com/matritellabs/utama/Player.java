package main.java.com.matritellabs.utama;

import java.lang.reflect.Array;

public class Player {

    public String nickname;
    public ScoreTable keepScoreTable = new ScoreTable();
    public BattleshipTable battleshipTable = new BattleshipTable();

    public Player(String nickname){
        this.nickname = nickname;
    }

    // SHOOTING METHOD
    public boolean shoot(int vertical, int horizontal, Player enemy){
        try {
            if (enemy.battleshipTable.table[vertical][horizontal] != " H" && enemy.battleshipTable.table[vertical][horizontal] != " X") {
                if (enemy.battleshipTable.table[vertical][horizontal] == " O") {
                    enemy.battleshipTable.table[vertical][horizontal] = " X";
                    keepScoreTable.table[vertical][horizontal] = " X";
                    System.out.println("MISSED!");
                    Shot.play();
                    return true;
                } else if (enemy.battleshipTable.table[vertical][horizontal] == "S3"){
                    enemy.battleshipTable.table[vertical][horizontal] = " H";
                    keepScoreTable.table[vertical][horizontal] = " H";
                    System.out.println("HIT!");
                    Shot.play();
                    enemy.battleshipTable.sunkenShip("S3");
                    return true;
                } else if (enemy.battleshipTable.table[vertical][horizontal] == "C5"){
                    enemy.battleshipTable.table[vertical][horizontal] = " H";
                    keepScoreTable.table[vertical][horizontal] = " H";
                    System.out.println("HIT!");
                    Shot.play();
                    enemy.battleshipTable.sunkenShip("C5");
                    return true;
                } else if (enemy.battleshipTable.table[vertical][horizontal] == "D2"){
                    enemy.battleshipTable.table[vertical][horizontal] = " H";
                    keepScoreTable.table[vertical][horizontal] = " H";
                    System.out.println("HIT!");
                    Shot.play();
                    enemy.battleshipTable.sunkenShip("D2");
                    return true;
                } else if (enemy.battleshipTable.table[vertical][horizontal] == "C3"){
                    enemy.battleshipTable.table[vertical][horizontal] = " H";
                    keepScoreTable.table[vertical][horizontal] = " H";
                    System.out.println("HIT!");
                    Shot.play();
                    enemy.battleshipTable.sunkenShip("C3");
                    return true;
                } else if (enemy.battleshipTable.table[vertical][horizontal] == "B4"){
                    enemy.battleshipTable.table[vertical][horizontal] = " H";
                    keepScoreTable.table[vertical][horizontal] = " H";
                    System.out.println("HIT!");
                    Shot.play();
                    enemy.battleshipTable.sunkenShip("B4");
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException aioobex){
            System.out.println("WRONG COORDINATES!");
            return false;
        }
    }

    // PLACING BATTLESHIP
    public void battleshipPlace(int vertical, int horizontal, String direction, Battleships battleship){
            if (direction.equals("up")) {
                for (int i = 0; i < battleship.shipLength; i++) {
                    battleshipTable.table[vertical-i][horizontal]=battleship.representation;
                }
            }
            else if (direction.equals("down")) {
                for (int i = 0; i < battleship.shipLength; i++) {
                    battleshipTable.table[vertical + i][horizontal] = battleship.representation;
                }
            }
            else if (direction.equals("left")) {
                for (int i = 0; i < battleship.shipLength; i++) {
                    battleshipTable.table[vertical][horizontal - i] = battleship.representation;
                }
            } else if (direction.equals("right")) {
                for (int i = 0; i < battleship.shipLength; i++) {
                    battleshipTable.table[vertical][horizontal+i] = battleship.representation;
                }
            }
            battleship.placed=true;
    }

}


