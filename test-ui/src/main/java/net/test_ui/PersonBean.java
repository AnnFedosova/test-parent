package net.test_ui;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "personBean", eager = true)
public class PersonBean {

    //beans.PersonBean2 personBean2;
    public String fullName = "Nic";

    public PersonBean() {}

    public String getMessage() {
        return "Hello PersonBean!";
    }

    public String getFullName() {
        return fullName;
    }
}
