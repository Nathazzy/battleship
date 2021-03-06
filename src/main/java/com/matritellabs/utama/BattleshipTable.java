package main.java.com.matritellabs.utama;

public class BattleshipTable extends Table {


    public BattleshipTable() {

        for(int count = 0; count < 10; count++){
            for(int count2 = 0; count2 < 10; count2++){
                table[count][count2] = " O";
            }
        }
    }

    // SHOOT METHOD USES THIS METHOD TO PRINT OUT IF THE SHIP THAT HAS BEEN SHOT WAS SUNKEN OR NOT
    public void sunkenShip(String shipRepresentation) {
        boolean sunken = true;
        if (shipRepresentation.equals("S3")) {
            for (int i = 0; i <  table.length; i++) {
                for (int j = 0; j < table[i].length ; j++) {
                    if (table[i][j].equals("S3")){
                        sunken = false;
                    }
                }
            }
            if (sunken) {
                System.out.println("Submarine sunken!");
            }
        } else if (shipRepresentation.equals("C5")) {
            for (int i = 0; i <  table.length; i++) {
                for (int j = 0; j < table[i].length ; j++) {
                    if (table[i][j].equals("C5")){
                        sunken = false;
                    }
                }
            }
            if (sunken) {
                System.out.println("Carrier sunken!");
            }
        } else if (shipRepresentation.equals("D2")) {
            for (int i = 0; i <  table.length; i++) {
                for (int j = 0; j < table[i].length ; j++) {
                    if (table[i][j].equals("D2")){
                        sunken = false;
                    }
                }
            }
            if (sunken) {
                System.out.println("Destroyer sunken!");
            }
        } else if (shipRepresentation.equals("C3")) {
            for (int i = 0; i <  table.length; i++) {
                for (int j = 0; j < table[i].length ; j++) {
                    if (table[i][j].equals("C3")){
                        sunken = false;
                    }
                }
            }
            if (sunken) {
                System.out.println("Cruiser sunken!");
            }
        } else if (shipRepresentation.equals("B4")) {
            for (int i = 0; i <  table.length; i++) {
                for (int j = 0; j < table[i].length ; j++) {
                    if (table[i][j].equals("B4")){
                        sunken = false;
                    }
                }
            }
            if (sunken) {
                System.out.println("Battleship sunken!");
            }
        }
    }

    // PRINTS OUT THE ALREADY SUNKEN SHIPS
    public void alreadySunkenShips() {
        boolean carrier = false;
        boolean cruiser = false;
        boolean destroyer = false;
        boolean submarine = false;
        boolean battleship = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j].equals("S3")) {
                    submarine = true;
                } else if (table[i][j].equals("C5")) {
                    carrier = true;
                } else if (table[i][j].equals("D2")) {
                    destroyer = true;
                } else if (table[i][j].equals("C3")) {
                    cruiser = true;
                } else if (table[i][j].equals("C5")) {
                    carrier = true;
                } else if (table[i][j].equals("B4")) {
                    battleship = true;
                }
            }
        }

        if (!carrier) {
            System.out.println("Carrier sunken!");
        }
        if (!cruiser) {
            System.out.println("Cruiser sunken!");
        }
        if (!destroyer) {
            System.out.println("Destroyer sunken!");
        }
        if (!submarine) {
            System.out.println("Submarine sunken!");
        }
        if (!battleship) {
            System.out.println("Battleship sunken!");
        }
    }

    // CHECK'S IF THERE IS ANY SHIPS LEFT ON THE ENEMY'S TABLE
    public boolean checkIfGameEnded(){
        boolean gameEnded = true;
        for (int i = 0; i < table.length&&gameEnded; i++) {
            for (int j = 0; j < table[i].length&&gameEnded; j++) {
                if (table[i][j].equals("S3")) {
                    gameEnded = false;
                } else if (table[i][j].equals("C5")) {
                    gameEnded = false;
                } else if (table[i][j].equals("D2")) {
                    gameEnded = false;
                } else if (table[i][j].equals("C3")) {
                    gameEnded = false;
                } else if (table[i][j].equals("C5")) {
                    gameEnded = false;
                } else if (table[i][j].equals("B4")) {
                    gameEnded = false;
                }
            }
        }
        return gameEnded;
    }

    // CHECK'S IF THE SHIP IS PLACEABLE THERE OR NOT
    public boolean placeable(int vertical, int horizontal, String direction, Battleships battleship) throws  NullPointerException, ArrayIndexOutOfBoundsException {
        boolean ifPlaceable = false;
        if (direction.equals("up")) {
            for (int i = 0; i < battleship.shipLength; i++) {
                if (!this.table[vertical-i][horizontal].equals(" O")) {
                    return false;
                } else {
                    ifPlaceable = true;
                }
            }
        }
        else if (direction.equals("down")) {
            for (int i = 0; i < battleship.shipLength; i++) {
                if (!this.table[vertical+i][horizontal].equals(" O")) {
                    return false;
                } else {
                    ifPlaceable = true;
                }
            }
        }
        else if (direction.equals("left")) {
            for (int i = 0; i < battleship.shipLength; i++) {
                if (!this.table[vertical][horizontal-i].equals(" O")) {
                    return false;
                } else {
                    ifPlaceable = true;
                }
            }
        } else if (direction.equals("right")) {
            for (int i = 0; i < battleship.shipLength; i++) {
                if (!this.table[vertical][horizontal+i].equals(" O")) {
                    return false;
                } else {
                    ifPlaceable = true;
                }
            }
        }

        return ifPlaceable;
    }

}
