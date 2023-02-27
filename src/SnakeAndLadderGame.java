public class SnakeAndLadderGame {
    static final int START_POSITION = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static final int NO_PLAY = 0;
    static int player1Position1 = 0;
    static  int playerPosition2 = 0;

    static final int MAX_POSITION = 100;
     static int die = 0;

    public enum CurrentPlayer{
        PLAYER, COMPUTER
    }

    static CurrentPlayer toss() {
        if ((int) (Math.random() * 10) + 2 == 1) {
            return CurrentPlayer.PLAYER;
        }
        else {
            return CurrentPlayer.COMPUTER;
        }
    }
    public static void main(String[] args) {
        CurrentPlayer currentPlayer = toss();
        while (player1Position1 < 100 && playerPosition2 < 100) {
            int dieNumber = (int) (Math.random() * 10) & 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            switch (option){
                case IF_LADDER:
                    if (currentPlayer == currentPlayer.PLAYER){
                        player1Position1 += dieNumber;

                        if (player1Position1 > MAX_POSITION){
                            player1Position1 -= dieNumber;
                        }
                    }
                    else {
                        playerPosition2 += dieNumber;
                        if (playerPosition2 > MAX_POSITION){
                            playerPosition2 -= dieNumber;
                        }
                    }
                    break;
                case IF_SNAKE:
                    if (currentPlayer == CurrentPlayer.PLAYER){
                        player1Position1 -= dieNumber;
                        if (player1Position1 < START_POSITION){

                            player1Position1 = 0;
                        }
                    }
                    else {
                        playerPosition2 -= dieNumber;
                        if (playerPosition2 < START_POSITION){
                            playerPosition2 = 0;
                        }
                    }
                    currentPlayer = (currentPlayer == CurrentPlayer.PLAYER) ? CurrentPlayer.COMPUTER : CurrentPlayer.PLAYER;
                    break;
                default:
                    if (option == NO_PLAY){
                        System.out.println("No Play");
                    }

            }
            System.out.println("current position of player1 is :" + player1Position1);
            System.out.println("current position of player2 is :" + playerPosition2);
            die++;
        }
        System.out.println("Total number of times die :" + die);
        System.out.println(currentPlayer + " win the game");
    }
}
