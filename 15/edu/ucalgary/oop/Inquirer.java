package edu.ucalgary.oop;

// Inquirer Class:

public class Inquirer {

// Private Data Members: 

private String FIRST_NAME ;
private String LAST_NAME ;
private String INFO ;
private String SERVICES_PHONE ;


// Constructor: 

public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO) {

    this.FIRST_NAME = FIRST_NAME ;
    this.LAST_NAME = LAST_NAME ;
    this.SERVICES_PHONE = SERVICES_PHONE ;
    this.INFO = INFO ;

}


// Getters:

public String getFirstName() {return this.FIRST_NAME ;}
public String getLastName() {return this.LAST_NAME ;}
public String getInfo() {return this.INFO ;}
public String getServicesPhone() {return this.SERVICES_PHONE ;}

}
