// Interface for Vehicle
interface Vehicle {
    void displayInfo();              // display vehicle details
    void updateStatus(String status);
    int calculateAge();              // calculate vehicle age
}

// Car class implementing Vehicle interface
class Car implements Vehicle {
    String vehicleId, brand, model, fuelType, status, transmission;
    int year, seatingCapacity;
    double mileage, trunkCapacity;

    // Constructor
    Car(String vehicleId, String brand, String model, int year, double mileage,
        String fuelType, String status, int seatingCapacity, String transmission, double trunkCapacity) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.status = status;
        this.seatingCapacity = seatingCapacity;
        this.transmission = transmission;
        this.trunkCapacity = trunkCapacity;
    }

    // Implement interface methods
    public void displayInfo() {
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
class Truck implements Vehicle {
    String vehicleId, brand, model, status;
    int year, numberOfWheels;
    double cargoCapacity;

    Truck(String vehicleId, String brand, String model, int year, double cargoCapacity,
          int numberOfWheels, String status) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cargoCapacity = cargoCapacity;
        this.numberOfWheels = numberOfWheels;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("----- Truck Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Status: " + status);
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
class Motorcycle implements Vehicle {
    String vehicleId, brand, model, status;
    int year, engineCC;
    boolean hasSidecar;

    Motorcycle(String vehicleId, String brand, String model, int year, int engineCC,
               boolean hasSidecar, String status) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineCC = engineCC;
        this.hasSidecar = hasSidecar;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("----- Motorcycle Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Has Sidecar: " + hasSidecar);
        System.out.println("Status: " + status);
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

    @Override
    public void displayInfo() {
        System.out.println("----- Electric Car Details -----");
        System.out.println("ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
        System.out.println("Range per Charge: " + rangePerCharge + " km");
        System.out.println("Status: " + status);
    }

    double calculateChargeCost(double pricePerKwh) {
        return batteryCapacity * pricePerKwh;
    }
}

// Main class
class VehicleInterface {
    public static void main(String[] args) {

        // Car object
        Car car = new Car("C101", "Toyota", "Corolla", 2020, 45000,
                "Petrol", "Available", 5, "Automatic", 470);
        car.displayInfo();
        System.out.println("Car Age: " + car.calculateAge());
        System.out.println("Rental Price (5 days): ₹" + car.calculateRentalPrice(5));
        System.out.println();

        // Truck object
        Truck truck = new Truck("T201", "Tata", "HaulMax", 2018, 12, 10, "Available");
        truck.displayInfo();
        truck.checkLoadLimit(14);
        System.out.println("Truck Age: " + truck.calculateAge());
        System.out.println();

        // Motorcycle object
        Motorcycle bike = new Motorcycle("M301", "Yamaha", "R15", 2022, 155, false, "Available");
        bike.displayInfo();
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
        System.out.println();

        // Electric Car object
        ElectricCar ev = new ElectricCar("E401", "Tesla", "Model 3", 2023, 10000,
                "Electric", "Available", 5, "Automatic", 425,
                75, 8, 500);
        ev.displayInfo();
        System.out.println("Charge Cost (₹12/kWh): ₹" + ev.calculateChargeCost(12));
    }
}
