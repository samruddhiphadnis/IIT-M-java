import java.io.Serializable;
import java.util.HashSet;

public class Vehicle implements Serializable {
    private String vehicleId;
    private String vehicleType;

    public Vehicle(String vehicleId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Type: " + vehicleType;
    }
}

