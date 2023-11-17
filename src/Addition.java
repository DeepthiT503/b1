import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the First Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second Number");
        double num2 = sc.nextDouble();
        System.out.println("enter your choice\n1.Addition\n2.Subtraction");
        int choice = sc.nextInt();
        double num3;
        if(choice==1){
            num3=num1+num2;
            System.out.println("Addition of two numbers is: " + num3);
        }
        else if(choice==2){
            num3=num1-num2;
            System.out.println("Subtraction of two numbers is: " + num3);
        }
        else {
            System.out.println("Invalid Input");
        }
    }

}
