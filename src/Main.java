import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int num = userNumber;
        int timesHalf = 0;
        if (userNumber == 0) {
            System.out.println("It takes 0 halvings to get from 0 to 1");
        } else {
            while (num != 1) {
                num /= 2;
                System.out.println(num);
                timesHalf++;
            }
            System.out.println("It takes " + timesHalf + " halvings to get from " + userNumber + " to 1.");
        }
    }
}