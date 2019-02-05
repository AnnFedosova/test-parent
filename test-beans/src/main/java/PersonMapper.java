import java.util.List;

public interface PersonMapper {

    //вернет одного пользователя по id;
    Person getPersonById(Integer id);

    //вернет список пользователей;
    List<Person> getPerson();

    void addPerson(Person newPerson);
}