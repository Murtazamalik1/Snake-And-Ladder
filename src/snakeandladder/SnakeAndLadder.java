package snakeandladder;

public class SnakeAndLadder {
    static final int START_POSITION = 0;
    public static void main(String[] args) {
        System.out.println("WelCome To Snake And Ladder");
        int dieNumber = (int) (Math.random() * 10) % 6+1;
        System.out.println(dieNumber);
    }
}
