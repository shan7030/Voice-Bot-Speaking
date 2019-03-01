package com.example.android.logindemo;

/**
 * Created by Dheeraj_Kamath on 2/10/2018.
 */

public class UserProfile {
    public String userAge;
    public String userEmail;
    public String userName;
    public String userAddress;

    public UserProfile(){
    }

    public UserProfile(String userAge, String userEmail, String userName,String userAddress) {
        this.userAge = userAge;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userAddress=userAddress;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
