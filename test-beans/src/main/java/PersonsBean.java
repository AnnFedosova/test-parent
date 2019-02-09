import mapper.Person;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "personsBean", eager = true)
public class PersonsBean {

    private String fullName = "Niccccc";


    public String getMessage() {
        return "Hello PersonBean!";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    //private PersonDAO personDAO;
    private List<Person> persons;
    private Person person;


    public PersonsBean()
    {
        PersonDAO personDAO = new PersonDAO();
        persons = personDAO.getPersons();
        person = personDAO.getPersonById(1);
    }

    public List<Person> getPersons() {
        return persons;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
