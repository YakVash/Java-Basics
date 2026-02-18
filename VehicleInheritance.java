// Base class
class Vehicle {
    // Static member to keep track of total vehicles
    static int vehicleCount = 0;

    // Attributes
    String vehicleId;
    String brand;
    String model;
    int year;
    double mileage;
    String fuelType;
    String status;

    // Static block
    static {
        System.out.println("Vehicle Management System Initialized!");
    }

    Vehicle() {
        System.out.println("Default Vehicle constructor");
    }

    // Constructor
    Vehicle(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.status = status;
        vehicleCount++;
    }

    // Methods
    void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Status: " + status);
    }

    void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    int calculateAge() {
        return 2025 - year; // Current year as example
    }
}

// Car class
class Car extends Vehicle {
    int seatingCapacity;
    String transmission;
    double trunkCapacity;

    //Default constructor
    Car() {
        super();
        System.out.println("Default Car constructor.");
    }

    // Constructor overloading
    Car(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status,
        int seatingCapacity, String transmission, double trunkCapacity) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.seatingCapacity = seatingCapacity;
        this.transmission = transmission;
        this.trunkCapacity = trunkCapacity;
    }

    void displayCarInfo() {
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Transmission: " + transmission);
        System.out.println("Trunk Capacity: " + trunkCapacity + " liters");
    }

    double calculateRentalPrice(int days) {
        double ratePerDay = 50; // Example rate
        return ratePerDay * days;
    }
}

// Truck class
class Truck extends Vehicle {
    double cargoCapacity;
    int numberOfWheels;

    Truck(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status,
          double cargoCapacity, int numberOfWheels) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.cargoCapacity = cargoCapacity;
        this.numberOfWheels = numberOfWheels;
    }

    void displayTruckInfo() {
        displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    boolean checkLoadLimit(double weight) {
        return weight <= cargoCapacity;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    int engineCC;
    boolean hasSidecar;

    Motorcycle(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status,
               int engineCC, boolean hasSidecar) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.engineCC = engineCC;
        this.hasSidecar = hasSidecar;
    }

    void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Has Sidecar: " + hasSidecar);
    }

    double calculateFuelEfficiency() {
        return 60.0 / engineCC * 100; // Example formula
    }
}

// ElectricCar class multilevel inheritance
class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;
    double rangePerCharge;

    ElectricCar(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status,
                int seatingCapacity, String transmission, double trunkCapacity,
                double batteryCapacity, double chargingTime, double rangePerCharge) {
        super(vehicleId, brand, model, year, mileage, fuelType, status, seatingCapacity, transmission, trunkCapacity);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        this.rangePerCharge = rangePerCharge;
    }

    void displayElectricCarInfo() {
        displayCarInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Range per Charge: " + rangePerCharge + " km");
    }

    double calculateChargeCost(double pricePerKWh) {
        return batteryCapacity * pricePerKWh;
    }
}

// Main class
public class VehicleInheritance {
    public static void main(String[] args) {
        
        Car car1 = new Car("C001", "Toyota", "Corolla", 2020, 15000, "Petrol", "Available", 5, "Automatic", 400);
        ElectricCar eCar1 = new ElectricCar("EC001", "Tesla", "Model 3", 2022, 8000, "Electric", "Available", 5, "Automatic", 300, 75, 1.5, 350);
        Truck truck1 = new Truck("T001", "Volvo", "FH16", 2019, 50000, "Diesel", "Rented", 20, 8);
        Motorcycle bike1 = new Motorcycle("M001", "Honda", "CBR500R", 2021, 5000, "Petrol", "Available", 500, false);
        System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2160005");
        System.out.println("\n--- Car Info ---");
        car1.displayCarInfo();
        System.out.println("Rental Price for 5 days: $" + car1.calculateRentalPrice(5));

        System.out.println("\n--- Electric Car Info ---");
        eCar1.displayElectricCarInfo();
        System.out.println("Charging Cost: $" + eCar1.calculateChargeCost(0.2));

        System.out.println("\n--- Truck Info ---");
        truck1.displayTruckInfo();
        System.out.println("Can carry 18 tons? " + truck1.checkLoadLimit(18));

        System.out.println("\n--- Motorcycle Info ---");
        bike1.displayMotorcycleInfo();
        System.out.println("Fuel Efficiency: " + bike1.calculateFuelEfficiency() + " km/l");

        System.out.println("\nTotal Vehicles: " + Vehicle.vehicleCount);
        System.out.println("Uma(25SP2180005)");
    }
}
