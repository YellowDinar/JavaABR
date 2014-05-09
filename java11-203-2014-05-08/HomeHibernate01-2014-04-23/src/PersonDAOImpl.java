import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import org.hibernate.Session;

public class PersonDAOImpl implements PersonDAO {

    public void addPerson(Person stud) throws SQLException {
        Session session = PersonUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(stud);
        
        session.getTransaction().commit();
        session.close();

    }

    public void updatePerson(Person stud) throws SQLException {
        Session session = PersonUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(stud);
        session.getTransaction().commit();

        session.close();

    }

    public Person getPersonById(Long id) throws SQLException {
        Session session = PersonUtil.getSessionFactory().openSession();

        Person stud = (Person) session.load(Person.class, id);
        //load - ленивая версия, если данные нужны сразу - get

        session.close();
        return stud;
    }

    public List<Person> getAllPersons() throws SQLException {
        Session session = PersonUtil.getSessionFactory().openSession();
        List<Person> studs = session.createCriteria(Person.class).list();
        session.close();
        return studs;
    }

    public void deletePerson(Person stud) throws SQLException {
        Session session = PersonUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stud);
        session.getTransaction().commit();
        session.close();

    }
}