package gr10workshop;

import java.util.HashMap;

public class BuildingAdmin {
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
}
