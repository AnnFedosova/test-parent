//package test-parent.;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestWork {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        PersonMapper personMapper;
        Reader reader = null;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);

            //Person person1 = personMapper.getPersonById(1);

            Person newPerson = new Person("Nooot Nicolas", new Date(), "f");
            personMapper.addPerson(newPerson);
            List<Person> persons = personMapper.getPerson();

            List<Person> persons1 = personMapper.getPerson();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}