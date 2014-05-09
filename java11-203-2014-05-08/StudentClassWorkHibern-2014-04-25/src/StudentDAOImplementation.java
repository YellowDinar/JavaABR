import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import java.util.List;

/**
 * Created by ma on 25.04.14.
 */
public class StudentDAOImplementation implements StudentDAOInterface{

    @Override
    public List<Student> getStudentOfYear(int year1, int year2) {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();

        List<Student> studs = s.createCriteria(Student.class).add(
                Expression.ge("year", year1)
                ).add(
                Expression.le("year", year2)
                ).list();


        s.getTransaction().commit();
        s.close();
        return studs;
    }
}
