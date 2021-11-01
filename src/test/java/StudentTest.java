import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;
    @Before
    public void setUp() {
        student = new Student("Shain",21, DateTime.parse("11/02/2000",DateTimeFormat.forPattern("dd/MM/yyyy")),"18331093");
    }

    @Test
    public void testStudentName() {
        Assert.assertEquals("Shain",student.getName());
    }

    @Test
    public void testStudentAge() {
        Assert.assertEquals(21,student.getAge());
    }

    @Test
    public void testDOB(){Assert.assertEquals(DateTime.parse("11/02/2000",DateTimeFormat.forPattern("dd/MM/yyyy")),student.getDOB());}

    @Test
    public void testStudentID(){Assert.assertEquals("18331093",student.getID());}

    @Test
    public void testStudentUserName(){Assert.assertEquals("Shain18331093",student.getUsername());}

    @Test
    public void testAddModules(){
        Module module = new Module("Software Engineering","CT417");
        student.addModules(module);
//        Assert.assertTrue(student.getModules().contains(module));
        Assert.assertFalse(student.getModules().isEmpty());
    }

    @Test
    public void testAddCourses(){
        Course course = new Course("Computer Science",DateTime.parse("01/10/2021",DateTimeFormat.forPattern("dd/MM/yyyy")),DateTime.parse("30/06/2021",DateTimeFormat.forPattern("dd/MM/yyyy")));
        student.addCourses(course);
        Assert.assertTrue(student.getCourses().contains(course));
        Assert.assertFalse(student.getCourses().isEmpty());
    }
}
