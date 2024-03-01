package university;
/**
 * @author U53R
 */
public class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private int teachingHours;
    
    public ResearchAssociate(int ssNo, String name, String email, int counter, String fieldOfStudy, int teachingHours) {
        super(ssNo, name, email, counter);
        this.fieldOfStudy = fieldOfStudy;
        this.teachingHours = teachingHours;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }
    
    @Override
    public double attendence(){
        return ((double)teachingHours/240*100);
    }
    
    @Override
    public String toString() {
        return "ResearchAssociate{"+super.toString()+ "fieldOfStudy=" 
                + fieldOfStudy + ", teachingHours=" + teachingHours + "}\n";
    }
}
