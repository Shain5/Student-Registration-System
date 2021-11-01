import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String courseName;
    public DateTime startDate;
    public DateTime endDate;
    protected List<Student> students;
    protected List<Module> modules;

    public Course(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
        student.addCourses(this);
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModules(Module module) {
        modules.add(module);
        module.addCourses(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", students=" + students +
                ", modules=" + modules +
                '}';
    }
}
