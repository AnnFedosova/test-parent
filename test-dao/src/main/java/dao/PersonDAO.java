package dao;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import static org.apache.ibatis.io.Resources.getResourceAsReader;

public class PersonDAO {

    private PersonMapper personMapper;

    public PersonDAO(){}

    private void InitSession()
    {

        try {
            Reader reader = null;
            reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            //Reader reader = getResourceAsReader("/mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    void CommitSession()
    {
        //TODO сделать коммит
        //sqlSessionFactory.getConfiguration();
        //this.session.commit();
        //this.session.close();
    }
*/

    public List<Person> getAllPersons()
    {
        InitSession();
        List<Person> personList = personMapper.getAllPersons();
        //CommitSession();

        return personList;
    }

    public Person getPersonById(int personId)
    {
        //personId = 1;
        InitSession();
        Person person = personMapper.getPersonById(personId);
        //CommitSession();

        return person;
    }


}