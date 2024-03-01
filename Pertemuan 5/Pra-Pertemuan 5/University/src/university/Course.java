package university;

/**
 *
 * @author U53R
 */
public class Course {
    private int id;
    private String name;
    private int duration;

    public Course(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", name=" + name + ", Duration=" + duration +  '}';
    }     
            
}
