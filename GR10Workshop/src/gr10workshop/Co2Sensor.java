package gr10workshop;

import java.util.UUID;

public class Co2Sensor extends Sensor {
    public Co2Sensor(String name, UUID id, double value) {
        super(name, id, "CO2", value);
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
        return "Sensor name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value + "%";
    }
    
}
