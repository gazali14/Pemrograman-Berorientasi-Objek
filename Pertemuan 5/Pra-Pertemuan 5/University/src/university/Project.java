package university;

/**
 *
 * @author U53R
 */
import java.time.LocalDate;
public class Project {
    private String name;
    private LocalDate start;
    private LocalDate end;

    public Project(String name, LocalDate start, LocalDate end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
    
     @Override
    public String toString() {
        return "Project{" + "name=" + name + ", start=" + start +", end=" + end +'}';
    }
}
