import mapper.Person;
import mapper.PersonMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestWork {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        PersonMapper personMapper;
        Reader reader = null;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);
            List<Person> persons = personMapper.getAllPersons();
            Person person = personMapper.getPersonById(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}