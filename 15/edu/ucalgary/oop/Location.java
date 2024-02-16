package edu.ucalgary.oop;

//Location Class: 

public class Location {

    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    // Constructor:

    public Location(String name, String address) {

        if (name == null || address == null) {
            throw new IllegalArgumentException("Illegal Arugument Exception");
        }
        this.name = name;
        this.address = address;
    }

    // Setters:

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    public void setSupply(Supply[] supplies) {
        this.supplies = supplies;
    }

    // Getters:

    public String getname() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public DisasterVictim[] getOccupants() {
        return this.occupants;
    }

    public Supply[] getSupplies() {
        return this.supplies = supplies;
    }

    // Other Functions/Methods:

    public void addOccupant(DisasterVictim occupant) {

    }

    public void removeOccupant(DisasterVictim occupant) {

    }

    public void addSupply(Supply supply) {

    }

    public void removeSupply(Supply supply) {

    }

}
