package edu.dsc.hotelreservation.model;

/**
 *
 * @author felix
 */
public class StaffMember{
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
    private int staffId;

    // Constructors
    public StaffMember(String firstName, String lastName, String email, String phoneNumber, int SIN, String citizenshipStatus, String unitNumber, String streetAddress, String city, String postalCode, String country, int createdBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.SIN = SIN;
        this.citizenshipStatus = citizenshipStatus;
        this.unitNumber = unitNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.createdBy = createdBy;
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

    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    
}
