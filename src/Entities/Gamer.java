package Entities;

import java.time.LocalDate;

public class Gamer {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private LocalDate dateOfBirth;
    private long nationalityId;

    public Gamer(String firstName, String lastName, String email, String password,
                 int age, LocalDate dateOfBirth, long nationalityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public Gamer() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }
}
