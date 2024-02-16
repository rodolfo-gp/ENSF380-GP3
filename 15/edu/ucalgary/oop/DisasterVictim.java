package edu.ucalgary.oop;


public class DisasterVictim {
    
    private String firstName;
    private String lastName;
    private String DateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
		if (firstName instanceof String && ENTRY_DATE instanceof String) {
            this.firstName = firstName;
            this.ENTRY_DATE = ENTRY_DATE;
		} else {
			throw new  IllegalArgumentException();
		}
    }

    //SETTERS
    public void setFirstName(String fName) { this.firstName = fName;}
    public void setLastName(String lName) {this.lastName = lName;}
    public void setDateOfBirth(String date) {this.DateOfBirth = date;}
    public void setComments(String comment) {this.comments = comment;}
    public void setASSIGNED_SOCIAL_ID(int id) {this.ASSIGNED_SOCIAL_ID = id;}
    public void setMedicalRecords(MedicalRecord[] records) {this.medicalRecords = records;}
    public void setMedicalRecords(FamilyRelation[] familyRelations) {this.familyConnections = familyRelations;}
    public void setEntry_Date(String ENTRY_DATE) {this.ENTRY_DATE = ENTRY_DATE;}
    public void setPersonalBelongings(Supply[] stuff) {this.personalBelongings = stuff;}
    public void setGender(String gender) {this.gender = gender;}
    public void setCounter(int counter) {this.counter = counter;}

    //Getters
    public String getFirstName() { return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getDateOfBirth() {return this.DateOfBirth;}
    public String getComments() {return this.comments;}
    public int getASSIGNED_SOCIAL_ID() {return this.ASSIGNED_SOCIAL_ID;}
    public MedicalRecord[] getMedicalRecords() {return this.medicalRecords;}
    public FamilyRelation[] getMedicalRecords() {return this.familyConnections;}
    public String getEntry_Date() {return this.ENTRY_DATE;}
    public Supply[] getPersonalBelongings() {return this.personalBelongings;}
    public String getGender() {return this.gender;}
    public int getCounter() {return this.counter;}




 

}
