package gr10workshop;

import java.util.UUID;

public class Unit {
    private String name;
    private UUID id;
    
    public Unit(String name, UUID id) {
        this.name = name;
        this.id = id;
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", " + "id: " + id;
    }
}
