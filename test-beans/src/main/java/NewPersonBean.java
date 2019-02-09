import mapper.Person;
import org.primefaces.PrimeFaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.HashMap;
import java.util.Map;

@ManagedBean(name = "newPersonBean")
@ViewScoped //bean lives as long as the view itself
public class NewPersonBean {
    private Person person;

    public NewPersonBean(){
        person = new Person();
    }

    public NewPersonBean(Person person){
        this.person = person;
    }

    public void newPersonButtonAction(){
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", true); //тянуть мышкой за угол, чтоб изменить размер
        PrimeFaces.current().dialog().openDynamic("newPerson", options, null); //открыть диалоговое окно
    }

    public void addNewPerson(){
        PersonDAO personDAO = new PersonDAO();
        personDAO.addPerson(person);
    }

    public Person getPerson() {
        return person;
    }


}
