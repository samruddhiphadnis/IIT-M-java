import java.io.*;
import java.util.*;

public class Program {
    private static final String FILE_PATH = "customerData.sun";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Customer> customerMap = loadCustomersFromFile();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Customer");
            System.out.println("2. Find Customer by Name and Display Vehicles");
           
           
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    // Add Customer
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();

                    Customer customer = new Customer(customerId, customerName);
                    customerMap.put(customerId, customer);
                    saveCustomersToFile(customerMap);
                    System.out.println("Customer added: " + customer);  
                    break;

                case 2:
                    // Find Customer by Name and Display Vehicles
                    System.out.print("Enter Customer Name to search: ");
                    String customerNameSearch = scanner.nextLine();

                    Customer foundCustomerByName = null;
                    for (Customer c : customerMap.values()) {
                        if (c.getName().equalsIgnoreCase(customerNameSearch)) {
                            foundCustomerByName = c;
                            break;
                        }
                    }

                    if (foundCustomerByName != null) {
                        System.out.println("Customer found: " + foundCustomerByName);
                        System.out.println("Vehicles:");
                        HashMap<String, Vehicle> vehicles = foundCustomerByName.getVehicleList();
                        if (vehicles.isEmpty()) {
                            System.out.println("No vehicles found for this customer.");
                        } else {
                            for (Vehicle v : vehicles.values()) {
                                System.out.println(v);
                            }
                        }

                        
                        System.out.print("Do you want to add a new vehicle? (yes/no): ");
                        String response = scanner.nextLine();
                        if (response.equalsIgnoreCase("yes")) {
                            System.out.print("Enter Vehicle ID: ");
                            String vehicleId = scanner.nextLine();
                            System.out.print("Enter Vehicle Type: ");
                            String vehicleType = scanner.nextLine();

                            Vehicle newVehicle = new Vehicle(vehicleId, vehicleType);
                            foundCustomerByName.addVehicle(newVehicle);
                            saveCustomersToFile(customerMap);
                            System.out.println("Vehicle added to customer: " + foundCustomerByName);
                        }
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static Map<String, Customer> loadCustomersFromFile() {
        Map<String, Customer> customerMap = new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            customerMap = (Map<String, Customer>) ois.readObject();
            
            System.out.println("Loaded customers from file: " + customerMap); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing customer data found, starting fresh.");
        }
        return customerMap;
    }

    private static void saveCustomersToFile(Map<String, Customer> customerMap) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(customerMap);
            System.out.println("Customers saved to file: " + customerMap); 
        } catch (IOException e) {
            System.out.println("Error saving customer data.");
        }
    }
}
