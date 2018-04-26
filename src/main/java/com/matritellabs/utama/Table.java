package main.java.com.matritellabs.utama;

public abstract class Table {
    public static void main(String[] args) {
        ScoreTable scoreT = new ScoreTable();
        scoreT.printoutTable();
    }

    public String[][] table = new String[10][10];

    /////Koordináta fordító!!!/////

    public static int[] coordinateInterpreter(String coordinate){
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


    public void printoutTable(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println();
        for(int count = 0; count < 10; count++){
                for(int count2 = 0; count2 < 10; count2++){
                    System.out.print(table[count][count2] + " ");
                }
            System.out.println();
            }
        }



    }

