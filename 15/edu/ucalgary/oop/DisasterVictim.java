package edu.ucalgary.oop;
import java.util.regex.*;


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
    private static int counter = 0;

    final String dateFormatRegex = "\\d{4}-\\d{2}-\\d{2}";

    public DisasterVictim() {
      this.personalBelongings = new Supply[0];
      this.familyConnections = new FamilyRelation[0];
      this.ASSIGNED_SOCIAL_ID = counter;
      counter++;
    }
    public static boolean isValidDateFormat(String date, String regex) {
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(date);
      return matcher.matches();
    }

    public DisasterVictim(String firstName, String date) throws IllegalArgumentException {
		if (firstName instanceof String && isValidDateFormat(date, dateFormatRegex)) {
            this.firstName = firstName;
            this.ENTRY_DATE = date;
            this.personalBelongings = new Supply[0];
            this.familyConnections = new FamilyRelation[0];
            this.ASSIGNED_SOCIAL_ID = counter;
            counter++;

		} else {
			throw new  IllegalArgumentException();
		}
    }

    //SETTERS
    public void setFirstName(String fName) { this.firstName = fName;}
    public void setLastName(String lName) {this.lastName = lName;}
    public void setDateOfBirth(String date) throws IllegalArgumentException {
      if(isValidDateFormat(date, dateFormatRegex)) {
          this.DateOfBirth = date;
      } else {
          throw new IllegalArgumentException();
      }
    }
    public void setComments(String comment) {this.comments = comment;}
    public void setAssignedSocialID(int id) {this.ASSIGNED_SOCIAL_ID = id;}
    public void setMedicalRecords(MedicalRecord[] records) {this.medicalRecords = records;}
    public void setFamilyConnections(FamilyRelation[] familyRelations) {this.familyConnections = familyRelations;}
    public void setEntryDate(String ENTRY_DATE) {this.ENTRY_DATE = ENTRY_DATE;}
    public void setPersonalBelongings(Supply[] stuff) {this.personalBelongings = stuff;}
    public void setGender(String gender) {this.gender = gender;}
    public void setCounter(int counter) {this.counter = counter;}

    public void addPersonalBelonging(Supply supply) {
      Supply[] newBelongings = new Supply[this.personalBelongings.length + 1];
      
      // Copy existing belongings to the new array
      for (int i = 0; i < this.personalBelongings.length; i++) {
          newBelongings[i] = this.personalBelongings[i];
      }
  
      // Add the new supply object at the end of the new array
      newBelongings[newBelongings.length - 1] = supply;
  
      // Update the reference to the new array
      this.personalBelongings = newBelongings;
    }
  
    public void removePersonalBelonging(Supply Supply){

    }
    public void addFamilyConnection(FamilyRelation  FamilyRelation){

    }
    public void removeFamilyConnection(FamilyRelation relationToDelete) {
      // Search for the object in the array
      int indexToDelete = -1;
      for (int i = 0; i < familyConnections.length; i++) {
          if (familyConnections[i] != null && familyConnections[i].equals(relationToDelete)) {
              indexToDelete = i;
              break;
          }
      }
  
      // If the object was found, delete it
      if (indexToDelete != -1) {
          // Create a new array with one less element
          FamilyRelation[] newArray = new FamilyRelation[familyConnections.length - 1];
  
          // Copy elements from the original array to the new array, skipping the element at the indexToDelete
          int newIndex = 0;
          for (int i = 0; i < familyConnections.length; i++) {
              if (i != indexToDelete) {
                  newArray[newIndex] = familyConnections[i];
                  newIndex++;
              }
          }
  
          // Update the reference to the new array
          this.familyConnections = newArray;
      }
    }
  
    public void addMedicalRecord(MedicalRecord MedicalRecord){

    }


    //Getters
    public String getFirstName() { return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getDateOfBirth() {return this.DateOfBirth;}
    public String getComments() {return this.comments;}
    public int getAssignedSocialID() {return this.ASSIGNED_SOCIAL_ID;}
    public MedicalRecord[] getMedicalRecords() {return this.medicalRecords;}
    public FamilyRelation[] getFamilyConnections() {return this.familyConnections;}
    public String getEntryDate() {return this.ENTRY_DATE;}
    public Supply[] getPersonalBelongings() {return this.personalBelongings;}
    public String getGender() {return this.gender;}
    public int getCounter() {return this.counter;}

}
