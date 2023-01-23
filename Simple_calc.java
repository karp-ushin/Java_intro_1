import java.util.Scanner;

public class Simple_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first_number = sc.nextDouble();
        System.out.println("Enter operation: ");
        String operation = sc.next();
        System.out.println("Enter second number: ");
        double second_number = sc.nextDouble();
        sc.close();
        if(operation.equals("+")){
            System.out.println("Result will be: " + (first_number + second_number));
        } else if(operation.equals("-")){
            System.out.println("Result will be: " + (first_number - second_number));
        } else if(operation.equals("*")){
            System.out.println("Result will be: " + (first_number * second_number));
        } else if(operation.equals("/")){
            System.out.println("Result will be: " + (first_number / second_number));
        }
    }
}