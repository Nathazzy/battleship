package main.java.com.matritellabs.utama;

public abstract class Table {

    public String[][] table = new String[10][10];

    /////Koordináta fordító!!!/////


    public static int[] coordinateInterpreter(String coordinate){


        int[] returnArray = new int[2];
        boolean validCoordinate = false;
        char[] charArray = coordinate.toCharArray();


            if (charArray[0]>=65&&charArray[0]<=74){
                returnArray[0]=charArray[0]-65;
                validCoordinate = true;
            }

            if (charArray[1]>=49&&charArray[1]<=57&&validCoordinate){
                if (charArray[1]==49&&charArray[2]==48){
                    returnArray[1]=9;
                } else {
                    returnArray[1] = charArray[1] - 49;
                }
            } else {
                validCoordinate = false;
            }

            if (!validCoordinate){
                returnArray[0] = 70;
                returnArray[1] = 70;

            }

        return returnArray;
    }


    public void printoutTable() {
            System.out.println(this.getClass().getSimpleName());
            System.out.println("");
            System.out.println("  | A | B | C | D | E | F | G | H | I | J |");
            System.out.println("-------------------------------------------");
            for (int count = 0; count < 10; count++) {
                if(count != 9) {
                    System.out.print(count + 1 + " | ");
                } else {
                    System.out.print(count + 1 + "| ");
                }
                for (int count2 = 0; count2 < 10; count2++) {
                    System.out.print(table[count][count2] + " | ");
                }

                System.out.println();
                System.out.println("-------------------------------------------");
            }
        }
    }



