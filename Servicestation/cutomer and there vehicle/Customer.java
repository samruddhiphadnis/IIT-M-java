

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

public class Customer implements Serializable {
    private String customerId;
    private String name;
    private HashMap<String, Vehicle> vehicleList;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.vehicleList = new HashMap<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.put(vehicle.getVehicleId(), vehicle);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}
