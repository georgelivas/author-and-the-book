package com.glivas.user;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name:\t"
                + getName()
                + "\nemail:\t"
                + getEmail()
                + "\nGender:\t"
                + getGender()
                + "\n\n";
    }
}
