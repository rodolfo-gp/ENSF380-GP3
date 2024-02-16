/*
MedicalRecord.java
Group 15
*/

package edu.ucalgary.oop;
import java.util.regex.*;

public class MedicalRecord {
	private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    private static final String REGEX = "\\d{4}-\\d{2}-\\d{2}"
	private static final Pattern PATTERN = Pattern.compile(REGEX);

    // Constructors
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
		if (location == null || treatmentDetails == null || dateOfTreatment == null) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
        else {
            this.location = location;
            this.treatmentDetails = treatmentDetails;
            this.dateOfTreatment = dateOfTreatment;
        }
    }

    // getters
    public Location getLocation() {
        return location;
    }
    public String getTreatmentDetails() {
        return treatmentDetails;
    }
    public Stirng getDateOfTreatment() {
        return dateOfTreatment;
    }

    // setters
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }
    public void setDateOfTreatment(String dateOfTreatment) {
        if (PATTERN.matcher(dateOfTreatment).matches()) {
            this.dateOfTreatment = dateOfTreatment;
        }
        else {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
    }
}