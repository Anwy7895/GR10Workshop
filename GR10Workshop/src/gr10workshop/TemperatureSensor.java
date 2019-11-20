package gr10workshop;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(String name, int id, double value) {
        super(name, id, "Temperature sensor", value);
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
        return "Name: " + this.getName() + " - Id: " + this.getId() + " - Value: " + this.value;
    }
}
