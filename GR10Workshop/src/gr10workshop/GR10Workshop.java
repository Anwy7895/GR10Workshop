package gr10workshop;

import java.util.UUID;

public class GR10Workshop {        
    public static void main(String[] args) {
        BuildingAdmin admin = new BuildingAdmin();
        
        Building tek = new Building("TEK", UUID.randomUUID());
        admin.addBuilding(tek);
        
        for (UUID buildingKey : admin.getBuildingInformation().keySet()) {
            System.out.printf("Name: %s [UUID: %s]%n", admin.getBuildingInformation().get(buildingKey), buildingKey.toString());
        }

        admin.addTemperatureSensor(tek.getId(), "Temperature sensor");
        admin.addCo2Sensor(tek.getId(), "CO2 sensor");
        
        for (UUID sensorKey : admin.getSensorInformation(tek.getId()).keySet()) {
            System.out.println(admin.getSensorInformation(tek.getId()).get(sensorKey));
        }
        
        for (UUID sensorKey : admin.getSensorInformation(tek.getId()).keySet()) {
            String currentSensor = admin.getSensorInformation(tek.getId()).get(sensorKey);
            
            if (!currentSensor.contains("CO2 sensor")) {
                continue;
            }            
            
            admin.removeSensor(tek.getId(), sensorKey);
        }
        
        System.out.println("");
        
        for (UUID sensorKey : admin.getSensorInformation(tek.getId()).keySet()) {
            System.out.println(admin.getSensorInformation(tek.getId()).get(sensorKey));
        }
    }    
}
