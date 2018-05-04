package main.java.com.matritellabs.utama;

public abstract class Table {

    public String[][] table = new String[10][10];

    /////Koordináta fordító!!!/////


    public static int[] coordinateInterpreter(String coordinate) {


        int[] returnArray = new int[2];
        boolean validCoordinate = false;
        char[] charArray = coordinate.toCharArray();

        if (charArray[0] >= 'A' && charArray[0] <= 'J') {
            returnArray[0] = charArray[0] - 65;

            validCoordinate = true;
        }
        if (charArray.length > 2) {
            if (charArray[1] >= '1' && charArray[1] <= '9' && validCoordinate) {
                if (charArray[1] == '1' && charArray[2] == '0') {
                    returnArray[1] = 9;
                } else {
                    returnArray[1] = charArray[1] - 49;
                }
            } else {
                validCoordinate = false;
            }
        } else if (charArray[1] >= '1' && charArray[1] <= '9' && validCoordinate) {
            returnArray[1] = charArray[1] - 49;
        } else {
            validCoordinate = false;
        }

        if (!validCoordinate) {
            returnArray[0] = 70;
            returnArray[1] = 70;

        }

        return returnArray;
    }


    public void printoutTable() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("");
        System.out.println("     1     2     3     4     5     6     7     8     9    10  ");
        System.out.println("  -------------------------------------------------------------");
        for (int count = 0; count < 10; count++) {
            if (count != 9) {
                System.out.print((char) ('A' + count) + " | ");
            } else {
                System.out.print((char) ('A' + count) + " | ");
            }
            for (int count2 = 0; count2 < 10; count2++) {
                System.out.print(table[count][count2] + "  | ");
            }

            System.out.println();
            System.out.println("  -------------------------------------------------------------");
        }
        System.out.println("");
    }
}



