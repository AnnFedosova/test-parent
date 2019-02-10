public class TestWork {

    /*
    public static void main(String[] args) throws IOException {
        //нет коммита, чтоб смотреть изменения - getAllPersons
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
    }*/
}