package gr10workshop;

import java.util.HashMap;

public class GR10Workshop {

    public static void main(String[] args) {
        BuildingAdmin admin = new BuildingAdmin();
        
        Building tek = new Building("TEK", 1);
        
        TemperatureSensor tempSensor = new TemperatureSensor("Temperature sensor", 1, 23.0);
        tempSensor.setValue(20.0);
        tek.addSensor(tempSensor);
        
        Co2Sensor co2 = new Co2Sensor("CO2 sensor", 2, 25);
        tek.addSensor(co2);
        
        VentilationActuator ventilation = new VentilationActuator("Ventilation actuator", 3, 45.0);
        ventilation.setValue(90.0);
        tek.addActuator(ventilation);
        
        admin.addBuilding(tek);
        
        for (String name : admin.getBuildings().keySet()) {
            Building building = admin.getBuildings().get(name);
            
            System.out.println(building.toString());
            
            HashMap<String, Sensor> sensors = building.getSensors();   
            for (String sensorName : sensors.keySet()) {
                System.out.println(sensors.get(sensorName).toString());
            }
            
            HashMap<String, Actuator> actuators = building.getActuators();
            for (String actuatorName : actuators.keySet()) {
                System.out.println(actuators.get(actuatorName).toString());
            }
            
            System.out.println("");
        }
    }
    
}
