package gr10workshop;

public class VentilationActuator extends Actuator {
    public VentilationActuator(String name, int id, double value) {
        super(name, id, value);
    }
    
    @Override
    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
