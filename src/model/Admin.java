/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author kale
 */
interface Admin extends Staff{
    void setSIN();
    void setCitizenshipStatus(String citizenshipStatus);
    void setHireDate(int day, int month, int year);
    
    public void manageStaff(int userID);
    public void manageRoomInfo(int roomNumber);
    public void changeRoomPrice(int roomNumber, float price);
}