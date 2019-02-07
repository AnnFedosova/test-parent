package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBean2", eager = true)
public class PersonBean2 {

    public String fullName = "Nic2";
    public PersonBean2() {}

    public String getMessage() {
        return "Hello beans.PersonBean2!";
    }

    public String getFullName() {
        return fullName;
    }
}
