import mapper.Person;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "personsBean", eager = true)
@ViewScoped
public class PersonsBean {

    private Person selectedPerson;
    private List<Person> persons;
    private Person person;

    public PersonsBean()
    {
        PersonDAO personDAO = new PersonDAO();
        persons = personDAO.getPersons();
        person = new Person();
        selectedPerson = new Person();
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

    public Person getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(Person selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public void deletePersonButtonAction(){
        PersonDAO personDAO = new PersonDAO();
        personDAO.deletePersonById(selectedPerson.getId());
    }

}
