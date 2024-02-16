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
        return this.supplies ;
    }

    // Other Functions/Methods:

    public void addOccupant(DisasterVictim occupant) {
    // Check if occupants array is initialized
    if (occupants == null) {
        occupants = new DisasterVictim[1];
        occupants[0] = occupant;
}   else{
    // Resize occupants array and add occupant
        DisasterVictim[] newOccupants = new DisasterVictim[occupants.length + 1];
        System.arraycopy(occupants, 0, newOccupants, 0, occupants.length);
        newOccupants[occupants.length] = occupant;
        occupants = newOccupants;
}


    }

    public void removeOccupant(DisasterVictim occupant) {
        

    }

    public void addSupply(Supply supply) {

    }

    public void removeSupply(Supply supply) {

    }

}
