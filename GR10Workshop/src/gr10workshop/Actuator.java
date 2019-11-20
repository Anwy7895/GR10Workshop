package gr10workshop;

import java.util.UUID;

public class Actuator extends Unit {
    protected double value;
    
    public Actuator(String name, UUID id, double value) {
        super(name, id);
        this.value = value;
    }
    
    void setValue(double value) {
        this.value = value;
    }
    
    double getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "Actuator name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
