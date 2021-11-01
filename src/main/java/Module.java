import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private String moduleID;
    //List of Students
    protected List<Student> students;
    protected List<Course> courses;

    public Module(String moduleName, String moduleID){
        this.moduleID = moduleID;
        this.moduleName = moduleName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student){
        students.add(student);
        student.addModules(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course) {
        courses.add(course);
        course.addModules(this);
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleName='" + moduleName + '\'' +
                ", moduleID='" + moduleID + '\'' +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }
}
