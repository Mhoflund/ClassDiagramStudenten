import java.util.ArrayList;

public class Kurs {
    // Attributes
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    // Constructors
    public Kurs(String name){
        this.name = name;
    }

    public void AddStudent(Student student){
        students.add(student);
    }


}
