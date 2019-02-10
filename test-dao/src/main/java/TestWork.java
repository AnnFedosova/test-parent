import mapper.Person;
import mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class TestWork {

    public static void main(String[] args) throws IOException {

        SqlSessionFactory sqlSessionFactory;
        PersonMapper personMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);
            Person p = personMapper.getPersonById(66);
            p.setFullName("Evgeny2");
            personMapper.updatePerson(p);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}