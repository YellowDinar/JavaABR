import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
    private long id;
    private String firstName;
    private String lastName;

    public Person(){
    }


    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment",strategy="increment")
    @Column(name="id")
    public long getId() {
        return id;
    }

    @Column(name="firstname")
    public String getFirstName(){
        return firstName;
    }

    @Column(name="lastname")
    public String getLastName(){
        return lastName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
