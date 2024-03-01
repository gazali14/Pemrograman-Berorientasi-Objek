package university;

/**
 *
 * @author U53R
 */
public class AdministrativeEmployee extends Employee {
    private int routineAttendence;

    public AdministrativeEmployee(int routineAttendence, int ssNo, String name, String email, int counter) {
        super(ssNo, name, email, counter);
        this.routineAttendence = routineAttendence;
    }

    public int getRoutineAttendence() {
        return routineAttendence;
    }

    public void setRoutineAttendence(int routineAttendence) {
        this.routineAttendence = routineAttendence;
    }
    
     @Override
    public double attendence() {
        return ((double)routineAttendence/30*100);
    }

    @Override
    public String toString() {
        return "AdministrativePersonnel{"+ super.toString() 
                + "attendance=" + routineAttendence + '}';
    }
}

