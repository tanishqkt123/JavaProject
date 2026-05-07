import java.util.Scanner;

class Customer {
    int customerId;
    String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    void requestService() {
        System.out.println(name + " requested vehicle service.");
    }
}

class Vehicle {
    String vehicleNo;
    String model;
    String status;

    Vehicle(String vehicleNo, String model) {
        this.vehicleNo = vehicleNo;
        this.model = model;
        this.status = "Available";
    }

    void showDetails() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Model: " + model);
        System.out.println("Status: " + status);
    }

    void updateStatus(String newStatus) {
        status = newStatus;
    }
}

class ServiceManager {

    void checkVehicle(Vehicle v) {
        v.showDetails();
    }

    void confirmBooking() {
        System.out.println("Service appointment confirmed.");
    }
}

class ServiceRecord {

    void createRecord() {
        System.out.println("Service record created.");
    }
}

class BillingManager {

    void generateBill(int amount) {
        System.out.println("Bill Generated: Rs. " + amount);
    }
}

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        Customer c = new Customer(id, name);

        System.out.print("Enter Vehicle Number: ");
        String no = sc.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Service Type: ");
        String serviceType = sc.nextLine();

        System.out.print("Enter Service Charge: ");
        int amount = sc.nextInt();

        Vehicle v = new Vehicle(no, model);

        ServiceManager sm = new ServiceManager();
        ServiceRecord sr = new ServiceRecord();
        BillingManager bm = new BillingManager();

        System.out.println();

        c.requestService();

        sm.checkVehicle(v);

        System.out.println("Service Type: " + serviceType);

        sm.confirmBooking();

        v.updateStatus("Serviced");

        System.out.println("Updated Vehicle Status: " + v.status);

        sr.createRecord();

        bm.generateBill(amount);

        System.out.println("Vehicle service completed successfully.");

        sc.close();
    }
}
