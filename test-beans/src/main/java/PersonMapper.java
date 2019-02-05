import java.util.List;

public interface PersonMapper {

    //вернет одного пользователя по id;
    Person getPersonById(Long id);

    //вернет список пользователей;
    List<Person> getPerson();

}