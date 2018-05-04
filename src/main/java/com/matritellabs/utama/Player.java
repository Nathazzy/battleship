package main.java.com.matritellabs.utama;

public class Player {

    public String nickname;
    public ScoreTable keepScoreTable = new ScoreTable();
    public BattleshipTable battleshipTable = new BattleshipTable();

    public Player(String nickname){
        this.nickname = nickname;
    }

    public boolean shoot(int vertical, int horizontal, Player enemy){
        if (enemy.battleshipTable.table[vertical][horizontal]!=" H"&& enemy.battleshipTable.table[vertical][horizontal]!=" X"){
            if (enemy.battleshipTable.table[vertical][horizontal]==" O"){
                enemy.battleshipTable.table[vertical][horizontal]=" X";
                keepScoreTable.table[vertical][horizontal]=" X";
                System.out.println("MISSED!");
                return true;
            } else {
                enemy.battleshipTable.table[vertical][horizontal]=" H";
                keepScoreTable.table[vertical][horizontal]=" H";
                System.out.println("HIT!");
                return true;
            }
        } else { return false; }
    }

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


