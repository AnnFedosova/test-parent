package mapper;

import java.util.List;

public interface PersonMapper {

    //вернет одного пользователя по id;
    mapper.Person getPersonById(Integer id);

    //вернет список пользователей;
    List<mapper.Person> getAllPersons();

    void addPerson(mapper.Person newPerson);

    void deletePersonById(int personId);
}