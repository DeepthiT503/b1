import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second Number");
        double num2 = sc.nextDouble();
        System.out.println("enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int choice = sc.nextInt();
        double num3;
        switch (choice){
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
        }
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
    }
}
