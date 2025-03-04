package model;

/**
 *
 * @author Edwynne Kalugdan
 */
public abstract class User {
    private String email;
    private String phoneNumber;
    private String address;
    private String password;
    private int userID;

    // Constructor
    public User(String email, String phoneNumber, String address, String password, int userID) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.userID = userID;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void login();
    public abstract void updateInfo(String newEmail, String newPhoneNumber, String newAddress);

    // Getters and setters
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}

