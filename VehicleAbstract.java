// Abstract base class
abstract class Vehicle {
    // Attributes
    String vehicleId;
    String brand;
    String model;
    int year;
    double mileage;
    String fuelType;
    String status;

    // Abstract methods (must be implemented by subclasses)
    abstract void displayInfo();
    abstract void updateStatus(String newStatus);
    abstract int calculateAge();
}

// Car class (inherits from Vehicle)
class Car extends Vehicle {
    int seatingCapacity;
    String transmission;
    double trunkCapacity;

    // Implementing abstract methods
    void displayInfo() {
        System.out.println("----- Car Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Status: " + status);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Transmission: " + transmission);
        System.out.println("Trunk Capacity: " + trunkCapacity + " L");
    }

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    int calculateAge() {
        return 2025 - year;
    }

    double calculateRentalPrice(int days) {
        return days * 50.0; // Example rate
    }

    void displayCarInfo() {
        displayInfo();
    }
}

// Truck class
class Truck extends Vehicle {
    double cargoCapacity;
    int numberOfWheels;

    void displayInfo() {
        System.out.println("----- Truck Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Status: " + status);
    }

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    int calculateAge() {
        return 2025 - year;
    }

    void checkLoadLimit(double weight) {
        if (weight > cargoCapacity) {
            System.out.println("Overload! Weight exceeds capacity.");
        } else {
            System.out.println("Load within limit.");
        }
    }

    void displayTruckInfo() {
        displayInfo();
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    int engineCC;
    boolean hasSidecar;

    void displayInfo() {
        System.out.println("----- Motorcycle Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Sidecar: " + hasSidecar);
        System.out.println("Status: " + status);
    }

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    int calculateAge() {
        return 2025 - year;
    }

    double calculateFuelEfficiency() {
        return 1000.0 / engineCC * 40; // simple logic for demo
    }
}

// ElectricCar class
class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;
    double rangePerCharge;

    void displayInfo() {
        System.out.println("----- Electric Car Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
        System.out.println("Range: " + rangePerCharge + " km");
        System.out.println("Status: " + status);
    }

    double calculateChargeCost(double pricePerKwh) {
        return pricePerKwh * batteryCapacity;
    }
}

public class VehicleAbstract {
    public static void main(String[] args) {
        // Create and fill a Car object
        Car c = new Car();
        c.vehicleId = "C101";
        c.brand = "Toyota";
        c.model = "Corolla";
        c.year = 2020;
        c.mileage = 45000;
        c.fuelType = "Petrol";
        c.status = "Available";
        c.seatingCapacity = 5;
        c.transmission = "Automatic";
        c.trunkCapacity = 470;

        c.displayCarInfo();
        System.out.println("Car Age: " + c.calculateAge());
        System.out.println("Rental Price (5 days): $" + c.calculateRentalPrice(5));

        // Electric Car Example
        ElectricCar e = new ElectricCar();
        e.vehicleId = "E101";
        e.brand = "Tesla";
        e.model = "Model 3";
        e.year = 2022;
        e.batteryCapacity = 75;
        e.chargingTime = 8;
        e.rangePerCharge = 500;
        e.status = "Available";

        e.displayInfo();
        System.out.println("Charge Cost (₹12 per kWh): ₹" + e.calculateChargeCost(12));
    }
}
