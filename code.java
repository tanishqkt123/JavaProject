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
    void generateBill() {
        System.out.println("Bill Generated: Rs. 2500");
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

        Vehicle v = new Vehicle(no, model);

        ServiceManager sm = new ServiceManager();
        ServiceRecord sr = new ServiceRecord();
        BillingManager bm = new BillingManager();

        System.out.println();

        c.requestService();
        sm.checkVehicle(v);
        sm.confirmBooking();
        sr.createRecord();
        bm.generateBill();

        System.out.println("Vehicle service completed successfully.");

        sc.close();
    }
}