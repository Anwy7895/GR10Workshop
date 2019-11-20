package gr10workshop;

import java.util.HashMap;

public class Building extends Unit {
    private HashMap<String, Sensor> sensors;
    private HashMap<String, Actuator> actuators;
    
    public Building(String name, int id) {
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
    
    void addSensor(Sensor sensor) {
        sensors.put(sensor.getName(), sensor);
    }
    
    void removeSensor(String name) {
        sensors.remove(name);
    }
    
    void addActuator(Actuator actuator) {
        actuators.put(actuator.getName(), actuator);
    }
    
    void removeActuator(String name) {
        actuators.remove(name);
    }
    
    @Override
    public String toString() {
        return "Name: " + this.getName() + " - Id: " + this.getId();
    }
}
