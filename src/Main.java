public class Main {
    public static void main(String[] args) {
        int snakeEye1 = 1;
        int snakeEye2 = 1;
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int rollNum = 1;
        while (snakeEye1 != roll1 || snakeEye2 != roll2) {
            System.out.println("Roll #" + rollNum + ": " + roll1 + " and " + roll2);
            System.out.println("Not snake eyes, rolling again!");
            rollNum ++;
            roll1 = (int) (Math.random() * 6) + 1;
            roll2 = (int) (Math.random() * 6) + 1;
        }
        System.out.println("Roll #" + rollNum + ": " + roll1 + " and " + roll2);
        System.out.println("Finally, snake eyes!");
    }
}