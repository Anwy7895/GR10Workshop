package gr10workshop;

public class Actuator extends Unit {
    protected double value;
    
    public Actuator(String name, int id, double value) {
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
        return "Name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
