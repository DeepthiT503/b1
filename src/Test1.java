import java.util.Scanner;
public class Test1{
    public static double addition(double a, double b){
        return a+b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Calculator");
        int option=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your First Number: ");
            double a = sc.nextDouble();
            System.out.println("Enter Your Second Number: ");
            double b = sc.nextDouble();
            System.out.println("Enter Your Choice\n1:Addition\n2:Subtraction:\n3:Multiplication\n4:Division");
            double c;
            int choice = sc.nextInt();
            switch(choice) {
                case 1: System.out.println("Addition of Your Input is :" + addition(a, b));
                break;
                case 2: System.out.println("Addition of Your Input is :" + subtraction(a, b));
                break;
                case 3: System.out.println("Addition of Your Input is :" + multiplication(a, b));
                break;
                case 4: System.out.println("Addition of Your Input is :" + division(a, b));
                break;
                default: System.out.println("Invalid option");
            }
        }while(option!=1);
        }
    }
