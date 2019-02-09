package mapper;

import java.util.Date;

public class Person {
    private Integer id;
    private String fullName;
    private Date birthDay;
    private String gender; // "m" or "f"

    public Person(Integer id, String fullName, java.util.Date birthDay, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public Person(){};

    public Person(String fullName, java.util.Date birthDay, String gender) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public Person(Integer id, String fullName, java.sql.Date birthDay, String gender) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


}

