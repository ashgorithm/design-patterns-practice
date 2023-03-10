package org.example.builder;

public class PersonBuilder {

    private String firstName;
    private  String lastName;
    private String email = "";
    private String phoneNumber = "";
    private String address = "";
    private String facebookId = "";
    private String gender = "";
    private String linkedInId = "";
    private String dateOfBirth = "";
    private String country = "";

    public PersonBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public PersonBuilder setFacebookId(String facebookId){
        this.facebookId = facebookId;
        return this;
    }

    public PersonBuilder setGender(String gender){
        this.gender = gender;
        return this;
    }

    public PersonBuilder setLinkedInId(String linkedInId){
        this.linkedInId = linkedInId;
        return this;
    }

    public PersonBuilder setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PersonBuilder setCountry(String country){
        this.country = country;
        return this;
    }

    public Person getResult(){
        return new Person(firstName, lastName, email, phoneNumber, address, facebookId, gender, linkedInId, dateOfBirth, country);
    }

    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
