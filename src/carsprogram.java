import java.util.Scanner;
class Car{
    String licenseplate;
    String brand;
    String color;
 Car(String licenseplate, String brand, String color){
     this.licenseplate=licenseplate;
     this.brand=brand;
     this.color=color;
 }

    @Override
    public String toString() {
        return "Car{" +
                "licenseplate='" + licenseplate + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
public class carsprogram{
    public static void main(String[] args){
        Car c1 = new Car("ABC121", "Toyota", "red");
        Car c2 = new Car("ABC122", "BMW", "orange");
        Car c3 = new Car("ABC123", "Tata", "red");
        Car c4 = new Car("ABC124", "Hyundai", "yellow");
        Car c5 = new Car("ABC125", "Maruthi", "pink");
        Car c6 = new Car("ABC126", "kia", "blue");
        Car c7 = new Car("ABC127", "Mahindra", "red");
        Car c8 = new Car("ABC128", "benze", "white");
        Car c9 = new Car("ABC129", "honda", "red");
        Car c10 = new Car("ABC1210", "ardi", "black");
        Car[] cars = new Car[13];
        cars[0]=c1;
        cars[1]=c2;
        cars[2]=c3;
        cars[3]=c4;
        cars[4]=c5;
        cars[5]=c6;
        cars[6]=c7;
        cars[7]=c8;
        cars[8]=c9;
        cars[9]=c10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car Name");
        String name = sc.next();
        System.out.println("Enter license plate");
        String lp = sc.next();
        System.out.println("Enter color");
        String co = sc.next();
        Car c11 = new Car(lp,name,co);
        for(int i=0;i<cars.length;i++){
            if(cars[i]==null){
                cars[i]=c11;
                break;

            }
        }
        boolean checkCar = false;
        for(int i=0; i<cars.length; i++) {
            if (cars[i] == null) {
                checkCar = true;
                break;
            }
        }
            if(checkCar){
            System.out.println("Parking space is available");
        }
        else{
            System.out.println("NO parking space");
        }

        for(int i=0; i<cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i]);
            }
        }

    }
}
