package edu.ucalgary.oop;

//Location Class: 

public class Location {

    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    // Constructor:

    public Location(String name, String address) {

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

    public void setSupplies( Supply[] supplies){
    this.supplies = supplies ;
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
        // Check if occupants array is initialized
        if (occupants != null) {
            // Find the index of the occupant
            int index = -1;
            for (int i = 0; i < occupants.length; i++) {
                if (occupants[i].equals(occupant)) {
                    index = i;
                    break;
                }
            }
            // If occupant found, remove it
            if (index != -1) {
                DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
                System.arraycopy(occupants, 0, newOccupants, 0, index);
                System.arraycopy(occupants, index + 1, newOccupants, index, occupants.length - index - 1);
                occupants = newOccupants;
            }
        }
    }

    public void addSupply(Supply supply) {
        // Check if supplies array is initialized
        if (supplies == null) {
            supplies = new Supply[1];
            supplies[0] = supply;
        } else {
            // Resize supplies array and add supply
            Supply[] newSupplies = new Supply[supplies.length + 1];
            System.arraycopy(supplies, 0, newSupplies, 0, supplies.length);
            newSupplies[supplies.length] = supply;
            supplies = newSupplies;
        }
    }

    public void removeSupply(Supply supply) {
    // Check if supplies array is initialized
    if (supplies != null) {
        // Find the index of the supply
        int index = -1;
    for (int i = 0; i < supplies.length; i++) {
        if (supplies[i].equals(supply)) {
            index = i;
            break;
        }
    }
    // If supply found, remove it
    if (index != -1) {
        Supply[] newSupplies = new Supply[supplies.length - 1];
        System.arraycopy(supplies, 0, newSupplies, 0, index);
        System.arraycopy(supplies, index + 1, newSupplies, index, supplies.length - index - 1);
        supplies = newSupplies;
    }
}
    }
}
