/*package main.java.com.matritellabs.utama;

public class Player {

    public String nickname;
    public ScoreTable keepScoreTable = new ScoreTable();
    public BattleshipTable battleshipTable = new BattleshipTable();

    public Player(String nickname){
        this.nickname = nickname;
    }

    public boolean shoot(int vertical, int horizontal){
        if (battleshipTable.table[vertical][horizontal]!="H"&& battleshipTable.table[vertical][horizontal]!="X"){
            if (battleshipTable.table[vertical][horizontal]=="O"){
                battleshipTable.table[vertical][horizontal]="X";
                keepScoreTable.table[vertical][horizontal]="X";
                return true;
            } else {
                battleshipTable.table[vertical][horizontal]="H";
                keepScoreTable.table[vertical][horizontal]="H";
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
*/

