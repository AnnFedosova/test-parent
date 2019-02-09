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

    public PersonDAO(){}
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

/*
    void CommitSession()
    {
        //TODO сделать коммит
        sqlSessionFactory
        this.session.commit();
        this.session.close();
    }*/


    public List<Person> getPersons()
    {
        InitSession();
        List<Person> personList = personMapper.getAllPersons();
        //CommitSession();

        return personList;
    }

    public Person getPersonById(int personId)
    {
        InitSession();
        return personMapper.getPersonById(personId);
    }

    public void addPerson(Person person)
    {
        InitSession();
        personMapper.addPerson(person);
    }
}