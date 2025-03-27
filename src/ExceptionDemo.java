import java.util.Scanner;

public class ExceptionDemo {

    private double divisor;
    private double dividend;
    private double result;
    public void divide(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number for dividend: ");
         dividend = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter a number for divisor: ");
             divisor = Integer.parseInt(scanner.nextLine());

             result = divisor / dividend;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An exception occurred");
            System.out.println("Exception message: " + e.getMessage());
        } 
    }
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.divide();
    }
    }

