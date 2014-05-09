import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ma on 25.04.14.
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    private long id;

    @Column(name="year")
    private int year;

    @Column(name="name")
    private String name;


    @OneToMany(mappedBy="student")
    private List<Exam> exams;


    public Set<Exam> getExams(){
        return exams;
    }

    public Student(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
