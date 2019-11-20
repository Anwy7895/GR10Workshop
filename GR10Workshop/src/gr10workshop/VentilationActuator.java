package gr10workshop;

import java.util.UUID;

public class VentilationActuator extends Actuator {
    public VentilationActuator(String name, UUID id, double value) {
        super(name, id, value);
    }
    
    @Override
    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Actuator name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
