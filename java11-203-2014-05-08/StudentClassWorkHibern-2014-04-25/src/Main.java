import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List;
import java.util.Map;

/**
 * Created by ma on 25.04.14.
 */
public class Main {


    public static void main(final String[] args) throws Exception {
        StudentDAOInterface dao = new StudentDAOImplementation();
        List<Student> s = dao.getStudentOfYear(1993, 1995);
        for (Student student : s)
            System.out.println(student.getName());
    }
}
