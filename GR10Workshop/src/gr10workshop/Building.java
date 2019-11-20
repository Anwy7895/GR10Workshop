package gr10workshop;

import java.util.HashMap;
import java.util.UUID;

public class Building extends Unit {
    private HashMap<String, Sensor> sensors;
    private HashMap<String, Actuator> actuators;
    
    public Building(String name, UUID id) {
        super(name, id);
        sensors = new HashMap<>();
        actuators = new HashMap<>();
    }
    
    public HashMap<String, Sensor> getSensors() {
        return sensors;
    }
    
    public HashMap<String, Actuator> getActuators() {
        return actuators;
    }
    
    public void addSensor(Sensor sensor) {
        sensors.put(sensor.getName(), sensor);
    }
    
    public void removeSensor(String name) {
        sensors.remove(name);
    }
    
    public void addActuator(Actuator actuator) {
        actuators.put(actuator.getName(), actuator);
    }
    
    public void removeActuator(String name) {
        actuators.remove(name);
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Id: " + this.getId();
    }
}
