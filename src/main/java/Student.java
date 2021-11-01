import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;


public class Student {
    private String Name;
    private int Age;
    private DateTime DOB;
    private String ID;
    protected List<Module> modules;
    protected List<Course> courses;

    public Student(String Name, int Age,DateTime DOB,String ID){
        this.Name = Name;
        this.Age = Age;
        this.DOB = DOB;
        this.ID = ID;
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Student(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Name+ID;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModules(Module module) {
        modules.add(module);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        courses.add(course);
        course.addStudents(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", DOB=" + DOB +
                ", ID='" + ID + '\'' +
                ", modules=" + modules +
                ", courses=" + courses +
                '}';
    }
}
