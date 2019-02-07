package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personBean", eager = true)
public class PersonBean {

    private String fullName = "Niccccc";
    public PersonBean() {}

    public String getMessage() {
        return "Hello PersonBean!";
    }

    public String getFullName() {
        return fullName;
    }
}
