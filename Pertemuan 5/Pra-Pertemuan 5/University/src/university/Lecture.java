package university;

import java.util.ArrayList;

public class Lecture extends ResearchAssociate {
    private ArrayList<Course> courses;

    public Lecture(ArrayList<Course> courses, String fieldOfStudy, int teachingHours, int ssNo, String name, String email, int counter) {
        super(ssNo, name, email, counter, fieldOfStudy, teachingHours);
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
    @Override
    public String toString() {
        return "Lecture{" + super.toString() + ", courses=" + courses + '}';
    }
}
