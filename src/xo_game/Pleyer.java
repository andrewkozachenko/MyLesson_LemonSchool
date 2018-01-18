package xo_game;

import java.util.Scanner;

public class Pleyer {
    private int[] turns = new int[5];
    private int turnCount;
    private String name;
    Scanner input = new Scanner(System.in);


    public Pleyer( String name ){
        this.name = name;
    }

    private String combination( int[] turns ) {
        String str= "";

        for (int i = 0; i < turns.length; i++) {
            if (turns[i] == 0) {
                continue;
            }
            for (int j = 0; j < turns.length; j++) {
                if (turns[j] == 0) {
                    continue;
                }
                for (int k = 0; k < turns.length; k++) {
                    if (turns[k] == 0) {
                        continue;
                    }
                    if (turns[i] != turns[j] && turns[i] != turns[k] && turns[k] != turns[j]) {
                        str += turns[i] + "" + turns[j] + "" + turns[k] + ",";
                    }
                }
            }
        }

        return str;
    }
    private String[] combiSplit( String numbers){
        String[] splitArray;
        String delimiter = ",";
        splitArray = numbers.split(delimiter);

        return splitArray;
    }

    int makerTurn(){
        int turn = input.nextInt();
        for (int num : XOField.getTurnList()){
            if(num == turn){
                System.out.println("Такой ход уже есть");
                turn = makerTurn();
                break;
            }
        }
        return turn;
    }
    public void addPlayerTurn(){
        if (turnCount <= 4) {
            int turn = makerTurn();
            turns[turnCount] = turn;
            XOField.addTurnToTernList(turn);
            turnCount++;
            XOField.addGameTurns();
        }
    }

        public boolean isWin() {
         return  XOField.isWin(combiSplit(combination(turns)));
        }

        public String getName(){
        return name;
        }
        public int getTurnCount(){
            return turnCount;
        }
    }


