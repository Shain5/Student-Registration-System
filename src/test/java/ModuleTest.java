import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModuleTest {
    Module module;

    @Before
    public void setup(){
        module = new Module("Machine Learning","CT4101");
    }

    @Test
    public void testModuleName(){
        Assert.assertEquals("Machine Learning", module.getModuleName());
    }

    @Test
    public void testModuleID(){
        Assert.assertEquals("CT4101",module.getModuleID());
    }

    @Test
    public void testAddStudents(){
        Student student = new Student("Shain",21, DateTime.parse("11/02/2000", DateTimeFormat.forPattern("dd/MM/yyyy")),"18331093");
        module.addStudents(student);
        Assert.assertTrue(module.getStudents().contains(student));
    }

    @Test
    public void testAddCourses(){
        Course course = new Course("Computer Science",DateTime.parse("01/10/2021",DateTimeFormat.forPattern("dd/MM/yyyy")),DateTime.parse("30/06/2021",DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addCourses(course);
        Assert.assertTrue(module.getCourses().contains(course));
    }
}
