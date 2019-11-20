package gr10workshop;

import java.util.UUID;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(String name, UUID id, double value) {
        super(name, id, "Temperature", value);
    }
    
    @Override
    double getValue() {
        return this.value;
    }

    @Override
    void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Sensor name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
