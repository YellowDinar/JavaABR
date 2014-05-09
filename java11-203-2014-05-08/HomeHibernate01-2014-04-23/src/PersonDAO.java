import java.sql.SQLException;
import java.util.List;

public interface PersonDAO {
    public void addPerson(Person student) throws SQLException;   //добавить студента
    public void updatePerson(Person student) throws SQLException;//обновить студента
    public Person getPersonById(Long id) throws SQLException;    //получить стедента по id
    public List<Person> getAllPersons() throws SQLException;              //получить всех студентов
    public void deletePerson(Person student) throws SQLException;//удалить студента
}
