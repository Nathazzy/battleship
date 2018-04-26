package main.java.com.matritellabs.utama;

public class ScoreTable extends Table {

    public ScoreTable() {
        for(int count = 0; count < 10; count++){
            for(int count2 = 0; count2 < 10; count2++){
                table[count][count2] = "O";
            }
        }
    }
}
