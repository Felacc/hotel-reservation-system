/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felix
 */
public class StaffMember extends User {
    // Name
    private String firstName;
    private String lastName;
    // Contact info
    private String email;
    private String phoneNumber;
    // Address 
    private String unitNumber;
    private String streetAddress;
    private String city;
    private String postalCode;
    private String country;
    // Employment requirements
    private int SIN;
    private String citizenshipStatus;
    // Other info
    private int createdBy; // reference to employee who created the staff member record? if there is one? I think?
    private int userID; // reference to staff member in the users table

    // Constructors
    public StaffMember(String username, String password, String userType) {
        super(username, password, userType);
    }

    public StaffMember(String firstName, String lastName, String email, String phoneNumber, String unitNumber, String streetAddress, String city, String postalCode, String country, int SIN, String citizenshipStatus, int createdBy, int userID, String username, String password, String userType) {
        super(username, password, userType);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.unitNumber = unitNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.SIN = SIN;
        this.citizenshipStatus = citizenshipStatus;
        this.createdBy = createdBy;
        this.userID = userID;
    }
    
    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSIN() {
        return SIN;
    }

    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    public String getCitizenshipStatus() {
        return citizenshipStatus;
    }

    public void setCitizenshipStatus(String citizenshipStatus) {
        this.citizenshipStatus = citizenshipStatus;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
}
