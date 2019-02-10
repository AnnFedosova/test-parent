import mapper.Person;
import mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class PersonDAO {

    private PersonMapper personMapper;

    public PersonDAO(){
        InitSession();
    }
    private SqlSessionFactory sqlSessionFactory;
    Reader reader = null;

    private void InitSession()
    {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            personMapper = sqlSessionFactory.openSession(true).getMapper(PersonMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getPersons()
    {
        List<Person> personList = personMapper.getAllPersons();
        return personList;
    }

    public Person getPersonById(int personId)
    {
        return personMapper.getPersonById(personId);
    }

    void addPerson(Person person)
    {
        personMapper.addPerson(person);
    }

    void deletePersonById(int personId)
    {
        personMapper.deletePersonById(personId);
    }

    void editPerson(Person person){
        personMapper.editPerson(person);
    }

}