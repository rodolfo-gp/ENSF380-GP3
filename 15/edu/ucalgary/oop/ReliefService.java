/*
ReliefService.java
Group 15
*/

package edu.ucalgary.oop;
import java.util.regex.*;

public class ReliefService {
	private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}";
	private static final Pattern PATTERN = Pattern.compile(REGEX);

    // Constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Getters
    public Inquirer getInquirer() {
        return inquirer;
    }
    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }
    public String getDateOfInquiry() {
        return dateOfInquiry;
    }
    public String getInfoProvided() {
        return infoProvided;
    }
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    // Setters
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }
    public void setDateOfInquiry(String dateOfInquiry) {
        if (PATTERN.matcher(dateOfInquiry).matches()) {
            this.dateOfInquiry = dateOfInquiry;
        }
        else {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
    }
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() +
               ", Missing Person: " + missingPerson.getFirstName() +
               ", Date of Inquiry: " + dateOfInquiry +
               ", Info Provided: " + infoProvided +
               ", Last Known Location: " + lastKnownLocation.getName();
    }
}