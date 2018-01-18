package xo_game;

public class XOField {
    private static int gameTurn = 0;
    private static int[] turnList = new int[9];
    private static String winCombination = " " +
            "123" + " " +
            "456" + " " +
            "789" + " " +
            "147" + " " +
            "258" + " " +
            "369" + " " +
            "159" + " " +
            "357" + " " ;

    public static String getWinCombination() {
        return winCombination;
    }


    static boolean isWin(String[] combination){
        boolean isWin = false;
        for (String com :  combination){
            if(getWinCombination().contains(String.valueOf(com))){
                System.out.println("Combination :" + com);
                isWin = true;
                break;
            }
        }
        return isWin;
    }

    public static int[] getTurnList() {
        return turnList;
    }

    public static int getGameTurns(){
        return gameTurn;
    }
    static void addGameTurns(){
        gameTurn++;
    }

    public static void addTurnToTernList( int turn ) {
        turnList[gameTurn] = turn;
    }
}
