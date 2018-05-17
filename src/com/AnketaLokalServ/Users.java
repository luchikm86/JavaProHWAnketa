package com.AnketaLokalServ;

public class Users {
    private String firstName;
    private String lastName;
    private String sex;    //1 - male; 0 - female
    private String java;   //1 - yes; 0 - no
    private String smoke;   //1 - yes; 0 - no
    private String beer;    //1 - yes; 0 - no

    public Users(String firstName, String lastName, String sex, String java, String smoke, String beer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.java = java;
        this.smoke = smoke;
        this.beer = beer;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", java='" + java + '\'' +
                ", smoke='" + smoke + '\'' +
                ", beer='" + beer + '\'' +
                '}';
    }

}
