//import java.util.List;

import java.util.Date;

public class Person {
    private Long id;
    private String fullName;
    private Date birthDay;
    private char gender; // "m" or "f"

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Date getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    /*public List<Connection> getConnections() {
        return connections;
    }
    */
}

