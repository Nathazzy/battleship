package main.java.com.matritellabs.utama;

import com.sun.javafx.scene.control.TableColumnSortTypeWrapper;
import main.java.com.matritellabs.utama.helper.LineByLineReader;

public class Player {

    public String nickname;
    public ScoreTable keepScoreTable = new ScoreTable();
    public BattleShipTable battleShipTable = new BattleShipTable();

    public Player(String nickname){
        this.nickname = nickname;
    }

    public boolean shoot(int vertical, int horizontal){
        if (BattleShipTable.table[vertical][horizontal]!="H"&&BattleShipTable.table[vertical][horizontal]!="X"){
            if (BattleShipTable.table[vertical][horizontal]=="O"){
                BattleShipTable.table[vertical][horizontal]!="X";
                return true;
            } else {
                BattleShipTable.table[vertical][horizontal]="H";
                return true;
            }
        } else { return false; }
    }

    public void battleshipPlace(int vertical, int horizontal, String direction, Battleships battleship){

    }



    public int[] coordinateInterpreter(String coordinate){
        int[] returnArray = new int[2];
        char[] charArray = coordinate.toCharArray();
        for (int i = 0; i<charArray.length; i++){
            if (charArray[0]>=65&&charArray[0]<=74){
                returnArray[0]=charArray[0]-65;
            }
            if (charArray[1]>=48&&charArray[1]<=57){
                returnArray[1]=charArray[1]-49;
            }
        }
        return returnArray;
    }



//    battleshipPlace(String hovateszed,String merreteszed, Battleship ahajó){
//        if (this.placeable(String hovateszed,String merreteszed, Battleship ahajó)==true)
//            leteszi
//        else
//            System.out.println("Cant put that ship there");
//        System.out.println("Write your "+ahajó+"'s coordinate and direction");
//        player1.battleshipPlace(LineByLineReader,LineByLineReader,cruiser);
//    }


}



