public class Student {
    // Attributes
    private String name;
    private String address;
    private int numCourses= 0;
    private String[] courses = new String[30];
    private boolean[] setGrades = new boolean[30];
    private int[] grades = new int[30];

    //Constructors

    // Skapa en elev med namn och adress
    public Student(String name, String address, Kurs course){
        this.name = name;
        this.address = name;
        course.AddStudent(this);
    }

    // Skriver ut namn och adress på eleven
    public String toString(){
        return (name + " (" + address + ")");
    }

    // Lägger till betyg till kurserna
    public void AddCourseGrade(String course, int grade, boolean setGrade){
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                setGrades[i] = setGrade;
                if(setGrades[i]) {
                    grades[i] = grade;
                }
                break;
            }
        }
    }

     // Skriver ut betygen till kurserna
    public void Printgrades(){
        System.out.print(name + ": ");
        for (int i = 0; i < courses.length; i++){
            if(courses[i] != null){
                if (setGrades[i]){
                    System.out.print(" " + courses[i] + ":" + grades[i] + " ");
                } else {
                    System.out.print(" " + courses[i] + ": not set");
                }
            } else {
                break;
            }
        }
        System.out.println();
    }

    // Skriver ut medelvärdet på betygen
    public double printAvarageGrades(){
        double total = 0;
        int count = 0;

        for(int i=0; i < courses.length; i++){
            if (courses[i] != null){
                total += grades[i];
                count++;
            }
            else{
                break;
            }
        }
        return total/count;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
