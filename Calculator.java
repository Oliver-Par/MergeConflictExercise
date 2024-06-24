import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char operator;
        boolean correctOperator;
        boolean exit = false;

        do {
            correctOperator = false;

            do {
                System.out.println("Enter your operator:");
                operator = scn.next().charAt(0);
                if (operator == 'q'){
                    exit = true;
                    break;
                }else if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    correctOperator = true;
                }
            }
            while (!correctOperator);

            System.out.println("Enter the first number:");
            double num1 = scn.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scn.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Sum: " + (num1 + num2));
                    break;

                case '-':
                    System.out.println("Dif: " + (num1 - num2));
                    break;

                case '*':
                    System.out.println("Prod: " + (num1 * num2));
                    break;

                case '/':
                    System.out.println("Quo: " + (num1 / num2));
                    break;
            }
        }while (!exit);
        System.out.println("Good bye!");
    }
}
