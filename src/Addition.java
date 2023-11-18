import java.util.Scanner;
public class Addition{
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

       /* public static void addition(){
            System.out.println("static");
        }
        public void addition1(){
            System.out.println("object");
        }
        public static void main(String[] args) {
            System.out.println("Welcome to the Calculator");
            Addition a1 = new Addition();
            a1.addition1();
            addition();
        }}
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second Number");
        double num2 = sc.nextDouble();
        System.out.println("enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int choice = sc.nextInt();
        double num3;*/
       /* switch (choice){
            case 1:
                num3 = num1 + num2;
                System.out.println("Addition of Your Input is: " +num3);
                break;
            case 2:
                num3 = num1 -num2;
                System.out.println("Subtraction of Your Input is: " +num3);
                break;
            case 3:
                num3 = num1 * num2;
                System.out.println("Multiplication of Your Input is: " +num3);
                break;
            case 4:
                num3 = num1/num2;
                System.out.println("Division of Your Input is: " + num3);
                break;
            default:
                System.out.println("Invalid Input");
        }*/
       /* if(choice==1){
            num3=num1 + num2;
            System.out.println("Addition of two numbers is: " + num3);
        }
        else if(choice==2) {
            num3 = num1 - num2;
            System.out.println("Addition of two numbers is: " + num3);
        }
        else {
            System.out.println("Invalid Input");
        }*/
