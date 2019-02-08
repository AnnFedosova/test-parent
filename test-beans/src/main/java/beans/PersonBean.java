package beans;

import dao.PersonDAO;
import mapper.Person;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "personBean", eager = true)
public class PersonBean {

    private String fullName = "Niccccc";
    //public PersonBean() {}

    public String getMessage() {
        return "Hello PersonBean!";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private PersonDAO personDAO;
    private List<Person> persons;
    private Person specialPersonForTest;


    public PersonBean()
    {
        personDAO = new PersonDAO();
        //persons = personDAO.getPersonById(1);
        specialPersonForTest = personDAO.getPersonById(1);
    }



   /*private PersonDAO personDAO;
    private List<Person> persons;

    public PersonBean()
    {
        personDAO = new PersonDAO();
        persons = personDAO.getAllPersons();
    }

    public List<Person> getPersons()
    {
        return persons;
    }

*/

}
