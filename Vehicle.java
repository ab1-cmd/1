package anilkali;

public class Vehicle {
    int no_of_seats;
    int no_of_wheels;
    String regNo;
    int modelNo;

    public Vehicle(int seats, int wheels, String reg, int model) {
        no_of_seats = seats;
        no_of_wheels = wheels;
        regNo = reg;
        modelNo = model;
    }

    public void showVehicle() {
        System.out.println("Number of seats: " + no_of_seats);
        System.out.println("Number of wheels: " + no_of_wheels);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Model Number: " + modelNo);
    }

    public static void main(String[] args) {
        Vehicle motorcycle = new Vehicle(2, 2, "TN7412345", 2021);
        System.out.println("Motorcycle:");
        motorcycle.showVehicle();

        Vehicle car = new Vehicle(5, 4, "MP20482002", 2022);
        System.out.println("\nCar:");
        car.showVehicle();
    }
}
