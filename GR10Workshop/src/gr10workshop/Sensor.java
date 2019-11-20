package gr10workshop;

public class Sensor extends Unit {
    protected double value;
    protected String type;
    
    public Sensor(String name, int id, String type, double value) {
        super(name, id);
        this.type = type;
        this.value = value;
    }
    
    String getType() {
        return type;
    }
    
    double getValue() {
        return value;
    }
    
    void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
