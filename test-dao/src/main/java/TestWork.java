//package test-parent.;

import java.io.IOException;
import java.io.Reader;
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
            List<Person> persons = personMapper.getPerson();
            Person person = personMapper.getPersonById(1L);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}