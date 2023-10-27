import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Kurs course = new Kurs("hej");
        Student myStudent = new Student("anton", "hemlös och har löss", course);

        myStudent.AddCourseGrade("matte", 1,false);
        myStudent.AddCourseGrade("fysik", 2, true);
        myStudent.AddCourseGrade("svenska", 1, true);
        myStudent.AddCourseGrade("engelska", 1, true);
        myStudent.Printgrades();



    }
}