package edu.ucalgary.oop;

public class FamilyRelation {

    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    //Constructor
    public FamilyRelation(DisasterVictim p1, String relation, DisasterVictim p2) throws IllegalArgumentException{
        if (p1 instanceof DisasterVictim && relation instanceof String && p2 instanceof DisasterVictim) {
            this.personOne = p1;
            this.relationshipTo = relation;
            this.personTwo = p2;
		} else {
			throw new  IllegalArgumentException();
		}
    }

    //SETTERS
    public void setPersonOne(DisasterVictim person) {this.personOne = person;}
    public void setRelationshipTo(String relation) {this.relationshipTo = relation;}
    public void setPersonTwo(DisasterVictim person) {this.personTwo = person;}

    //GETTERS
    public DisasterVictim getPersonOne() {return this.personOne;}
    public String getRelationshipTo() {return this.relationshipTo;}
    public DisasterVictim getPersonTwo() {return this.personTwo;}

}
