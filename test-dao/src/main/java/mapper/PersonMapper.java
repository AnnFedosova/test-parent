package mapper;

import java.util.List;

public interface PersonMapper {

    mapper.Person getPersonById(Integer id);

    List<mapper.Person> getAllPersons();

    void addPerson(mapper.Person newPerson);

    void deletePersonById(int personId);

    void updatePerson(Person person);
}