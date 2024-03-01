package university;

/**
 *
 * @author U53R
 */
import java.time.LocalDate;
import java.util.ArrayList;
public class University {
    public static void main(String[] args) {
        // Creating instances of Employee
        AdministrativeEmployee LaOde = new AdministrativeEmployee(25, 123456, "La Ode", "laode@gmail.com", 100);
        LaOde.setRoutineAttendence(27);
        System.out.format("Persentase kehadiran La Ode dalam sebulan = %.2f\n\n",LaOde.attendence());
        
        ResearchAssociate Gazali = new ResearchAssociate(1, "Gazali", "gazali@gmail.com", 200, "Computer Science", 40);
        System.out.println(Gazali.toString());
        
        ResearchAssociate Lamuga = new ResearchAssociate(2, "Lamuga", "lamuga@gmail.com", 180, "Statistics", 35);
        System.out.println(Lamuga.toString());
        
        // Creating instances of Course
        Lecture lecture = new Lecture(new ArrayList<>(), "Computer Science", 40, 789012, "Jane Smith", "jane@example.com", 200);
        Course course1 = new Course(1, "Java Programming", 16);
        Course course2 = new Course(2, "Data Structures", 20);
        System.out.println(course1);
        System.out.println(course2);
        
        // Adding courses to Lecture
        lecture.getCourses().add(course1);
        lecture.getCourses().add(course2);
        System.out.println(lecture);
      
        // Creating instance of Project
        LocalDate projectStart = LocalDate.of(2024, 1, 1);
        LocalDate projectEnd = LocalDate.of(2024, 6, 30);
        Project project = new Project("Research Project", projectStart, projectEnd);
        System.out.println(project.toString());
    }
    
}
