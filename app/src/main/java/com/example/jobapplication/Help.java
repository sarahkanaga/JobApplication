package com.example.jobapplication;

import android.widget.EditText;

public class Help {
    private String firstName;
    private String secondName;
    private String userName;
    private String email;


    public Help(String id, EditText userFirstName, EditText userSecondName, EditText userName, String emailAdress) {
    }


    public Help(String firstName, String secondName, String userName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.userName = userName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
