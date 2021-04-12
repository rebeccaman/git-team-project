import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number:");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println();
        System.out.println("What would you like to do:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        int userInput = scanner.nextInt();
        System.out.println();

        if (userInput == 1){
            System.out.println("Addition result:" + addition(num1,num2));
        }
    }

    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b) {
        return a-b;
    }

    public static int multiplication (int a, int b){
        return a*b;
    }

}
