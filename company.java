
class Car {
    
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public void displayDetails() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }
}

public class company {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Camry", 2020);
        Car myCar2 = new Car("Bmw", "M320", 2024);


        myCar.displayDetails();
    }
}
