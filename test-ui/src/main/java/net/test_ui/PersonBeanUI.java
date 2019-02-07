package net.test_ui;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "personBeanUI", eager = true)
public class PersonBeanUI {

    //PersonBean personBean2;
    public String fullName = "Nic";

    public PersonBeanUI() {}

    public String getMessage() {
        return "Hello PersonBeanUI!";
    }

    public String getFullName() {
        return fullName;
    }
}
