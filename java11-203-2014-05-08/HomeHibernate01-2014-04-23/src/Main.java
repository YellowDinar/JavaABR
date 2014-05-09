import java.sql.SQLException;

/**
 * Created by ma on 23.04.14.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Person p1 = new Person();

        p1.setFirstName("a5");
        p1.setLastName("b6");

        PersonDAO dao = new PersonDAOImpl();
        dao.addPerson(p1);

    }
}
