// Interface for Vehicle
interface Vehicle {
    // display vehicle details
    void updateStatus(String status);
    int calculateAge();              // calculate vehicle age
}

class BasicInfo {
    String vehicleId, brand, model, fuelType, status;
    int year;
    double mileage;

     // Constructor
    BasicInfo(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.status = status;
    }
    public void displayInfo() {
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Status: " + status);
    }

}

// Car class implementing Vehicle interface
class Car extends BasicInfo implements Vehicle {
    String transmission;
    int seatingCapacity;
    double trunkCapacity;

    // Constructor
    Car(String vehicleId, String brand, String model, int year, double mileage,
        String fuelType, String status, int seatingCapacity, String transmission, double trunkCapacity) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.seatingCapacity = seatingCapacity;
        this.transmission = transmission;
        this.trunkCapacity = trunkCapacity;
    }

    // Implement interface methods
    public void displayInfoCar() {        
        System.out.println("----- Car Details -----");
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Transmission: " + transmission);
        System.out.println("Trunk Capacity: " + trunkCapacity + " L");
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    public int calculateAge() {
        return 2025 - year;
    }

    // Car-specific method
    double calculateRentalPrice(int days) {
        return days * 50.0;
    }
}

// Truck class implementing Vehicle interface
class Truck extends BasicInfo implements Vehicle {
    int numberOfWheels;
    double cargoCapacity;

    Truck(String vehicleId, String brand, String model, int year, double mileage,
        String fuelType, String status, double cargoCapacity,
          int numberOfWheels) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.cargoCapacity = cargoCapacity;
        this.numberOfWheels = numberOfWheels;
    }

    public void displayInfoTruck() {        
        System.out.println("----- Truck Details -----");
        displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    public int calculateAge() {
        return 2025 - year;
    }

    void checkLoadLimit(double weight) {
        if (weight > cargoCapacity)
            System.out.println("Overload! Weight exceeds capacity.");
        else
            System.out.println("Load within limit.");
    }
}

// Motorcycle class implementing Vehicle interface
class Motorcycle extends BasicInfo implements Vehicle {
    int engineCC;
    boolean hasSidecar;

    Motorcycle(String vehicleId, String brand, String model, int year, double mileage, String fuelType, String status, int engineCC, boolean hasSidecar) {
        super(vehicleId, brand, model, year, mileage, fuelType, status);
        this.engineCC = engineCC;
        this.hasSidecar = hasSidecar;
    }

    public void displayInfoMotorcycle() {        
        System.out.println("----- Motorcycle Details -----");
        displayInfo();
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Has Sidecar: " + hasSidecar);
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }

    public int calculateAge() {
        return 2025 - year;
    }

    double calculateFuelEfficiency() {
        return 1000.0 / engineCC * 40;
    }
}

// ElectricCar class extending Car
class ElectricCar extends Car {
    double batteryCapacity, chargingTime, rangePerCharge;

    ElectricCar(String vehicleId, String brand, String model, int year, double mileage,
                String fuelType, String status, int seatingCapacity, String transmission,
                double trunkCapacity, double batteryCapacity, double chargingTime, double rangePerCharge) {

        super(vehicleId, brand, model, year, mileage, fuelType, status, seatingCapacity, transmission, trunkCapacity);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        this.rangePerCharge = rangePerCharge;
    }

    
    public void displayInfoECar() {
        System.out.println("----- Electric Car Details -----");
        
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
        System.out.println("Range per Charge: " + rangePerCharge + " km");
    }

    double calculateChargeCost(double pricePerKwh) {
        return batteryCapacity * pricePerKwh;
    }
}

// Main class
class VehicleInterface {
    public static void main(String[] args) {

        // Car object
        Car car = new Car("C101", "Toyota", "Corolla", 2020, 45000, "Petrol", "Available", 5, "Automatic", 470);
        car.displayInfoCar();
        System.out.println("Car Age: " + car.calculateAge());
        System.out.println("Rental Price (5 days): ₹" + car.calculateRentalPrice(5));
        System.out.println();

        // Truck object
        Truck truck = new Truck("T001", "Volvo", "FH16", 2019, 50000, "Diesel", "Rented", 20, 8);
        truck.displayInfoTruck();
        truck.checkLoadLimit(14);
        System.out.println("Truck Age: " + truck.calculateAge());
        System.out.println();

        // Motorcycle object
        Motorcycle bike = new Motorcycle("M001", "Honda", "CBR500R", 2021, 5000, "Petrol", "Available", 500, false);
        bike.displayInfoMotorcycle();
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println();

        // Electric Car object
        ElectricCar ev = new ElectricCar("E401", "Tesla", "Model 3", 2023, 10000, "Electric", "Available", 5, "Automatic", 425, 75, 8, 500);
        ev.displayInfoECar();
        System.out.println("Charge Cost (₹12/kWh): ₹" + ev.calculateChargeCost(12));
    }
}
