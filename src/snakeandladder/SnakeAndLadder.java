package snakeandladder;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE = 2;
    static final int NO_PLAY = 0;
    static int currentPosition = 0;
    public static void main(String[] args) {
        int dieNumber = (int) (Math.random() * 10) % 6+1;
        int option = (int) (Math.random() * 10) % 3;
        if (option == IF_LADDER){
            currentPosition += dieNumber;
        } else if (option == IF_SNAKE) {
            currentPosition -= dieNumber;
        } else if (option == NO_PLAY) {
            System.out.println("No Play :");
        }
        System.out.println(option);
    }
}
