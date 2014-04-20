import java.util.Collection;

/**
 * Created by ma on 11.04.14.
 */
public class Progger implements Performer {

    private Collection<Program> programs;
    private String name;

    @Override
    public void perform() {
        for (Program program : programs)
            System.out.println(name + " is writing program: " + program.show());
    }

    public void setPrograms(Collection<Program> programs) {
        this.programs = programs;
    }

    public void setName(String name) {
        this.name = name;
    }
}
