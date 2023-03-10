package org.example.builder;

public class Person {

    private String firstName;
    private  String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String facebookId;
    private String gender;
    private String linkedInId;
    private String dateOfBirth;

    private String country;

    public Person(String firstName, String lastName, String email, String phoneNumber, String address, String facebookId, String gender, String linkedInId, String dateOfBirth, String country ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.facebookId = facebookId;
        this.gender = gender;
        this.linkedInId = linkedInId;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("First Name: ").append(firstName).append("\n").append("Last Name: ").append(lastName).toString();
    }
}
