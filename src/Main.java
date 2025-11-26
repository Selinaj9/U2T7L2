import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        int userNumber = scanner.nextInt();


        while ( userNumber < 0 || userNumber > 170 ) {
            System.out.print("No! Between 0 and 170: ");
            userNumber = scanner.nextInt();
        }


        double i = 1;
        double num = i;
        while (i < userNumber) {
            num *= i + 1;
            i ++;
        }
        System.out.println(userNumber + "! is " + num);
    }
}