import xo_game.Pleyer;
import xo_game.XOField;

import java.util.Scanner;

public class Field {

    public static void main( String[] args ) {

        Pleyer pleyer1 = new Pleyer("Игрок 1");
        Pleyer pleyer2 = new Pleyer("Игрок 2");

        while (true){
            System.out.println("Ходит "+ pleyer1.getName() +": Х ");
            pleyer1.addPlayerTurn();
            if((pleyer1.getTurnCount() >= 3)){
                if(pleyer1.isWin()){
                    System.out.println(pleyer1.getName() + " выиграл!!!");
                    break;
                }
                if(XOField.getGameTurns() > 8){
                    System.out.println("Ничья.");
                    break;
                }
            }

            System.out.println("Ходит "+ pleyer2.getName() +": O ");
            pleyer2.addPlayerTurn();
            if (pleyer2.getTurnCount() >= 3){
                if (pleyer2.isWin()){
                    System.out.println(pleyer2.getName() + " выиграл!!!");
                    break;
                }
            }
        }


    }
}