import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer greater than 5: ");
        int userNumber = scanner.nextInt();


        while (!(userNumber > 5)) {
            System.out.print("Try again: ");
            userNumber = scanner.nextInt();
        }
        int num = 0;
        while (num < userNumber) {
            System.out.println(num);
            num ++;
        }
        System.out.println("and finally " + userNumber);
    }
}