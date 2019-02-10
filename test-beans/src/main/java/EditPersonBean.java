import mapper.Person;
import org.primefaces.PrimeFaces;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.HashMap;
import java.util.Map;

@ManagedBean(name = "editPersonBean")
@ApplicationScoped
public class EditPersonBean {
    private Person person;

    public EditPersonBean(){
        person = new Person();
    }

    public EditPersonBean(Person person){
        this.person = person;
    }

    public void editPersonButtonAction(){
        Map<String,Object> options = new HashMap<>();
        options.put("resizable", true); //тянуть мышкой за угол, чтоб изменить размер
        PrimeFaces.current().dialog().openDynamic("editPerson", options, null); //открыть диалоговое окно
    }

    public void editPersonButtonAction(Person person){
        this.person = person;
        Map<String,Object> options = new HashMap<>();
        options.put("resizable", true); //тянуть мышкой за угол, чтоб изменить размер
        PrimeFaces.current().dialog().openDynamic("editPerson", options, null); //открыть диалоговое окно
        this.person = person;
    }

    public void editPerson(){
        PersonDAO personDAO = new PersonDAO();
        personDAO.editPerson(person);
        PrimeFaces.current().dialog().closeDynamic("editPerson");
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
