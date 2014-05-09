import javax.persistence.*;

/**
 * Created by ma on 29.04.14.
 */
@Entity
@Table(name="exam")
public class Exam {

    @ManyToOne
    @JoinColumn(name="sid", referencedColumnName="id")
    private Student student;

    public Student getStudent(){
        return student;
    }
}
