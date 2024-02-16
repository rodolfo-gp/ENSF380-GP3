package Group_Project_3.ENSF380-GP3.15.edu.ucalgary.oop;

//Location Class: 

public class Location {

    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    // Constructor:

    public Location(String name, String address) {

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
