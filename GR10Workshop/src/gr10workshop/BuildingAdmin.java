package gr10workshop;

import java.util.Map;
import java.util.UUID;
import java.util.HashMap;
import java.util.Random;

public class BuildingAdmin implements IBuildingManagementSystem {

    private HashMap<String, Building> buildings;

    public BuildingAdmin() {
        buildings = new HashMap<>();
    }

    public HashMap<String, Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.put(building.getName(), building);
    }

    public void removeBuilding(String name) {
        buildings.remove(name);
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> tempMap = new HashMap<>();
        
        for (String buildingKey : buildings.keySet()) {
            Building currentBuilding = buildings.get(buildingKey);
            tempMap.put(currentBuilding.getId(), currentBuilding.getName());
        }
        
        return tempMap;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> tempMap = new HashMap<>();
        
        for (String buildingKey : buildings.keySet()) {
            Building currentBuilding = buildings.get(buildingKey);
            
            if (currentBuilding.getId() != buildingId) {
                continue;
            }
            
            for (String sensorKey : currentBuilding.getSensors().keySet()) {
                Sensor currentSensor = currentBuilding.getSensors().get(sensorKey);
                tempMap.put(currentSensor.getId(), currentSensor.toString());
            }
        }
        
        return tempMap;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> tempMap = new HashMap<>();
        
        for (String buildingKey : buildings.keySet()) {
            Building currentBuilding = buildings.get(buildingKey);
            
            if (currentBuilding.getId() != buildingId) {
                continue;
            }
            
            for (String actuatorKey : currentBuilding.getActuators().keySet()) {
                Actuator currentActuator = currentBuilding.getActuators().get(actuatorKey);
                tempMap.put(currentActuator.getId(), currentActuator.getName());
            }
        }
        
        return tempMap;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        Building currentBuilding = null;

        for (String building : buildings.keySet()) {
            UUID tempBuildingId = buildings.get(building).getId();

            if (tempBuildingId == buildingId) {
                currentBuilding = buildings.get(building);
                break;
            }
        }

        UUID sensorId = UUID.randomUUID();        
        TemperatureSensor sensor = new TemperatureSensor("Temperature sensor", sensorId, 23.0);

        if (currentBuilding != null) {
            currentBuilding.addSensor(sensor);
        } else {
            System.out.println("Did not find building with id: " + buildingId + "!");
        }

        return sensorId;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        Building currentBuilding = null;

        for (String building : buildings.keySet()) {
            UUID tempBuildingId = buildings.get(building).getId();

            if (tempBuildingId == buildingId) {
                currentBuilding = buildings.get(building);
                break;
            }
        }

        UUID sensorId = UUID.randomUUID();
        Co2Sensor sensor = new Co2Sensor("CO2 sensor", sensorId, 20);

        if (currentBuilding != null) {
            currentBuilding.addSensor(sensor);
        } else {
            System.out.println("Did not find building with id: " + buildingId + "!");
        }

        return sensorId;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        Building currentBuilding = null;

        for (String building : buildings.keySet()) {
            UUID tempBuildingId = buildings.get(building).getId();

            if (tempBuildingId == buildingId) {
                currentBuilding = buildings.get(building);
                break;
            }
        }

        if (currentBuilding != null) {
            for (String sensorName : currentBuilding.getSensors().keySet()) {
                Sensor tempSensor = currentBuilding.getSensors().get(sensorName);
                if (tempSensor.getId() == sensorId) {
                    currentBuilding.removeSensor(sensorName);
                    break;
                }
            }
        }
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        Building currentBuilding = null;

        for (String building : buildings.keySet()) {
            UUID tempBuildingId = buildings.get(building).getId();

            if (tempBuildingId == buildingId) {
                currentBuilding = buildings.get(building);
                break;
            }
        }
        
        UUID actuatorId = UUID.randomUUID();
        VentilationActuator ventilation = new VentilationActuator("Ventilation actuator", actuatorId, 45);
        
        if (currentBuilding != null) {
            currentBuilding.addActuator(ventilation);
        }
        else {
            System.out.println("Did not find building with id: " + buildingId + "!");
        }
        
        return actuatorId;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        Building currentBuilding = null;

        for (String building : buildings.keySet()) {
            UUID tempBuildingId = buildings.get(building).getId();

            if (tempBuildingId == buildingId) {
                currentBuilding = buildings.get(building);
                break;
            }
        }

        if (currentBuilding != null) {
            for (String actuatorName : currentBuilding.getActuators().keySet()) {
                Actuator tempActuator = currentBuilding.getActuators().get(actuatorName);
                if (tempActuator.getId() == actuatorId) {
                    currentBuilding.removeActuator(actuatorName);
                    break;
                }
            }
        }
    }
}
