package edu.guilford;

public class Individual {

    private String firstName;
    private String lastName;
    private String emailAddy;
    private String avatarImageLocation;

    public Individual(String firstName, String lastName, String emailAddy, String avatarImageLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddy = emailAddy;
        this.avatarImageLocation = avatarImageLocation;
    }

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

    public String getEmailAddy() {
        return emailAddy;
    }

    public void setEmailAddy(String emailAddy) {
        this.emailAddy = emailAddy;
    }

    public String getAvatarImageLocation() {
        return avatarImageLocation;
    }

    public void setAvatarImageLocation(String avatarImageLocation) {
        this.avatarImageLocation = avatarImageLocation;
    }

    @Override
    public String toString() {
        return "Individual [firstName=" + firstName + ", lastName=" + lastName + ", emailAddy=" + emailAddy + "]";
    }

    
    
}
