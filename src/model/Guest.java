package abstractuser;

/**
 *
 * @author Edwynne Kalugdan
 */
public class Guest extends User {
    private int SIN;
    private String citizenshipStatus;
    private String hireDate;

    // Constructor
    public Guest(String email, String phoneNumber, String address, String password, int userID, int SIN, String citizenshipStatus, String hireDate) {
        super(email, phoneNumber, address, password, userID);
        this.SIN = SIN;
        this.citizenshipStatus = citizenshipStatus;
        this.hireDate = hireDate;
    }

    @Override
    public void login() {
        System.out.println("Guest logged in with email: " + getEmail());
    }

    @Override
    public void updateInfo(String newEmail, String newPhoneNumber, String newAddress) {
        setEmail(newEmail);
        setPhoneNumber(newPhoneNumber);
        setAddress(newAddress);
        System.out.println("Guest information updated.");
    }

    // Guest-specific methods
    public void checkInGuest(int bookingNumber) {
        System.out.println("Guest checked in with booking number: " + bookingNumber);
    }

    public void checkOutGuest(int bookingNumber) {
        System.out.println("Guest checked out with booking number: " + bookingNumber);
    }

    public void updateRoom(int bookingNumber) {
        System.out.println("Room updated for booking number: " + bookingNumber);
    }

    public void viewRoomAvailability() {
        System.out.println("Displaying room availability...");
    }

    // Getters and setters
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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

